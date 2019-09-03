package com.yash.TeaCoffeeVendingMachine;

import java.util.Scanner;

public class TeaCoffeeVendingMachineApplication {
	public static void main(String[] args) {
		boolean flag = true;
		MenuSelector menuSelector = new MenuSelector();
		Scanner scan= new Scanner(System.in);

		while (flag) {
			
			System.out.println("***************************************************************************");
			System.out.println("Welcome to Tea-Coffee Vending Machine");
			System.out.println("1- Tea");
			System.out.println("2- Black-Tea");
			System.out.println("3- Coffee");
			System.out.println("4- Black-Coffee");
			System.out.println("5- Refill-Container");
			System.out.println("6- Check Total Sale");
			System.out.println("7- Container status");
			System.out.println("8- Reset Container");
			System.out.println("0- Exit TCVM");
			System.out.println("****************************************************************************");

			System.out.println("Please select your choice:");
			int choice = 0;
			choice = scan.nextInt();
			
			if(choice==0){
				flag=false;
				break;
			}
				
			int noOfCups;
			System.out.println("Enter no of cups you want:");
			noOfCups = scan.nextInt();
			
			menuSelector.selectMenu(choice, noOfCups);
		}
		
	}

}
