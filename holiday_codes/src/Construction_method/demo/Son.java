package Construction_method.demo;

public class Son extends Father{
	public Son(){
		System.out.println("default Son");
	}
	public Son(String grandpaName,String fatherName,String sonName){
		super(grandpaName,fatherName);
		System.out.println(sonName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Son("Grandpa","Father","Son");
		new Son();
	}

}
