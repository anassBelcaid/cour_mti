package classes;

public class RPGClient {

	public static void main(String[] args) {
		
		/// Declarer un gérrier
		Guerrier g1=new Guerrier("Guerrier1",2000,100,100,20);
		Guerrier g2=new Guerrier("Geurrier2",1000,150,100,30);
		
		//Decaler les magicienns
		Magician m1=new Magician("mage1",1500,70,80,120);
		Magician m2=new Magician("mage2",1000,80,80,130);
		
		
		while(g2.isAlive() && m2.isAlive())
		{
			//g2 attaque m2
			g2.attaquerMagician(m2);
			
			//Afficher l'état de m2
			g2.afficherInfo();
			
			//m2 attaque g2
			
			m2.attaquerGuerrier(g2);
			
			//Afficher l'état de g2
			m2.afficherInfo();
			
		}
		
		if(g2.isAlive())
		{
			System.out.println("Le joueur"+g2.getName()+ " a gagné");
		}
		
		else
		{
			//Afficher que m2 a gagné
			System.out.println("Le joueur "+m2.getName()+" a gagné");
		}
		
		
	}

}
