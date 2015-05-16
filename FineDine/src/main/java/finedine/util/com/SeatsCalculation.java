package main.java.finedine.util.com;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.pojo.com.Booking;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class SeatsCalculation {
	public ModelMap getSeats(RestaurantLiveEntity restaurantLiveEntity, Booking bookingform, ModelMap model) {
		int bookedseats = Integer.parseInt(restaurantLiveEntity.getBookedseat());
		int maxseats = Integer.parseInt(restaurantLiveEntity.getMaxseat());
		int vacantSeats = maxseats - bookedseats;
		if (Integer.parseInt(bookingform.getBooking()) <= (vacantSeats)) {
			System.out.println("hello :" + restaurantLiveEntity.getBookedseat());
			model.addAttribute("bookedseats", bookedseats + Integer.parseInt(bookingform.getBooking()));
			model.addAttribute("maxseats", maxseats);
			model.addAttribute("vacantseats", vacantSeats - Integer.parseInt(bookingform.getBooking()));
			model.addAttribute("visible", true);
		} else {
			model.addAttribute("bookedseats", bookedseats);
			model.addAttribute("maxseats", maxseats);
			model.addAttribute("vacantseats", vacantSeats);
			model.addAttribute("visible", true);
		}
		if (maxseats == bookedseats) {
			model.addAttribute("housefull", "All seats booked");
			model.addAttribute("visible", false);
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

}
