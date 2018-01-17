package Construction_method.demo;

public class Father extends Grandpa{
	protected Father(){
		System.out.println("default Father");
	}
	
	public Father(String grandpaName,String fatherName){
		super(grandpaName);		//调用父类的构造方法
		System.out.println(fatherName);
	}
}
