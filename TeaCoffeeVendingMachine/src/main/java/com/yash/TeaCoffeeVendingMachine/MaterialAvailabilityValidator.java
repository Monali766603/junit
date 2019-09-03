package com.yash.TeaCoffeeVendingMachine;

import com.yash.TeaCoffeeVendingMachine.pojos.BlackCoffee;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackTea;
import com.yash.TeaCoffeeVendingMachine.pojos.Coffee;
import com.yash.TeaCoffeeVendingMachine.pojos.MaterialContainer;
import com.yash.TeaCoffeeVendingMachine.pojos.Tea;

public class MaterialAvailabilityValidator {

	public boolean isMaterialAvailableOrNotForCoffee(int noOfCups, MaterialContainer container,
			Coffee coffeeContent) {

		if ((coffeeContent.coffee + coffeeContent.coffeeWaste) * noOfCups > container.getCoffeeContainer())
			return false;

		if ((coffeeContent.milk + coffeeContent.milkWaste) * noOfCups > container.getMilkContainer())
			return false;

		if ((coffeeContent.water + coffeeContent.waterWaste) * noOfCups > container.getWaterContainer())
			return false;

		if ((coffeeContent.sugar + coffeeContent.sugarWaste) * noOfCups > container.getSugarContainer())
			return false;

		return true;
	}

	public boolean isMaterialAvailableOrNotForTea(int noOfCups, MaterialContainer container, Tea teaContent) {

		if ((teaContent.tea + teaContent.teaWaste) * noOfCups > container.getTeaContainer())
			return false;

		if ((teaContent.water + teaContent.waterWaste) * noOfCups > container.getWaterContainer())
			return false;

		if ((teaContent.milk + teaContent.milkWaste) * noOfCups > container.getMilkContainer())
			return false;

		if ((teaContent.sugar + teaContent.sugarWaste) * noOfCups > container.getSugarContainer())
			return false;
		return true;
	}

	public boolean isMaterialAvailableOrNotForBlackTea(int noOfCups, MaterialContainer container,
			BlackTea blackTeaContent) {

		if ((blackTeaContent.tea + blackTeaContent.teaWaste) * noOfCups > container.getTeaContainer())
			return false;

		if ((blackTeaContent.water + blackTeaContent.waterWaste) * noOfCups > container.getWaterContainer())
			return false;

		if ((blackTeaContent.sugar + blackTeaContent.sugarWaste) * noOfCups > container.getSugarContainer())
			return false;

		return true;

	}

	boolean isMaterialAvailableOrNotForBlackCoffee(int noOfCups, MaterialContainer container,
			BlackCoffee blackCoffeeContent) {

		if ((blackCoffeeContent.coffee + blackCoffeeContent.coffeeWaste) * noOfCups > container.getCoffeeContainer())
			return false;

		if ((blackCoffeeContent.water + blackCoffeeContent.waterWaste) * noOfCups > container.getWaterContainer())
			return false;

		if ((blackCoffeeContent.sugar + blackCoffeeContent.sugarWaste) * noOfCups > container.getSugarContainer())
			return false;

		return true;
	}
}
