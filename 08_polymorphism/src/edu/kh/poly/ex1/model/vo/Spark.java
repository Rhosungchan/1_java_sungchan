package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{

	private double discountoffer; // 할인혜택
	
	public Spark() { }

	public Spark(int wheel, int seat, String fuel, double discountoffer) {
		super(wheel, seat, fuel);
		this.discountoffer = discountoffer;
	}

	public double getDiscountoffer() {
		return discountoffer;
	}

	public void setDiscountoffer(double discountoffer) {
		this.discountoffer = discountoffer;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ " / 할인혜택 : " + discountoffer;
	}
	
	// 8월 23일 6교시 
	public void dc() {
		System.out.println(discountoffer * 100+"% 할인됩니다.");
	}
	
}
