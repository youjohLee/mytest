package Construction_method.demo;

public interface PrintMessage {
	public static final int count=10;	/*接口声明
										*（public static final可全省略或部分省略）
	 									*/
	public abstract void printAllMessage();		//
	public void printLastMessage();		//抽象方法声明（public abstract可全省或部分省）
	public void printFirstMessage();	//
}
