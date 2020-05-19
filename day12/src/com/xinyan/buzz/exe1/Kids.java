package com.xinyan.buzz.exe1;

public class Kids extends ManKind {

	private int yesrsOld;

	public Kids () {

	}

	public Kids(int yesrsOld) {
		this.yesrsOld = yesrsOld;
	}

	public void printAge() {
		System.out.println("I am" + " "+yesrsOld +" "+ "years old.");
	}

	public int getYearsOld() {
		return yesrsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yesrsOld = yearsOld;
	}
	@Override
	public void employeed() {
		System.out.println("Kids should study and no job.");
	}
}
