package day7Zuoye;

public class Dog {
	private String color;
	private String breed;
	public Dog(){}
	
	public Dog(String color,String breed){
		this.color=color;
		this.breed=breed;
	}

	

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String eat(){
		return "¿Ð¹ÇÍ·";
	}
	
	public String lookHome(){
		return "¿´¼Ò";
	}

}
