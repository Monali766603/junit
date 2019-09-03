package com.yash.TeaCoffeeVendingMachine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.TeaCoffeeVendingMachine.pojos.BlackCoffee;
import com.yash.TeaCoffeeVendingMachine.pojos.BlackTea;
import com.yash.TeaCoffeeVendingMachine.pojos.Coffee;
import com.yash.TeaCoffeeVendingMachine.pojos.MaterialContainer;
import com.yash.TeaCoffeeVendingMachine.pojos.Tea;

@RunWith(MockitoJUnitRunner.class)
public class MenuSelectorTest {

	@InjectMocks
	private MenuSelector menuSelector;
	
	@Mock
	private TeaCoffeeVendingMachineOperation teaCoffeeVendingMachineOperation;
	
	@Mock
	private Coffee coffeeContent;
	
	@Mock
	private Tea teaContent ;
	
	@Mock
	private BlackTea blackTeaContent ;
	
	@Mock
	private BlackCoffee blackCoffeeContent ;
	
	@Mock
	private MaterialContainer container;
	
	
	@Test
	public void shouldMakeTeaWhenChoiceIsOne() {
		menuSelector.selectMenu(1, 1);
	}
	@Test
	public void shouldMakeTeaWhenChoiceIsTwo() {
		menuSelector.selectMenu(2, 1);
	}
	@Test
	public void shouldMakeTeaWhenChoiceIsThree() {
		menuSelector.selectMenu(3, 1);

	}
	@Test
	public void shouldMakeTeaWhenChoiceIsFour() {
		menuSelector.selectMenu(4, 1);

	}
	@Test
	public void shouldMakeTeaWhenChoiceIsFive() {
		menuSelector.selectMenu(5, 1);

	}
	@Test
	public void shouldMakeTeaWhenChoiceIsSix() {
		menuSelector.selectMenu(6, 1);

	}
	@Test
	public void shouldMakeTeaWhenChoiceIsSeven() {
		menuSelector.selectMenu(7, 1);

	}
	@Test
	public void shouldMakeTeaWhenChoiceIsEight() {
		menuSelector.selectMenu(8, 1);

	}
	@Test
	public void shouldMakeTeaWhenChoiceIsNine() {
		menuSelector.selectMenu(9, 1);

	}
	

}
