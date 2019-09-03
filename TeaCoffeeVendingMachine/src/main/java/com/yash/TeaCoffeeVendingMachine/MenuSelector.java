package com.yash.TeaCoffeeVendingMachine;

import com.yash.TeaCoffeeVendingMachine.pojos.BlackCoffee;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackTea;
import com.yash.TeaCoffeeVendingMachine.pojos.Coffee;
import com.yash.TeaCoffeeVendingMachine.pojos.MaterialContainer;
import com.yash.TeaCoffeeVendingMachine.pojos.Tea;

public class MenuSelector {

	TeaCoffeeVendingMachineOperation TCVMO = new TeaCoffeeVendingMachineOperation();
	MaterialContainer materialContainer = new MaterialContainer();
	Tea teaContent = new Tea();
	BlackTea blackTeaContent = new BlackTea();
	Coffee coffeeContent = new Coffee();
	BlackCoffee blackCoffeeContent = new BlackCoffee();
	
	
	

	public void selectMenu(Integer choice, Integer noOfCups) {

		switch (choice) {
		case 1:
			
			
			TCVMO.makeTea(noOfCups, materialContainer, teaContent);
			System.out.println("--------------------------------------------------------------------------");
			TCVMO.checkContainerStatus(materialContainer);
			break;

		case 2:

			TCVMO.makeBlackTea(noOfCups, materialContainer, blackTeaContent);
			System.out.println("------------------------------------------------------------------------------");
			TCVMO.checkContainerStatus(materialContainer);
			break;

		case 3:

			TCVMO.makeCoffee(noOfCups, materialContainer, coffeeContent);
			System.out.println("-----------------------------------------------------------------");
			TCVMO.checkContainerStatus(materialContainer);
			break;

		case 4:

			TCVMO.makeBlackCoffee(noOfCups, materialContainer, blackCoffeeContent);
			System.out.println("-----------------------------------------------------------------");
			TCVMO.checkContainerStatus(materialContainer);
			break;

		case 5:
			System.out.println("Refill-Container");
			TCVMO.refillContainer(materialContainer);
			System.out.println("---------------------------------------------------------------------");
			TCVMO.checkContainerStatus(materialContainer);
			break;

		case 6:
			System.out.println("Check Total Sale");
			TCVMO.checkTotalSale(materialContainer);
			break;

		case 7:
			System.out.println("Reset Container");
			break;
		case 8:
			System.out.println("Container status");
			System.out.println("---------------------------------------------------------------------");
			TCVMO.checkContainerStatus(materialContainer);
			break;

		default:
			System.out.println("Invalid choice-----Try again");
			break;

		}
	}

}
