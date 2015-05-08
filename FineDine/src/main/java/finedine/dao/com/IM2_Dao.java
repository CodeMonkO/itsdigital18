package main.java.finedine.dao.com;

import java.util.List;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.SignIn;

public interface IM2_Dao {
	public List<RestaurantLiveEntity> getFromBookingTable(String restaurantUUID);
	public RestaurantLiveEntity usersTable(UsersEntity record);
	public List<UsersEntity> customerTable(String uuid);
	public boolean signupTable(RestaurantSignUpFormEntity record, RestaurantLiveEntity restaurantLiveEntity);
	public RestaurantSignUpFormEntity signInTable(SignIn record);
	public boolean resetPasswordTable(String email, String password);
}