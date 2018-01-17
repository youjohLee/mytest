package Construction_method.demo;

public class MyPrint implements PrintMessage {	//实现接口的类MyPrint
	private String[] message;	//类中的成员变量message
	private int i;				//类中的成员变量i
	public MyPrint(){			//MyPrint类的构造方法
		message=new String[3];
		i=0;
		this.putMessage("Hello world!");	//使用MyPrint类的方法
		this.putMessage("Hello China!");	
		putMessage("Hello java!");			//this可省略
	}
	public void putMessage(String str){		//类中的方法
		message[i++]=str;
	}
	public void printAllMessage() {
		// 实现接口中的方法
		for(int k=0;k<message.length;k++){
			System.out.println("\t"+message[k]);
		}
	}
	public void printLastMessage() {
		// TODO Auto-generated method stub
		System.out.println("\t"+message[message.length-1]);
	}
	public void printFirstMessage() {
		// TODO Auto-generated method stub
		System.out.println("\t"+message[0]);
	}

}
