package Construction_method.demo;

public class interface_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyPrint mp=new MyPrint();	//定义MyPrint类的对象
		 System.out.println("print all message:");
		 mp.printAllMessage();		//使用实现了的接口方法
		 System.out.println("print first message:");
		 mp.printFirstMessage();
		 System.out.println("print last message:");
		 mp.printLastMessage();
	}

}
