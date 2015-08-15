package main.java.finedine.util.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.finedine.cache.com.Caching;
import main.java.finedine.constants.com.Constants.Constant;
import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.pojo.com.Bill;
import main.java.finedine.pojo.com.Billing;
import main.java.finedine.pojo.com.Booking;
import main.java.finedine.pojo.com.SignIn;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class GenericModel {
	
	public ModelAndView getSeats(RestaurantLiveEntity restaurantLiveEntity, Booking bookingform, ModelAndView model) {
		int bookedseats = Integer.parseInt(restaurantLiveEntity.getBookedseat());
		int maxseats = Integer.parseInt(restaurantLiveEntity.getMaxseat());
		int vacantSeats = maxseats - bookedseats;
		if (Integer.parseInt(bookingform.getBooking()) <= (vacantSeats)) {
			System.out.println("hello :" + restaurantLiveEntity.getBookedseat());
			model.addObject("bookedseats", bookedseats + Integer.parseInt(bookingform.getBooking()));
			model.addObject("maxseats", maxseats);
			model.addObject("vacantseats", vacantSeats - Integer.parseInt(bookingform.getBooking()));
			model.addObject("visible", true);
		} else {
			model.addObject("bookedseats", bookedseats);
			model.addObject("maxseats", maxseats);
			model.addObject("vacantseats", vacantSeats);
			model.addObject("visible", true);
		}
		if (maxseats == bookedseats) {
			model.addObject("housefull", "All seats booked");
			model.addObject("visible", false);
		}
		return model;
	}

	public ModelAndView getSeats(RestaurantLiveEntity restaurantLiveEntity, ModelAndView model) {
		int vacantSeats = Integer.parseInt(restaurantLiveEntity.getMaxseat()) - Integer.parseInt(restaurantLiveEntity.getBookedseat());
		int bookedseats = Integer.parseInt(restaurantLiveEntity.getBookedseat());
		int maxseats = Integer.parseInt(restaurantLiveEntity.getMaxseat());

		if (maxseats == bookedseats) {
			model.addObject("housefull", "All seats booked");
			model.addObject("visible", false);
		} else {
			model.addObject("bookedseats", bookedseats);
			model.addObject("maxseats", maxseats);
			model.addObject("vacantseats", vacantSeats);
			model.addObject("visible", true);
		}
		return model;
	}
	
	public ModelAndView getBillingFormModelMap(ModelAndView model, String emailId){
		Billing billing = new Billing();
		Map<String, Map<String, Object>> cache = Caching.getLoggedInUsers();
		List<Bill> billList = new ArrayList<Bill>();
		List<String> itemsList = new ArrayList<String>();
		String uuid = null;
		if (emailId != null) {
			if (cache != null && cache.size() > 0) {
				Map<String, Object> internalMap = cache.get(emailId);
				if (internalMap != null && internalMap.size() > 0) {
					uuid = internalMap.get(Constant.RESTAURANTUUID.getConstantValue()).toString();
					Object objectMenu = internalMap.get(Constant.MENU.getConstantValue());
					Object objectItemsList = internalMap.get(Constant.ITEMSLIST.getConstantValue());
					if (objectMenu instanceof List && objectItemsList instanceof List) {
						billList = (List<Bill>) objectMenu;
						itemsList = (List<String>) objectItemsList;
						model.addObject(Constant.MENU.getConstantValue(), billList);
						model.addObject(Constant.ITEMSLIST.getConstantValue(), itemsList);
					}
				}
			}
		}
		model.addObject(Constant.BILLINGFORM.getConstantValue(), billing);
		return model;
	}

}
