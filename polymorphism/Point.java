package polymorphism;

public class Point {

	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point()
	{
		setX(0);
		setY(0);
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Surchage
	public void deplacer(int dx,int dy)
	{
		setX(getX()+dx);
		setY(getY()+dy);
	}
	
	public void deplacer(Point o)
	{
		setX(getX()+o.getX());
		setY(getY()+o.getY());
	}
	
	public double distance(Point o)
	{
		double dx=getX()-o.getX();
	    double dy=getY()-o.getY();
	    return Math.sqrt(dx*dx+dy*dy);
	}
	
	public String toString()
	{
		StringBuilder S=new StringBuilder();
		S.append("(");
		S.append(getX());
		S.append(","+getY()+")");
		return S.toString();
	}
}
