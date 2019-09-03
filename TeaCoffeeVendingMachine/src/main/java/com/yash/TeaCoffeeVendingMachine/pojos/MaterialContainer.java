package com.yash.TeaCoffeeVendingMachine.pojos;

import java.util.HashMap;
import java.util.Map;

public class MaterialContainer {
	private Integer teaContainer;
	private Integer waterContainer;
	private Integer milkContainer;
	private Integer coffeeContainer;
	private Integer sugarContainer;
	private Map<String,Map<String,Integer>> totalSale;
	private Map<String,Map<String,Integer>> totalWaste;


	public MaterialContainer() {
		super();
		this.teaContainer = 2000;
		this.waterContainer = 15000;
		this.milkContainer = 10000;
		this.coffeeContainer = 2000;
		this.sugarContainer = 8000;
		this.totalSale=new HashMap<>();
		this.totalWaste=new HashMap<>();
	}


	public Integer getTeaContainer() {
		return teaContainer;
	}


	public void setTeaContainer(Integer teaContainer) {
		this.teaContainer = teaContainer;
	}


	public Integer getWaterContainer() {
		return waterContainer;
	}


	public void setWaterContainer(Integer waterContainer) {
		this.waterContainer = waterContainer;
	}


	public Integer getMilkContainer() {
		return milkContainer;
	}


	public void setMilkContainer(Integer milkContainer) {
		this.milkContainer = milkContainer;
	}


	public Integer getCoffeeContainer() {
		return coffeeContainer;
	}


	public void setCoffeeContainer(Integer coffeeContainer) {
		this.coffeeContainer = coffeeContainer;
	}


	public Integer getSugarContainer() {
		return sugarContainer;
	}


	public void setSugarContainer(Integer sugarContainer) {
		this.sugarContainer = sugarContainer;
	}


	

	public Map<String, Map<String, Integer>> getTotalSale() {
		return totalSale;
	}


	public void setTotalSale(Map<String, Map<String, Integer>> totalSale) {
		this.totalSale = totalSale;
	}


	public Map<String, Map<String, Integer>> getTotalWaste() {
		return totalWaste;
	}


	public void setTotalWaste(Map<String, Map<String, Integer>> totalWaste) {
		this.totalWaste = totalWaste;
	}
	

	
}
