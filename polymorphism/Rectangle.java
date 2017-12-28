package polymorphism;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Forme {

	public Rectangle(Point a,Point b,Color c)
	{
		super();  //constructeur par defaut de forme
		ajouterPoint(a);
		ajouterPoint(b);
		setColor(c);
	}
	
	public double perimetre()
	
	{
		Point a=points.get(0);
		Point b=points.get(1);
		double longeur=b.getX()-a.getX();
		double largeur=b.getY()-a.getY();
		
		return 2*(longeur+largeur);
	}
	public double surface()
	{
		Point a=points.get(0);
		Point b=points.get(1);
		double longeur=b.getX()-a.getX();
		double largeur=b.getY()-a.getY();
		return largeur*longeur;
	}
	public void draw(Graphics g)
	{
		Point a=points.get(0);
		Point b=points.get(1);
		g.setColor(getColor());
		g.fillRect(a.getX()	, a.getY(), b.getX(), b.getY());
		
		//changer la couleur en blanche
		g.setColor(Color.WHITE);
		StringBuilder S=new StringBuilder();
		S.append(this.perimetre());
		g.drawString(S.toString(), a.getX(), a.getY());
	}
	public static void main(String[] args) {
		
		Point o=new Point();
		Point b=new Point(3,4);
		Rectangle r1=new Rectangle(o, b, Color.BLUE);
		System.out.println(o);
		//Comment peut on afficher r1
		System.out.println(r1);
		
		//Afficher le périmètre
		System.out.println("Perimètre de r1 est "+r1.perimetre());
		System.out.println("Surface de r1 est ="+r1.surface());
	}

}
