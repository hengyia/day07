package day7Zuoye;



public class SchoolDemo {
	public static void main(String[] args) {
	
	Teacher t=new Teacher("��־��",30,"Java�������������");
	Student s=new Student("����",18,"�������");
	
	
	System.out.println("����Ϊ"+t.getAge()+"��"+t.getName()+"��ʦ����"+t.eat());
	System.out.println("����Ϊ"+t.getAge()+"��"+t.getName()+"��ʦ���ڿ��ܵ�"+t.study()+"��"+t.getContent()+"��֪ʶ");
	System.out.println("����Ϊ"+s.getAge()+"��"+s.getName()+"����"+s.eat());
	System.out.println("����Ϊ"+s.getAge()+"��"+s.getName()+"����ר����־��"+s.study()+"��"+s.getContent()+"��֪ʶ");
	}

}
