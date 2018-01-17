package mynotes.demo;

public class irregular_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]={{11},{21,22},{31,32,33,34}};
		int sum=0;
		System.out.println("数组b的行数："+b.length);
		for(int i=0;i<b.length;i++){
			System.out.println("b["+i+"]行的数据个数："+b[i].length);
			for(int j=0;j<b[i].length;j++){
				sum=sum+b[i][j];
			}
		}
		System.out.println("数组元素的总和："+sum);
	}

}
