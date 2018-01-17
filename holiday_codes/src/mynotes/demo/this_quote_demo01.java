package mynotes.demo;

public class this_quote_demo01 {	//this()起到优化代码的作用
	private String name;
	private int age;
	
	/*
	 * java编译器会根据所传递的参数数量的不同，
	 * 来判断该调用哪个构造方法。
	 */
	public this_quote_demo01(){
		System.out.println("Hello");
	}
	public this_quote_demo01(String name){
		//System.out.println("Hello");
		this();
		this.name=name;
	}
	public this_quote_demo01(String name,int age){
		//System.out.println("Hello");
		//this.name=name;
		this(name);
		this.age=age;
		get();
	}
	//.....
	public void get(){
		System.out.println( name+" "+age);
	}
	public static void main(String[] args) 
			throws Exception{
		// TODO Auto-generated method stub
		new this_quote_demo01("张三",20);
	}

}
