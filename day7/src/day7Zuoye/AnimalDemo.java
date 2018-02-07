package day7Zuoye;

public class AnimalDemo {
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		Cat c1=new Cat("黑色","田园猫");
		Dog d1=new Dog("棕色","田园犬");
		c.setColor("黑色");
		c.setBreed("田园猫");
		d.setColor("棕色");
		d.setBreed("田园犬");
		
		System.out.println(c.getColor()+"的"+c.getBreed()+"正在"+c.eat());
		System.out.println(c.getColor()+"的"+c.getBreed()+"正在"+c.catchMouse());
		System.out.println(d.getColor()+"的"+d.getBreed()+"正在"+d.eat());
		System.out.println(d.getColor()+"的"+d.getBreed()+"正在"+d.lookHome());
		
	}

}
