
public class Puppy {
	int puppyAge;
	public Puppy(String name){
		System.out.println("С���������ǣ�"+ name);
	}
	public void setAge(int age){
		puppyAge = age;
	}
	public void getAge(){
		System.out.println("С��������Ϊ��"+ puppyAge);
	}
	public static void main(String[] args){
		/* �������� */
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		
	}

}
