package mynotes.demo;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray []={10,36,94,57,42,87,56,34};
		int len=intArray.length;
		int i,j;
		System.out.println("排序前：");
		for(i=0;i<len;i++){
			System.out.print(" "+intArray[i]);
		}
		
		boolean isSorted=true;	//代码优化
		
		for(i=0;i<len-1;i++){
			for(j=len-1;j>i;j--){
				if(intArray[j-1]>intArray[j]){	//判定条件 
					isSorted=false;
					int temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
			if(isSorted) break;	//若原本已排好序，则退出比较
		}
		System.out.println();
		System.out.println("排序后：");
		for(i=0;i<len;i++){
			System.out.print(" "+intArray[i]);
		}
	}

}
