package day7Zuoye;

public class Phone {
	private int price;
	private String brand;
	
	public Phone(){}
	public Phone(String brand,int price){
		this.brand=brand;
		this.price=price;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String call(){
		 return "��绰";
	}
	
	public String sendMessage(){
		return "������";
	}
	
	public String playGame(){
		return "����Ϸ";
	}
	

}
