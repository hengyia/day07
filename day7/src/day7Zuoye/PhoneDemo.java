package day7Zuoye;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.setPrice(999);
		p.setBrand("小米品牌");
		p.playGame();
		System.out.println("正在使用价格为"+p.getPrice()+"元的"+p.getBrand()+"的手机"+p.call());
		System.out.println("正在使用价格为"+p.getPrice()+"元的"+p.getBrand()+"的手机"+p.sendMessage());
		System.out.println("正在使用价格为"+p.getPrice()+"元的"+p.getBrand()+"的手机"+p.playGame());
	}

}
