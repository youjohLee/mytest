package Construction_method.demo;

public class Dog extends Animal{
	String str;
	
	Dog(String s){
		super(s);
	}
	
	void eat(){
		System.out.println("狗吃骨头！");
	}
}
