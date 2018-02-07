package day7Zuoye;

public class CoderManagerDemo {
	public static void main(String[] args) {
		Manager m=new Manager();
		Coder d=new Coder();
		m.setName("hahah");
		m.setId(168);
		m.setSalary(15000);
		m.setBonus(6000);
		d.setName("heheh");
		d.setId(151);
		d.setSalary(10000);
		System.out.println("工号为"+m.getId()+"基本工资为"+m.getSalary()+"奖金为"+m.getBonus()+"的"+m.work());
		System.out.println("工号为"+d.getId()+"基本工资为"+d.getSalary()+"的"+d.work());
	}

}
