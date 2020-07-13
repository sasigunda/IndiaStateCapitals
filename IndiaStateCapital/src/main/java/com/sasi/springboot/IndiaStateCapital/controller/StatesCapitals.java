package com.sasi.springboot.IndiaStateCapital.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatesCapitals {
	
	@RequestMapping("/statesCapitals")
	public List<StateDetails> getAllDetails() {
		return Arrays.asList(
				new StateDetails("Andhra Pradesh", "Amaravati"),
				new StateDetails("Arunachal Pradesh", "Itanagar"),
				new StateDetails("Assam", "Dispur"),
				new StateDetails("Bihar", "Patna"),
				new StateDetails("Chhattisgarh", "Raipur"),
				new StateDetails("Goa", "Panaji"),
				new StateDetails("Gujarat", "Gandhinagar"),
				new StateDetails("Haryana", "Chandigarh"),
				new StateDetails("Himachal Pradesh", "Shimla"),
				new StateDetails("Jammu and Kashmir", "Srinagar (summer), Jammu (winter)"),
				new StateDetails("Jharkhand", "Ranchi"),
				new StateDetails("Karnataka", "Bengaluru"),
				new StateDetails("Kerala", "Thiruvananthapuram"),
				new StateDetails("Madhya Pradesh", "Bhopal"),
				new StateDetails("Maharashtra", "Mumbai"),
				new StateDetails("Manipur", "Imphal"),
				new StateDetails("Meghalaya", "Shillong"),
				new StateDetails("Mizoram", "Aizawl"),
				new StateDetails("Nagaland", "Kohima"),
				new StateDetails("Odisha", "Bhubaneswar"),
				new StateDetails("Punjab", "Chandigarh"),
				new StateDetails("Rajasthan", "Jaipur"),
				new StateDetails("Sikkim", "Gangtok"),
				new StateDetails("Tamil Nadu", "Chennai"),
				new StateDetails("Telangana", "Hyderabad"),
				new StateDetails("Tripura", "Agartala"),
				new StateDetails("Uttar Pradesh", "Lucknow"),
				new StateDetails("Uttarakhand", "Dehradun"),
				new StateDetails("West Bengal", "Kolkata")
				);
	}

}
