package main.java.finedine.dao.com;

import java.util.List;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.SignIn;

public interface IM2_Dao {
	public RestaurantLiveEntity usersTable(UsersEntity record);
	public List<Object> customerTable(String uuid);
	public boolean signupTable(RestaurantSignUpFormEntity record);
	public boolean signInTable(SignIn record);
}