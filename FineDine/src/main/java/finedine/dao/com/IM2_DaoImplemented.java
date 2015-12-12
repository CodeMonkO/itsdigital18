package main.java.finedine.dao.com;

import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import main.java.finedine.constants.com.Constants.SqlQueries;
import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UpdateProfileFormEntity;
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
	@Autowired
	public Properties messages;

	public List<RestaurantLiveEntity> getFromBookingTable(String restaurantUUID) {
		Query query = null;
		String selectSqlQuery = null;
		selectSqlQuery = messages.getProperty(SqlQueries.RESTAURANTLIVEENTITY.getSqlQueries());
		query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", restaurantUUID);
		query.setParameter("vdtime", new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()).toString().split(" ")[0]);
		List<RestaurantLiveEntity> list = query.list();
		return list;
	}

	public boolean resetBookingTable(List list) {
		Query query = null;
		String selectSqlQuery = null;
		selectSqlQuery = messages.getProperty(SqlQueries.RESETRESTAURANTLIVEENTITY.getSqlQueries());
		query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		for (Object object : list) {
			String temp = (String) object;
			if (Integer.parseInt(temp) >= 0) {
				temp = temp.replace("+", "P%");
			} else {
				temp = temp.replace("-", "N%");
			}

			query.setParameter("countrytimezone", temp);
			query.setParameter("bookedseat", "0");
			//query.setParameter("statusflag", true);
			query.executeUpdate();
		}
		return true;
	}

	public RestaurantLiveEntity usersTable(UsersEntity users) {
		// Query query = null;
		// String procSqlQuery = null;
		// String uuid = record.getUuid();
		// RestaurantLiveEntity restaurantLiveEntity = null;
		// for (Object object : getFromBookingTable(uuid)) {
		// restaurantLiveEntity = (RestaurantLiveEntity) object;
		// }
		// if (Integer.parseInt(record.getSeatsbooked()) <=
		// Integer.parseInt(restaurantLiveEntity.getMaxseat()) -
		// Integer.parseInt(restaurantLiveEntity.getBookedseat())) {
		// if (record.getBookingmode().equalsIgnoreCase("W")) {
		// sessionFactory.getCurrentSession().save(record);
		// }
		// procSqlQuery =
		// messages.getProperty(SqlQueries.USERSTABLE.getSqlQueries());
		// query = null;
		// try {
		// query =
		// sessionFactory.getCurrentSession().createSQLQuery(procSqlQuery);
		// query.setParameter("uuid", uuid);
		// query.setParameter("bookedseat", record.getSeatsbooked());
		// query.executeUpdate();
		// } catch (HibernateException e) {
		// e.printStackTrace();
		// }
		// } else {
		// System.out.println("ALL FULL");
		// }

		String uuid = users.getUuid();
		Query query = null;
		String sqlQuery = null;
		int seatsUpdated = 0;
		RestaurantLiveEntity restaurantLive = null;
		try {
			sqlQuery = "from UsersEntity users  where users.uuid = :uuid AND users.vdtime LIKE :vdtime AND (users.emailid = :emailid OR users.contactnum = :contactnum)";
			query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
			query.setParameter("uuid", uuid);
			query.setParameter("emailid", users.getEmailid());
			query.setParameter("contactnum", users.getContactnum());
			query.setParameter("vdtime", users.getVdtime().split(" ")[0] + "%");
			List<Object> listOfUsers = query.list();
			
			// Prevents duplicate registration
			if (listOfUsers.size() == 0) {
				
				// Check for restro status for particular date
				sqlQuery = "from RestaurantLiveEntity restaurantLive  where restaurantLive.uuid = :uuid AND restaurantLive.vdtime =:vdtime";
				query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
				query.setParameter("uuid", uuid);
				query.setParameter("vdtime", users.getVdtime().split(" ")[0]);
				List<Object> list = query.list();
				// update restrolive with same date & save users
				if (list.size() == 1) {
					restaurantLive = new RestaurantLiveEntity();
					for (Object object : list) {
						restaurantLive = (RestaurantLiveEntity) object;
					}
					sessionFactory.getCurrentSession().save(users);
					seatsUpdated = Integer.parseInt(restaurantLive.getBookedseat()) + Integer.parseInt(users.getSeatsbooked());
					sqlQuery = "UPDATE RestaurantLiveEntity restaurantLive SET bookedseat=:bookedseat WHERE restaurantLive.uuid =:uuid AND restaurantLive.vdtime =:vdtime";
					query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
					query.setParameter("uuid", uuid);
					query.setParameter("bookedseat", Integer.toString(seatsUpdated));
					query.setParameter("vdtime", users.getVdtime().split(" ")[0]);
					query.executeUpdate();
				} else {// create entry in restrolive with new date & save users
					sqlQuery = "from RestaurantSignUpFormEntity restaurantSignUpFormEntity  where restaurantSignUpFormEntity.uuid = :uuid";
					query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
					query.setParameter("uuid", uuid);
					List<Object> listOfrestaurantSignUpFormEntity = query.list();
					if (listOfrestaurantSignUpFormEntity.size() == 1) {
						RestaurantSignUpFormEntity restaurantSignUpFormEntity = new RestaurantSignUpFormEntity();
						for (Object object : listOfrestaurantSignUpFormEntity) {
							restaurantSignUpFormEntity = (RestaurantSignUpFormEntity) object;
						}
						restaurantLive = new RestaurantLiveEntity();
						restaurantLive.setBookedseat(users.getSeatsbooked());
						restaurantLive.setMaxseat(restaurantSignUpFormEntity.getMaxseat());
						restaurantLive.setUuid(uuid);
						restaurantLive.setVdtime(users.getVdtime().split(" ")[0]);
						sessionFactory.getCurrentSession().save(users);
						sessionFactory.getCurrentSession().save(restaurantLive);
					}
				}
			} else {
				// Mobile pre booked customers update visited status as y
				sqlQuery = "UPDATE UsersEntity users SET visited=:visited where users.uuid = :uuid AND users.bookingid = :bookingid";
				query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
				query.setParameter("uuid", uuid);
				query.setParameter("visited", "Y");
				query.setParameter("bookingid", users.getBookingid());
				query.executeUpdate();
			}
			// Check current restro live seat status
			sqlQuery = "from RestaurantLiveEntity restaurantLive  where restaurantLive.uuid = :uuid AND restaurantLive.vdtime =:vdtime";
			query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
			query.setParameter("uuid", uuid);
			query.setParameter("vdtime", users.getVdtime().split(" ")[0]);
			List<Object> list = query.list();
			if (list.size() == 1) {
				restaurantLive = new RestaurantLiveEntity();
				for (Object object : list) {
					restaurantLive = (RestaurantLiveEntity) object;
				}
			}
		} catch (NumberFormatException | HibernateException e) {
			e.printStackTrace();
		}
		return restaurantLive;
	}

	public void usersTableBillAmount(String uuid, String billAmount, String emailid, String billpayed, String billnum) {
		Query query = null;

		String SqlQuery = messages.getProperty(SqlQueries.USERSTABLEBILLAMOUNT.getSqlQueries());
		query = null;
		try {
			query = sessionFactory.getCurrentSession().createQuery(SqlQuery);
			query.setParameter("uuid", uuid);
			query.setParameter("billamt", billAmount);
			query.setParameter("billpayed", billpayed);
			query.setParameter("emailid", emailid);
			query.setParameter("billnum", billnum);
			query.executeUpdate();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UsersEntity> customerTable(String uuid) {
		String selectSqlQuery = messages.getProperty(SqlQueries.CUSTOMERTABLE.getSqlQueries());
		Query query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		StringTokenizer stringTokenizer = new StringTokenizer(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()).toString(), " ");

		StringBuilder vdtime = new StringBuilder(stringTokenizer.nextElement().toString());
		vdtime.append("%");
		query.setParameter("uuid", uuid);
		query.setParameter("billpayed", "N");
		/* query.setParameter("vdtime", vdtime.toString()); */
		List<UsersEntity> list = query.list();
		return list;
	}

	@Override
	public boolean signupTable(RestaurantSignUpFormEntity record, RestaurantLiveEntity restaurantLiveEntity) {
		String rmail = record.getRmail();
		String selectSqlQuery = messages.getProperty(SqlQueries.SIGNUPTABLE.getSqlQueries());
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
			query.setParameter("rmail", rmail);
			List<RestaurantSignUpFormEntity> list = query.list();
			if (list.size() == 0) {
				sessionFactory.getCurrentSession().save(record);
				sessionFactory.getCurrentSession().save(restaurantLiveEntity);
				return true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public RestaurantSignUpFormEntity signInTable(SignIn record) {
		String rmail = record.getEmail();
		String password = record.getPassword();
		String selectSqlQuery = messages.getProperty(SqlQueries.SIGNINTABLE.getSqlQueries());
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

	@Override
	public RestaurantSignUpFormEntity getRestaurantDetailsFromTable(String restaurantUUID) {
		String selectSqlQuery = messages.getProperty(SqlQueries.GETFROMRESTAURANTTABLE.getSqlQueries());
		Query query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", restaurantUUID);
		List<RestaurantSignUpFormEntity> list = query.list();
		if (list.size() == 1) {
			RestaurantSignUpFormEntity restaurantSignUpFormEntity = list.get(0);
			return restaurantSignUpFormEntity;
		}
		return null;
	}

	public boolean resetPasswordTable(String email, String password) {

		String procSqlQuery = messages.getProperty(SqlQueries.RESETUPDATE.getSqlQueries());
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

	@Override
	public boolean updateRestaurantDetailsFromTable(UpdateProfileFormEntity updateProfileFormEntity, String restaurantUUID) {
		String procSqlQuery = messages.getProperty(SqlQueries.UPDATERESTAURANTTABLE.getSqlQueries());
		Query query = null;
		try {
			query = sessionFactory.getCurrentSession().createSQLQuery(procSqlQuery);
			query.setParameter("uuid", restaurantUUID);
			query.setParameter("rname", updateProfileFormEntity.getRname());
			query.setParameter("rmail", updateProfileFormEntity.getRmail());
			query.setParameter("password", updateProfileFormEntity.getPassword());
			query.setParameter("rcontact", updateProfileFormEntity.getRcontact());
			query.setParameter("altcontact", updateProfileFormEntity.getAltcontact());
			query.setParameter("rtype", updateProfileFormEntity.getRtype());
			query.setParameter("maxseat", updateProfileFormEntity.getMaxseat());
			query.setParameter("otime", updateProfileFormEntity.getOtime());
			query.setParameter("ctime", updateProfileFormEntity.getCtime());
			query.setParameter("rating", updateProfileFormEntity.getRating());
			query.setParameter("menufilelocation", updateProfileFormEntity.getMenufilelocation());
			query.executeUpdate();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public UsersEntity usersTableBillAmount(String fnumber, String restaurantUUID, String billpayed) {
		String selectSqlQuery = messages.getProperty(SqlQueries.GETUSERSENTITY.getSqlQueries());
		Query query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", restaurantUUID);
		query.setParameter("fumber", fnumber);
		query.setParameter("billpayed", billpayed);
		List<UsersEntity> list = query.list();
		if (list.size() == 1) {
			UsersEntity usersEntity = list.get(0);
			return usersEntity;
		}
		return null;
	}

	@Override
	public UsersEntity mobileUsersTable(UsersEntity record) {
		Query query = null;
		String selectSqlQuery = null;
		selectSqlQuery = messages.getProperty(SqlQueries.MOBILESELECT.getSqlQueries());
		query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
		query.setParameter("uuid", record.getUuid());
		query.setParameter("bookingid", record.getBookingid());
		query.setParameter("bookingmode", record.getBookingmode());
		List<UsersEntity> list = query.list();
		if (list.size() == 1) {
			UsersEntity usersEntity = list.get(0);
			selectSqlQuery = messages.getProperty(SqlQueries.MOBILEUSERUPDATE.getSqlQueries());
			query = sessionFactory.getCurrentSession().createQuery(selectSqlQuery);
			query.setParameter("visited", record.getVisited());
			query.setParameter("vdtime", record.getVdtime());
			query.setParameter("fnumber", record.getFnumber());
			query.setParameter("uuid", record.getUuid());
			query.setParameter("bookingid", record.getBookingid());
			query.setParameter("bookingmode", record.getBookingmode());
			query.executeUpdate();
			return usersEntity;
		}
		return null;
	}
}