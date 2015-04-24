package main.java.finedine.dao.com;

import main.java.finedine.entitypojo.com.UsersEntity;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IM2_DaoImplemented implements IM2_Dao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean usersTable(UsersEntity record) {
		sessionFactory.getCurrentSession().save(record);
		String uuid = record.getUuid();
		Query query = null;
		String sqlQuery = null;
		sqlQuery = "CALL restaurantProc(:uuid,:bookedseat) ";
		try {
			query = sessionFactory.getCurrentSession().createSQLQuery(sqlQuery);
			query.setParameter("uuid", uuid);
			query.setParameter("bookedseat", 10);
			query.executeUpdate();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return false;
	}
}