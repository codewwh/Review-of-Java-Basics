package TestPointDistance;
/***
    1���������ɾ����ض�����ĵ����
    2���ṩ����������������ķ���
    3���ṩ���Լ���õ��Զ�����ƽ���ķ���
***/
class Point{
	double x, y, z;
	
    Point(double _x,double _y,double _z) {
	x = _x;
	y = _y;
	z = _z;	 
}
    void setX(double _x) {
    	x = _x;
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
		
		p1.setX(5.0);
		System.out.println(p1.getDistance(new Point(3.0,4.0,5.0)));
	}
}
