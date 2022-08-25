package edu.kh.poly.ex1.model.vo;

public class Truck extends Car{

	private double weight; // 적재량 
	
	public Truck() {
		// super(); // super() 생성자 미작성 시 컴파일러가 추가 
	}
	
	public Truck(int wheel, int seat, String fuel, double weight) {
		
		super(wheel, seat, fuel);
		this.weight = weight;
		
	}
	
	// getter / setter
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" / 적재중량 : "+ weight;
		
		// 출력하고싶은 예시 : wheel : 4 / seat : 5 / fuel : "경유" / 적재중량 : 1.5 
	}
	// 8월 23일 6교시 
	public void loding() {
		System.out.println("물건을 실을 수 있다.");
	}
	
	
	
}
