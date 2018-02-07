package day7Zuoye;

public class ComputerDemo {
	public static void main(String[] args) {
		
	Computer c=new Computer();
	c.setColor("黑色");
	c.setBrand("联想");
	c.setPrice(4999);
	Computer c1=new Computer("银白色","联想",4999);
	
	System.out.println(c.getColor()+"的"+c.getBrand()+"电脑价值"+c.getPrice()+"元,可以"+c.playGame());
	}
}
