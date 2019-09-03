package com.yash.TeaCoffeeVendingMachine.pojos;

public class Tea {
	public Integer tea;
	public Integer water;
	public Integer milk;
	public Integer sugar;
	public Integer teaWaste;
	public Integer waterWaste;
	public Integer milkWaste;
	public Integer sugarWaste;
	public Integer price;
	//private static final int price = 10;

	public Tea() {
		super();
		this.tea = 5;
		this.water = 60;
		this.milk = 40;
		this.sugar = 15;
		this.milkWaste=4;
		this.sugarWaste=2;
		this.waterWaste=5;
		this.teaWaste=1;
		this.price=10;
	}

	
}
