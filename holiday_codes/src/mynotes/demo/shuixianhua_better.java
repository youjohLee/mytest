package mynotes.demo;

public class shuixianhua_better {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		System.out.println("水仙花数：");
		for(i=1;i<10;i++)
		for(j=0;j<10;j++)	
		for(k=0;k<10;k++)
			if(100*i+10*j+k==i*i*i+j*j*j+k*k*k)
				//System.out.print(i+j+k);
				//System.out.print(i+j+k+"\t");
				//System.out.print("\t"+(i+j+k));
				
				System.out.print("\t"+i+j+k);
	}

}
