public class Point2D {
	double x;
	double y;
	Point2D(double m,double n){                             
		x = m;
		y = n;
	}
	public String getDetails()                              
	{
	   return "Point ("+x+","+y+")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point2D p1 = new Point2D(5.0,3.0);
		
		String gd = p1.getDetails();
		System.out.println(gd);
		}
}

