package mynotes.demo;

public class staticUse_example02 {
	int i=0;
	static int j=0;
	public void print(){
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticUse_example02 exam1=new staticUse_example02();
		exam1.i++;
		exam1.j++;
		exam1.print();
		staticUse_example02 exam2=new staticUse_example02();
		//System.out.println(staticUse_example02.j);
								//通过类名访问静态变量
		exam2.print();
	}

}
