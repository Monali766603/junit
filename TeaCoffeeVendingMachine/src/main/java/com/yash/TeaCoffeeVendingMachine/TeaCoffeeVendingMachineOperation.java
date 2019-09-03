package com.yash.TeaCoffeeVendingMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.yash.TeaCoffeeVendingMachine.Exception.InsufficentMaterialException;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackCoffee;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackTea;
import com.yash.TeaCoffeeVendingMachine.pojos.Coffee;
import com.yash.TeaCoffeeVendingMachine.pojos.MaterialContainer;
import com.yash.TeaCoffeeVendingMachine.pojos.Tea;

public class TeaCoffeeVendingMachineOperation {

	MaterialAvailabilityValidator materialAvailabilityValidator = new MaterialAvailabilityValidator();
	
	IntegerScanner scanner = new IntegerScanner();

	public void makeCoffee(int noOfCups, MaterialContainer container, Coffee coffeeContent) {

		if (materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(noOfCups, container, coffeeContent)) {

			container.setCoffeeContainer(
					container.getCoffeeContainer() - ((coffeeContent.coffee + coffeeContent.coffeeWaste) * noOfCups));

			container.setWaterContainer(
					container.getWaterContainer() - ((coffeeContent.water + coffeeContent.waterWaste) * noOfCups));

			container.setMilkContainer(
					container.getMilkContainer() - ((coffeeContent.milk + coffeeContent.milkWaste) * noOfCups));

			container.setSugarContainer(
					container.getSugarContainer() - ((coffeeContent.sugar + coffeeContent.sugarWaste) * noOfCups));

			System.out.println("Coffee is served ...");
			System.out.println("--------------------------------------------------------------");

			updateTotalSale("coffee", noOfCups, coffeeContent.price, container);
		} else {

			throw new InsufficentMaterialException("Insufficient material to make coffee");

		}

	}

	public void makeTea(int noOfCups, MaterialContainer container, Tea teaContent) {

		if (materialAvailabilityValidator.isMaterialAvailableOrNotForTea(noOfCups, container, teaContent)) {

			container.setTeaContainer(container.getTeaContainer() - (teaContent.tea + teaContent.teaWaste) * noOfCups);

			container.setWaterContainer(
					container.getWaterContainer() - (teaContent.water + teaContent.waterWaste) * noOfCups);

			container.setMilkContainer(
					container.getMilkContainer() - (teaContent.milk + teaContent.milkWaste) * noOfCups);

			container.setSugarContainer(
					container.getSugarContainer() - (teaContent.sugar + teaContent.sugarWaste) * noOfCups);

			System.out.println("Tea is served ...");

			updateTotalSale("tea", noOfCups, teaContent.price, container);

		} else {

			throw new InsufficentMaterialException("Insufficient material to make Tea");
		}

	}

	public void makeBlackTea(int noOfCups, MaterialContainer container, BlackTea blackTeaContent) {

		if (materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(noOfCups, container, blackTeaContent)) {

			container.setTeaContainer(
					container.getTeaContainer() - ((blackTeaContent.tea + blackTeaContent.teaWaste) * noOfCups));

			container.setWaterContainer(
					container.getWaterContainer() - ((blackTeaContent.water + blackTeaContent.waterWaste) * noOfCups));

			container.setSugarContainer(
					container.getSugarContainer() - ((blackTeaContent.sugar + blackTeaContent.sugarWaste) * noOfCups));

			System.out.println("Black Tea is served");
			updateTotalSale("blackTea", noOfCups, blackTeaContent.price, container);
		} else {
			throw new InsufficentMaterialException("Insufficient material to make coffee");
		}

	}

