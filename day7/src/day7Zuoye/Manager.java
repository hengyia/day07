package day7Zuoye;

public class Manager {
	private String name;
	private int id;
	private int salary;
	private int bonus;
	
	public Manager(){}
	
	public Manager(String name,int id,int salary,int bonus){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.bonus=bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	public String work(){
		return "项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码";
	}

}
