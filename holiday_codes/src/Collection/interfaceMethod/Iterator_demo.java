package Collection.interfaceMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象
		Collection collection=new ArrayList();
		
		//添加集合元素
		collection.add("stu1");
		collection.add("stu2");
		collection.add("stu3");
		
		//获得一个迭代器对象：iterator
		Iterator iterator=collection.iterator();
		while(iterator.hasNext()){//遍历
			Object element=iterator.next();
			System.out.println("iterator="+element);
		}
		
		if(collection.isEmpty()){
			System.out.println("collection is Empty!");
		}else{
			System.out.println("collection is not Empty! size="+collection.size());
		}
		
		//获得一个迭代器对象：iterator2
		Iterator iterator2=collection.iterator();
		while(iterator2.hasNext()){	//移除对象
			Object element=iterator2.next();
			System.out.println("remove:"+element);
			iterator2.remove();
		}
		
		//获得一个迭代器对象：iterator3
		Iterator iterator3=collection.iterator();
		if(!iterator3.hasNext()){	//查看是否还有元素
			System.out.println("没有元素了");
		}
		
		//判断集合是否为空
		if(collection.isEmpty()){
			System.out.println("collection is Empty!");
		}
	}

}
