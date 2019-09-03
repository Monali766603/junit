package com.yash.TeaCoffeeVendingMachine;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.TeaCoffeeVendingMachine.Exception.InsufficentMaterialException;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackCoffee;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackTea;
import com.yash.TeaCoffeeVendingMachine.pojos.Coffee;
import com.yash.TeaCoffeeVendingMachine.pojos.MaterialContainer;
import com.yash.TeaCoffeeVendingMachine.pojos.Tea;

@RunWith(MockitoJUnitRunner.class)
public class TeaCoffeeVendingMachineOperationTest {

	@InjectMocks
	private TeaCoffeeVendingMachineOperation teaCoffeeVendingMachineOperation;

	@Mock
	IntegerScanner scan;

	@Mock
	private MaterialAvailabilityValidator materialAvailabilityValidator;

	@Test
	public void shoulMakeCoffeeIfAllMaterialIsAvailable() {

		MaterialContainer container = new MaterialContainer();

		Coffee coffeeContent = new Coffee();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container, coffeeContent))
				.thenReturn(true);

		teaCoffeeVendingMachineOperation.makeCoffee(1, container, coffeeContent);

		verify(materialAvailabilityValidator).isMaterialAvailableOrNotForCoffee(1, container, coffeeContent);

	}

	@Test(expected = InsufficentMaterialException.class)
	public void shouldThrowExceptionWhenMakingCoffeeAndIfAnyMaterialIsNotAvailable() {

		MaterialContainer container = new MaterialContainer();

		Coffee coffeeContent = new Coffee();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container, coffeeContent))
				.thenReturn(false);

		teaCoffeeVendingMachineOperation.makeCoffee(1, container, coffeeContent);

		// verify(materialAvailabilityValidator).isMaterialAvailableOrNotForCoffee(1,
		// container, coffeeContent);

	}

	@Test
	public void shoulMakeTeaIfAllMaterialIsAvailable() {

		MaterialContainer container = new MaterialContainer();

		Tea teaContent = new Tea();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent)).thenReturn(true);

		teaCoffeeVendingMachineOperation.makeTea(1, container, teaContent);

		verify(materialAvailabilityValidator).isMaterialAvailableOrNotForTea(1, container, teaContent);

	}

	@Test(expected = InsufficentMaterialException.class)
	public void shouldThrowExceptionWhenMakingTeaAndIfAnyMaterialIsNotAvailable() {

		MaterialContainer container = new MaterialContainer();

		Tea teaContent = new Tea();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent)).thenReturn(false);

		teaCoffeeVendingMachineOperation.makeTea(1, container, teaContent);

	}

	@Test
	public void shouldMakeBlackTeaIfAllMaterialIsAvailable() {
		MaterialContainer container = new MaterialContainer();
		BlackTea blackTeaContent = new BlackTea();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(1, container, blackTeaContent))
				.thenReturn(true);

		teaCoffeeVendingMachineOperation.makeBlackTea(1, container, blackTeaContent);

		verify(materialAvailabilityValidator).isMaterialAvailableOrNotForBlackTea(1, container, blackTeaContent);

	}

	@Test(expected = InsufficentMaterialException.class)
	public void shoulThrowExceptionWhenMakingBlackTeaAndAnyMaterialIsNotAvailable() {
		MaterialContainer container = new MaterialContainer();
		BlackTea blackTeaContent = new BlackTea();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(1, container, blackTeaContent))
				.thenReturn(false);

		teaCoffeeVendingMachineOperation.makeBlackTea(1, container, blackTeaContent);

	}

	@Test
	public void shouldMakeBlackCoffeeIfAllMaterialIsAvailable() {
		MaterialContainer container = new MaterialContainer();
		BlackCoffee blackCoffeeContent = new BlackCoffee();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(1, container, blackCoffeeContent))
				.thenReturn(true);

		teaCoffeeVendingMachineOperation.makeBlackCoffee(1, container, blackCoffeeContent);

		verify(materialAvailabilityValidator).isMaterialAvailableOrNotForBlackCoffee(1, container, blackCoffeeContent);

	}

	@Test(expected = InsufficentMaterialException.class)
	public void shoulThrowExceptionWhenMakingBlackCoffeeAndAnyMaterialIsNotAvailable() {
		MaterialContainer container = new MaterialContainer();
		BlackCoffee blackCoffeeContent = new BlackCoffee();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(1, container, blackCoffeeContent))
				.thenReturn(false);

		teaCoffeeVendingMachineOperation.makeBlackCoffee(1, container, blackCoffeeContent);

	}

	@Test
	public void shoulCheckContainerStatus() {

		MaterialContainer container = new MaterialContainer();

		teaCoffeeVendingMachineOperation.checkContainerStatus(container);
	}

	@Test
	public void shouldCheckTotalSale() {

		MaterialContainer container = new MaterialContainer();

		Map<String, Map<String, Integer>> mapOfTotalDrinkSale = new HashMap<>();

		Map<String, Integer> mapOfDrinkValues = new HashMap<>();
		mapOfDrinkValues.put("totalNoOfCups", 1);
		mapOfDrinkValues.put("totalSaleAmount", 10);

		mapOfTotalDrinkSale.put("tea", mapOfDrinkValues);

		container.setTotalSale(mapOfTotalDrinkSale);

		teaCoffeeVendingMachineOperation.checkTotalSale(container);
	}

	@Test
	public void shouldMakeTeaIfAllMaterialIsAvailableForTeaAndTotalSaleIsPresent() {

		MaterialContainer container = new MaterialContainer();

		Map<String, Map<String, Integer>> mapOfTotalDrinkSale = new HashMap<>();

		Map<String, Integer> mapOfDrinkValues = new HashMap<>();
		mapOfDrinkValues.put("totalNoOfCups", 1);
		mapOfDrinkValues.put("totalSaleAmount", 10);

		mapOfTotalDrinkSale.put("tea", mapOfDrinkValues);

		container.setTotalSale(mapOfTotalDrinkSale);

		Tea teaContent = new Tea();

		when(materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent)).thenReturn(true);

		teaCoffeeVendingMachineOperation.makeTea(1, container, teaContent);

		verify(materialAvailabilityValidator).isMaterialAvailableOrNotForTea(1, container, teaContent);
	}

	@Test
	public void shouldRefillTeaContainer() {

		MaterialContainer container = new MaterialContainer();

		when(scan.nextInteger()).thenReturn(1);

		teaCoffeeVendingMachineOperation.refillContainer(container);

	}

	@Test
	public void shouldRefillWaterContainer() {

		MaterialContainer container = new MaterialContainer();

		when(scan.nextInteger()).thenReturn(2);

		teaCoffeeVendingMachineOperation.refillContainer(container);

	}
	
	@Test
	public void shouldRefillMilkContainer() {

		MaterialContainer container = new MaterialContainer();

		when(scan.nextInteger()).thenReturn(3);

		teaCoffeeVendingMachineOperation.refillContainer(container);

	}
	
	@Test
	public void shouldRefillCoffeeContainer() {

		MaterialContainer container = new MaterialContainer();

		when(scan.nextInteger()).thenReturn(4);

		teaCoffeeVendingMachineOperation.refillContainer(container);

	}
	
	@Test
	public void shouldRefillSugarContainer() {

		MaterialContainer container = new MaterialContainer();

		when(scan.nextInteger()).thenReturn(5);

		teaCoffeeVendingMachineOperation.refillContainer(container);

	}
	
	@Test
	public void shouldCheckDefaultCase() {

		MaterialContainer container = new MaterialContainer();

		when(scan.nextInteger()).thenReturn(7);

		teaCoffeeVendingMachineOperation.refillContainer(container);

	}
	
	
	
	
	
	

}
