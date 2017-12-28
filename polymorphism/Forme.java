package polymorphism;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Forme {
	protected ArrayList<Point> points;
	private Color color;
	public Forme()
	{
		points=new ArrayList<>();
	}
	
	public Forme(ArrayList<Point> points)
	{
		// Hard copy
		this.points=(ArrayList<Point>) points.clone();
	}
	
	public Forme(Point [] points)
	{
		for(Point e:points)
			this.points.add(e);
	}
	
	public void ajouterPoint(Point e)
	{
		this.points.add(e);
	}
	
	//méthode a charger
	public double surface()
	{
		return 1;    //mauvaise progrmmation 
	}
	
	public double perimetre()
	{
		return 1;
	}

	public void draw(Graphics g)
	{
		//changer la couleur de dessin à ma propre couleur
		g.setColor(this.color);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Forme [points=" + points + ", color=" + color + "]";
	}
	
	
	
}
