package polymorphism;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Artist extends JPanel {

	private ArrayList<Forme> formes;
	public Artist()
	{
		super();
		formes=new ArrayList<>();
	}
	public void ajouterForme(Forme e)
	{
		formes.add(e);
	}
	
	public void paintComponent(Graphics g)
	{
		for(Forme e:formes)
		{
			e.draw(g);
		}
	}
}
