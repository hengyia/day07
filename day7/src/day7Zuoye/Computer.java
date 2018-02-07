package day7Zuoye;

public class Computer {
	private String color;
	private String brand;
	private int price;
	public Computer(){}
	public Computer(String color,String brand,int price){
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String playGame(){
		return "ÕÊ”Œœ∑";
		
	}
	
	public String Music(){
		return "Ã˝“Ù¿÷";
	}

}
