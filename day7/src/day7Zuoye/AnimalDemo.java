package day7Zuoye;

public class AnimalDemo {
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		Cat c1=new Cat("��ɫ","��԰è");
		Dog d1=new Dog("��ɫ","��԰Ȯ");
		c.setColor("��ɫ");
		c.setBreed("��԰è");
		d.setColor("��ɫ");
		d.setBreed("��԰Ȯ");
		
		System.out.println(c.getColor()+"��"+c.getBreed()+"����"+c.eat());
		System.out.println(c.getColor()+"��"+c.getBreed()+"����"+c.catchMouse());
		System.out.println(d.getColor()+"��"+d.getBreed()+"����"+d.eat());
		System.out.println(d.getColor()+"��"+d.getBreed()+"����"+d.lookHome());
		
	}

}
