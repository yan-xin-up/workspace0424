package com.xinyan7788.chapter1;

class Dog{
	private String name;
	private String says;

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSays() {
		return says;
	}
	public void setSays(String says) {
		this.says = says;
	}
	
	public void showName() {
		System.out.println("name: "+ getName());
	}
	public void showSays() {
		System.out.println("speak: "+getSays());
	}
}