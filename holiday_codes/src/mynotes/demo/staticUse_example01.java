package mynotes.demo;
class Count{
	private int serial;	//实例变量
	static int counter=0;	//类变量
	Count(){	//构造方法在初始化时自动调用
		counter++;	//实例计数器
		serial=counter;
	}
	int getSerial(){
		return serial;
	}
	int getCounter(){
		return counter;
	}
}
public class staticUse_example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		System.out.println("c1的serial值："+c1.getSerial());
		System.out.println("c1的counter值："+c1.getCounter());
		System.out.println("c2的serial值："+c2.getSerial());
		System.out.println("c2的counter值："+c2.getCounter());
		System.out.println("c3的serial值："+c3.getSerial());
		System.out.println("c3的counter值："+c3.getCounter());
		//System.out.println("类的serial值："+Count.serial);
										//不能通过类名访问非静态变量
		System.out.println("类的counter值："+Count.counter);
										//通过类访问静态变量
	}

}
