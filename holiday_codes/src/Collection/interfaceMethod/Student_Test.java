package Collection.interfaceMethod;

import java.util.ArrayList;
import java.util.Collection;

public class Student_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建学生对象
		Student stu1=new Student();
		
		stu1.setStuNo("1111111");
		stu1.setStuName("aa");
		stu1.setStuAge(18);
		stu1.setStuAddress("北京");
		
		Student stu2=new Student();
		
		stu2.setStuNo("222222");
		stu2.setStuName("bb");
		stu2.setStuAge(19);
		stu2.setStuAddress("上海");
		
		//创建集合对象
		Collection collection=new ArrayList();
		
		//添加对象
		collection.add(stu1);
		collection.add(stu2);
		System.out.println("after add object:");
		System.out.println("collection.size()="+collection.size());
		
		//判断集合是否为空
		boolean isEmpty=collection.isEmpty();
		System.out.println("集合是否为空："+isEmpty);
		
		//判断集合是否包括某个对象
		boolean isContains=collection.contains(stu2);
		System.out.println("集合是否包含stu2:"+isContains);
		
		//清除集合内对象
		collection.clear();
		System.out.println("after clear:");
		System.out.println("collection.size()="+collection.size());
	}

}