	public void makeBlackCoffee(int noOfCups, MaterialContainer container, BlackCoffee blackCoffeeContent) {

		if (materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(noOfCups, container,
				blackCoffeeContent)) {

			container.setCoffeeContainer(container.getCoffeeContainer()
					- ((blackCoffeeContent.coffee + blackCoffeeContent.coffeeWaste)) * noOfCups);

			container.setWaterContainer(container.getWaterContainer()
					- ((blackCoffeeContent.water + blackCoffeeContent.waterWaste)) * noOfCups);

			container.setSugarContainer(container.getSugarContainer()
					- ((blackCoffeeContent.sugar + blackCoffeeContent.sugarWaste)) * noOfCups);

			updateTotalSale("blackCoffee", noOfCups, blackCoffeeContent.price, container);

		} else {
			throw new InsufficentMaterialException("Insufficient material to make coffee");
		}

	}

	public void checkContainerStatus(MaterialContainer materialContainer) {
		System.out.println("CoffeeContainer=" + " " + materialContainer.getCoffeeContainer() + "" + " "
				+ "TeaContainer=" + materialContainer.getTeaContainer() + " " + " " + "SugarContainer="
				+ materialContainer.getSugarContainer() + " " + " " + "WaterContainer="
				+ materialContainer.getWaterContainer() + " " + " " + "MilkContainer="
				+ materialContainer.getMilkContainer());

	}

	public void refillContainer(MaterialContainer container) {

		Boolean flag = true;
		// while (flag)
		do {
			System.out.println("press 1 to fill TeaContainer");
			System.out.println("press 2 to fill WaterContainer");
			System.out.println("press 3 to fill MilkContainer");
			System.out.println("press 4 to fill CoffeeContainer");
			System.out.println("press 5 to fill SugarContainer");
			System.out.println("press 0 to exit");
			Integer choice = 0;
			System.out.println("Enter choice to refill your container:");
			choice = scanner.nextInteger();
			switch (choice) {
			case 1:
				container.setTeaContainer(2000);
				System.out.println("TeaContainer Refilled:" + container.getTeaContainer());
				break;
			case 2:
				container.setWaterContainer(15000);
				System.out.println("WaterContainer Refilled:" + container.getWaterContainer());
				break;
			case 3:
				container.setMilkContainer(10000);
				System.out.println("MilContainer Refilled:" + container.getMilkContainer());
				break;
			case 4:
				container.setCoffeeContainer(2000);
				System.out.println("CoffeeContainer Refilled:" + container.getCoffeeContainer());
				break;
			case 5:
				container.setSugarContainer(8000);
				System.out.println("SugarContainer Refilled:" + container.getSugarContainer());
				break;
			/* case 0:
				flag = false;
				break; */

			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (flag = false);

	}

	public void checkTotalSale(MaterialContainer container) {
		System.out.println("Total Sale as Follows:");
		container.getTotalSale().entrySet().forEach((setOfDrinkSale) -> {
			System.out.println(setOfDrinkSale.getKey() + ":-");
			setOfDrinkSale.getValue().entrySet().forEach((setOfEntry) -> {
				System.out.println("---------------" + setOfEntry.getKey() + ":--" + setOfEntry.getValue());
			});
		});
	}

	public void updateTotalSale(String drinkType, Integer noOfCups, Integer pricePerCup, MaterialContainer container) {
		if (container.getTotalSale().containsKey(drinkType)) {

			Map<String, Integer> mapOfDrinkTypeSale = container.getTotalSale().get(drinkType);

			mapOfDrinkTypeSale.put("totalNoOfCups", mapOfDrinkTypeSale.get("totalNoOfCups") + noOfCups);
			mapOfDrinkTypeSale.put("totalSaleAmount",
					mapOfDrinkTypeSale.get("totalSaleAmount") + (noOfCups * pricePerCup));

			container.getTotalSale().put(drinkType, mapOfDrinkTypeSale);

		} else {

			Map<String, Integer> mapOfDrinkTypeSale = new HashMap<>();

			mapOfDrinkTypeSale.put("totalNoOfCups", noOfCups);
			mapOfDrinkTypeSale.put("totalSaleAmount", noOfCups * pricePerCup);

			container.getTotalSale().put(drinkType, mapOfDrinkTypeSale);
		}
	}

}
