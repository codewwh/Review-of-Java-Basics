package TestPointDistance;
/***
    1、可以生成具有特定坐标的点对象
    2、提供可以设置三个坐标的方法
    3、提供可以计算该点距远点距离平方的方法
***/
class Point{
	double x, y, z;
	
    Point(double _x,double _y,double _z) {
	x = _x;
	y = _y;
	z = _z;	 
}
    double getDistance(Point p) {
    	return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
    }
}
public class TestPoint{
	public static void main(String[] args) {
		Point p1 = new Point(1.0,2.0,3.0);
		Point p2 = new Point(2.0,3.0,4.0);
		System.out.println(p1.getDistance(p2));
	}
}
