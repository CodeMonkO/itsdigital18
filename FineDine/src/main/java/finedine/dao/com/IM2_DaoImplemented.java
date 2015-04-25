package main.java.finedine.dao.com;

import java.util.List;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.UsersEntity;

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
}