package Construction_method.demo;

//定义抽象类
public abstract class Animal {
	String str;
	
	Animal(String s){	//定义抽象类的一般方法 
		str=s;
		System.out.println(str);
	}
	
	abstract void eat();	//定义抽象方法
}
						/*
						 * 抽象方法可以没有方法体，但具体方法要有。
						 */