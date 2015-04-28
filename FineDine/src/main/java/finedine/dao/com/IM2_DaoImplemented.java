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

	public RestaurantLiveEntity usersTable(UsersEntity record) {
		Query query = null;
		String selectSqlQuery = null, procSqlQuery = null;
		String uuid = record.getUuid();
		selectSqlQuery = "from RestaurantLiveEntity restaurantLiveEntity  where restaurantLiveEntity.uuid = :uuid ";
		query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", uuid);
		List<Object> list = query.list();
		RestaurantLiveEntity restaurantLiveEntity = null;
		for (Object object : list) {
			restaurantLiveEntity = (RestaurantLiveEntity) object;
		}
		if (restaurantLiveEntity.isStatusflag()) {
			sessionFactory.getCurrentSession().save(record);
			procSqlQuery = "CALL restaurantProc(:uuid,:bookedseat) ";
			query = null;
			try {
				query = sessionFactory.getCurrentSession().createSQLQuery(
						procSqlQuery);
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
	public List<Object> customerTable(String uuid) {
		String selectSqlQuery = "from UsersEntity usersEntity  where usersEntity.uuid = :uuid ";
		Query query = sessionFactory.getCurrentSession().createQuery(
				selectSqlQuery);
		query.setParameter("uuid", uuid);
		List<Object> list = query.list();
		return list;
	}

	@Override
	public boolean signupTable(RestaurantSignUpFormEntity record) {
		sessionFactory.getCurrentSession().save(record);
		return true;
	}

	@Override
	public boolean signInTable(SignIn record) {
		String rmail = record.getEmail();
		String password = record.getPassword();
		String selectSqlQuery = "from RestaurantSignUpFormEntity restaurantSignUpFormEntity  where restaurantSignUpFormEntity.rmail = :rmail and restaurantSignUpFormEntity.password =:password ";
		Query query = sessionFactory.getCurrentSession().createQuery(
				selectSqlQuery);
		query.setParameter("rmail", rmail);
		query.setParameter("password", password);
		List<Object> list = query.list();
		if (list.size() > 0)
			return true;
		else
			return false;
	}

	public boolean resetPasswordTable(String email, String password) {

		String procSqlQuery = "CALL passwordProc(:password,:email)";
		Query query = null;
		try {
			query = sessionFactory.getCurrentSession().createSQLQuery(
					procSqlQuery);
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