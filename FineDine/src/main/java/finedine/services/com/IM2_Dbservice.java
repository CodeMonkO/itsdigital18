package main.java.finedine.services.com;

import java.util.List;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;

public interface IM2_Dbservice {
	public RestaurantLiveEntity usersTable(UsersEntity record);
	public List<Object> customerTable(String uuid);
	public boolean signupTable(RestaurantSignUpFormEntity record);
}