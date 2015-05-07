package main.java.finedine.services.com;

import java.util.List;

import main.java.finedine.dao.com.IM2_Dao;
import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.SignIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class IM2_DbserviceImplemented implements IM2_Dbservice {
 
    @Autowired
    IM2_Dao im2DAO;

	@Transactional
	public RestaurantLiveEntity usersTable(UsersEntity record) {
		return im2DAO.usersTable(record);
	}

	@Transactional
	public List<UsersEntity> customerTable(String uuid) {
		return im2DAO.customerTable(uuid);
	}
	
	@Transactional
	public boolean signupTable(RestaurantSignUpFormEntity record) {
		return im2DAO.signupTable(record);
	}
	
	@Transactional
	public boolean signInTable(SignIn record){
		return im2DAO.signInTable(record);
	}

	@Transactional
	public boolean resetPasswordTable(String email, String password) {
		return im2DAO.resetPasswordTable(email, password);
		
	}
}