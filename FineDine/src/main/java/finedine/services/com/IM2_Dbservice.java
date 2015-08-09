package main.java.finedine.services.com;

import java.util.List;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UpdateProfileFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.SignIn;

public interface IM2_Dbservice {
	public List<RestaurantLiveEntity> getFromBookingTable(String restaurantUUID);

	public boolean resetBookingTable(List list);

	public RestaurantLiveEntity usersTable(UsersEntity record);

	public void usersTableBillAmount(String uuid, String billAmount, String emailid, String billpayed);
	
	public UsersEntity usersTableBillAmount(String fnumber, String restaurantUUID, String billpayed);

	public List<UsersEntity> customerTable(String uuid);

	public boolean signupTable(RestaurantSignUpFormEntity record, RestaurantLiveEntity restaurantLiveEntity);

	public RestaurantSignUpFormEntity signInTable(SignIn record);

	public boolean resetPasswordTable(String email, String password);

	public RestaurantSignUpFormEntity getRestaurantDetailsFromTable(String restaurantUUID);

	public boolean updateRestaurantDetailsFromTable(UpdateProfileFormEntity updateProfileFormEntity, String restaurantUUID);
}