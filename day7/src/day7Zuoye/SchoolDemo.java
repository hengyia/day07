package day7Zuoye;



public class SchoolDemo {
	public static void main(String[] args) {
	
	Teacher t=new Teacher("周志鹏",30,"Java基础中面向对象");
	Student s=new Student("韩光",18,"面向对象");
	
	
	System.out.println("年龄为"+t.getAge()+"的"+t.getName()+"老师正在"+t.eat());
	System.out.println("年龄为"+t.getAge()+"的"+t.getName()+"老师正在亢奋的"+t.study()+"着"+t.getContent()+"的知识");
	System.out.println("年龄为"+s.getAge()+"的"+s.getName()+"正在"+s.eat());
	System.out.println("年龄为"+s.getAge()+"的"+s.getName()+"正在专心致志的"+s.study()+"着"+s.getContent()+"的知识");
	}

}
