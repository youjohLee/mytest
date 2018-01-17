package mynotes.demo;

public class this_quote_demo02 {
	
	this_quote_demo02 instance;	//instance：实例
	
	public this_quote_demo02(){
		instance=this;	//this代表自身对象
		this.test();	//this引用成员方法,this可省略
	}
	
	public void test(){
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new this_quote_demo02();
	}

}
