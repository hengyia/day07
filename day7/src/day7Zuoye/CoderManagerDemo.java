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
		System.out.println("����Ϊ"+m.getId()+"��������Ϊ"+m.getSalary()+"����Ϊ"+m.getBonus()+"��"+m.work());
		System.out.println("����Ϊ"+d.getId()+"��������Ϊ"+d.getSalary()+"��"+d.work());
	}

}
