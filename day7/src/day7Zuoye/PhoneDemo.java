package day7Zuoye;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.setPrice(999);
		p.setBrand("С��Ʒ��");
		p.playGame();
		System.out.println("����ʹ�ü۸�Ϊ"+p.getPrice()+"Ԫ��"+p.getBrand()+"���ֻ�"+p.call());
		System.out.println("����ʹ�ü۸�Ϊ"+p.getPrice()+"Ԫ��"+p.getBrand()+"���ֻ�"+p.sendMessage());
		System.out.println("����ʹ�ü۸�Ϊ"+p.getPrice()+"Ԫ��"+p.getBrand()+"���ֻ�"+p.playGame());
	}

}
