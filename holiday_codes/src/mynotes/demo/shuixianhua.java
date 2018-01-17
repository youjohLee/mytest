package mynotes.demo;

public class shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n;
		
		System.out.println("水仙花数：");
		for(n=100;n<1000;n++){
			i=n/100;
			j=(n-i*100)/10;
			k=n%10;
			if(i*i*i+j*j*j+k*k*k==n){
				System.out.print("\t"+n);
			}
		}
	}

}
