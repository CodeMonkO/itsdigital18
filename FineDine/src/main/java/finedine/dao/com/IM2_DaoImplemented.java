package main.java.finedine.dao.com;

import java.util.List;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.SignIn;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IM2_DaoImplemented implements IM2_Dao {

	@Autowired
	SessionFactory sessionFactory;

	public List<RestaurantLiveEntity> getFromBookingTable(String restaurantUUID) {
		Query query = null;
		String selectSqlQuery = null;
		selectSqlQuery = "from RestaurantLiveEntity restaurantLiveEntity  where restaurantLiveEntity.uuid = :uuid ";
		query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", restaurantUUID);
		List<RestaurantLiveEntity> list = query.list();
		return list;
	}

	public RestaurantLiveEntity usersTable(UsersEntity record) {
		Query query = null;
		String procSqlQuery = null;
		String uuid = record.getUuid();
		RestaurantLiveEntity restaurantLiveEntity = null;
		for (Object object : getFromBookingTable(uuid)) {
			restaurantLiveEntity = (RestaurantLiveEntity) object;
		}
		if (restaurantLiveEntity.isStatusflag()) {
			sessionFactory.getCurrentSession().save(record);
			procSqlQuery = "CALL restaurantProc(:uuid,:bookedseat) ";
			query = null;
			try {
				query = sessionFactory.getCurrentSession().createSQLQuery(procSqlQuery);
				query.setParameter("uuid", uuid);
				query.setParameter("bookedseat", record.getSeatsbooked());
				query.executeUpdate();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("ALL FULL");
		}
		return restaurantLiveEntity;
	}

	@Override
	public List<UsersEntity> customerTable(String uuid) {
		String selectSqlQuery = "from UsersEntity usersEntity  where usersEntity.uuid = :uuid AND usersEntity.billpayed = :billpayed";
		Query query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", uuid);
		query.setParameter("billpayed", "N");
		List<UsersEntity> list = query.list();
		return list;
	}

	@Override
	public boolean signupTable(RestaurantSignUpFormEntity record) {
		sessionFactory.getCurrentSession().save(record);
		// proc to update enter in live table
		return true;
	}

	@Override
	public RestaurantSignUpFormEntity signInTable(SignIn record) {
		String rmail = record.getEmail();
		String password = record.getPassword();
		String selectSqlQuery = "from RestaurantSignUpFormEntity restaurantSignUpFormEntity  where restaurantSignUpFormEntity.rmail = :rmail and restaurantSignUpFormEntity.password =:password ";
		Query query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("rmail", rmail);
		query.setParameter("password", password);
		List<RestaurantSignUpFormEntity> list = query.list();
		if (list.size() > 0) {
			RestaurantSignUpFormEntity restaurantSignUpFormEntity = list.get(0);
			return restaurantSignUpFormEntity;
		}
		return null;
	}

	public boolean resetPasswordTable(String email, String password) {

		String procSqlQuery = "CALL passwordProc(:password,:email)";
		Query query = null;
		try {
			query = sessionFactory.getCurrentSession().createSQLQuery(procSqlQuery);
			query.setParameter("email", email);
			query.setParameter("password", password);
			query.executeUpdate();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}
}