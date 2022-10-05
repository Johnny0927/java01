class Cal_area
 {
 int radius, round;
 final double PI = 3.14159;
 int l=4, w=5, h=6;
 String name;

 void setR(int r)
 {
 radius=r;
 }
 void setP(int p) 
 {
 round=p;
 }
 void setName(String s)
 {
 name=s;
 }
 void show()
 {
 System.out.println("半徑="+ radius);
 System.out.println("球形體積="+ PI*(radius*radius));
 System.out.println("長="+l+",寬="+w+",高="+h);
 System.out.println("立方體表面積="+ (l*w)*h);
 }
 void setWindows(int r,int p)
 {
 radius=r;
 round=p;
 }
 void setWindows(int r,int p,String s)
 {
 radius=r;
 round=p;
 name=s;
 }
 }
public class main {
	public static void main(String[] args) {
		Cal_area cw = new Cal_area();
		 cw.setName("1st Windows");
		 cw.setR(10);
		 cw.setP(10);
		 cw.show();
	}

}
