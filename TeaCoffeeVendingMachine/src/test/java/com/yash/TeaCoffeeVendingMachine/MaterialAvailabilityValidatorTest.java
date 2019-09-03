package com.yash.TeaCoffeeVendingMachine;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.TeaCoffeeVendingMachine.pojos.BlackCoffee;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackTea;
import com.yash.TeaCoffeeVendingMachine.pojos.Coffee;
import com.yash.TeaCoffeeVendingMachine.pojos.MaterialContainer;
import com.yash.TeaCoffeeVendingMachine.pojos.Tea;

@RunWith(MockitoJUnitRunner.class)
public class MaterialAvailabilityValidatorTest {

	@InjectMocks
	private MaterialAvailabilityValidator materialAvailabilityValidator;

	@Test
	public void shouldReturnTrueIfAllMaterialIsAvailableForCoffee() {
		MaterialContainer container = new MaterialContainer();
		Coffee coffeeContent = new Coffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container,
				coffeeContent);

		assertTrue(actualResult);
	}

	@Test
	public void shouldReturnFalseIfCoffeeQauntityIsNotAvailableForCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setCoffeeContainer(0);

		Coffee coffeeContent = new Coffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container,
				coffeeContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfMilkQauntityIsNotAvailableForCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setMilkContainer(0);

		Coffee coffeeContent = new Coffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container,
				coffeeContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfWaterQauntityIsNotAvailableForCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setWaterContainer(0);

		Coffee coffeeContent = new Coffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container,
				coffeeContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfSugarQauntityIsNotAvailableForCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setSugarContainer(0);

		Coffee coffeeContent = new Coffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForCoffee(1, container,
				coffeeContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnTrueIfAllMaterialIsAvailableForTea() {
		MaterialContainer container = new MaterialContainer();
		Tea teaContent = new Tea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent);

		assertTrue(actualResult);
	}

	@Test
	public void shouldReturnFalseIfTeaQauntityIsNotAvailableForTea() {

		MaterialContainer container = new MaterialContainer();
		container.setTeaContainer(0);

		Tea teaContent = new Tea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfWaterQauntityIsNotAvailableForTea() {

		MaterialContainer container = new MaterialContainer();
		container.setWaterContainer(0);

		Tea teaContent = new Tea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfMilkQauntityIsNotAvailableForTea() {

		MaterialContainer container = new MaterialContainer();
		container.setMilkContainer(0);

		Tea teaContent = new Tea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfSugarQauntityIsNotAvailableForTea() {

		MaterialContainer container = new MaterialContainer();
		container.setSugarContainer(0);

		Tea teaContent = new Tea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForTea(1, container, teaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnTrueIfAllMaterialIsAvailableForBlackTea() {
		MaterialContainer container = new MaterialContainer();
		BlackTea blackTeaContent = new BlackTea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(1, container,
				blackTeaContent);

		assertTrue(actualResult);
	}

	@Test
	public void shouldReturnFalseIfTeaQauntityIsNotAvailableForBlackTea() {

		MaterialContainer container = new MaterialContainer();
		container.setTeaContainer(0);

		BlackTea blackTeaContent = new BlackTea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(1, container,
				blackTeaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfWaterQauntityIsNotAvailableForBlackTea() {

		MaterialContainer container = new MaterialContainer();
		container.setWaterContainer(0);

		BlackTea blackTeaContent = new BlackTea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(1, container,
				blackTeaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnFalseIfSugarQauntityIsNotAvailableForBlackTea() {

		MaterialContainer container = new MaterialContainer();
		container.setSugarContainer(0);

		BlackTea blackTeaContent = new BlackTea();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackTea(1, container,
				blackTeaContent);

		assertFalse(actualResult);

	}

	@Test
	public void shouldReturnTrueIfAllMaterialIsAvailableForBlackCoffee() {
		MaterialContainer container = new MaterialContainer();
		BlackCoffee blackCoffeeContent = new BlackCoffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(1, container,
				blackCoffeeContent);

		assertTrue(actualResult);
	}

	@Test
	public void shouldReturnFalseIfCoffeeQauntityIsNotAvailableForBlackCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setCoffeeContainer(0);

		BlackCoffee blackCoffeeContent = new BlackCoffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(1, container,
				blackCoffeeContent);

		assertFalse(actualResult);

	}
	
	@Test
	public void shouldReturnFalseIfWaterQauntityIsNotAvailableForBlackCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setWaterContainer(0);

		BlackCoffee blackCoffeeContent = new BlackCoffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(1, container,
				blackCoffeeContent);

		assertFalse(actualResult);

	}
	
	@Test
	public void shouldReturnFalseIfSugarQauntityIsNotAvailableForBlackCoffee() {

		MaterialContainer container = new MaterialContainer();
		container.setSugarContainer(0);

		BlackCoffee blackCoffeeContent = new BlackCoffee();

		Boolean actualResult = materialAvailabilityValidator.isMaterialAvailableOrNotForBlackCoffee(1, container,
				blackCoffeeContent);

		assertFalse(actualResult);

	}

}
