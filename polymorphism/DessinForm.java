package polymorphism;

import java.awt.Color;

import javax.swing.JFrame;

public class DessinForm {

	public static void main(String[] args) {

		//Declarer les 7 points
		Point a1=new Point(0,0);
		Point a2=new Point(300,0);
		Point a3=new Point(0,300);
		Point a4=new Point(300,300);
		Point a5=new Point(600,300);
		Point a6=new Point(300,600);
		Point a7=new Point(600,600);
		
		//construire la forme
		Rectangle r1=new Rectangle(a1,a4, Color.GREEN);
		Rectangle r2=new Rectangle(a2, a5, Color.BLACK);
		Rectangle r3=new Rectangle(a3, a6, Color.BLACK);
		Rectangle r4=new Rectangle(a4, a7, Color.GREEN);
		
		
		JFrame app=new JFrame("Dessin forme");
		Artist A=new Artist();
		A.ajouterForme(r1);
		A.ajouterForme(r2);A.ajouterForme(r3);A.ajouterForme(r4);
		app.add(A);
		app.setSize(600, 600);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		
	}

}
