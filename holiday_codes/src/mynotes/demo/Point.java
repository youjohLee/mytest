package mynotes.demo;

public class Point {
	private double x,y;	//x和y的值
	
	public Point(double x,double y){	//构造方法设置坐标
		this.x=x;
		this.y=y;
	}
	
	public static double distance(Point p1,Point p2){	//求两点间距离
		return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p01=new Point(3,4);
		Point p02=new Point(8,9);
		System.out.println("The distance of two points is：");
		System.out.println(Point.distance(p01, p02));
	}

}
