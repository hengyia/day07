package day7;



public class Test3 {
	private String name;
	private int age;
	private int hight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public void quan(){
		System.out.println("姓名:"+name+"年龄:"+age+"身高:"+hight);
	}

}
