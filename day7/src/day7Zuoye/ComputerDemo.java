package day7Zuoye;

public class ComputerDemo {
	public static void main(String[] args) {
		
	Computer c=new Computer();
	c.setColor("��ɫ");
	c.setBrand("����");
	c.setPrice(4999);
	Computer c1=new Computer("����ɫ","����",4999);
	
	System.out.println(c.getColor()+"��"+c.getBrand()+"���Լ�ֵ"+c.getPrice()+"Ԫ,����"+c.playGame());
	}
}
