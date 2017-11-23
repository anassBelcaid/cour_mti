import java.util.Scanner;

class Villes {
	
	static int num_villes=5;
	public static Point villes[];   //vecteur des villes


	public static void afficherDistance(Point[] villes,int i)
	{
		Point ville_r=villes[i];

		System.out.printf("%10s",ville_r.getNom());

		for(Point ville_d:villes)
			System.out.printf("%10.2f",ville_r.distance(ville_d));
		System.out.println("");
	}
	public static void main(String[] args) {
		

		//Scanner
		Scanner in=new Scanner(System.in);
		//reserver les villes
		villes=new Point[num_villes];


		for(int i=0;i<num_villes;i++)
		{
			double x=in.nextDouble();
			double y=in.nextDouble();
			String nom=in.next();

			villes[i]=new Point(x,y,nom);
		}

		/*--------------Afficher l'entete-----------*/
		System.out.printf("%10s"," ");
		for(int i=0;i<num_villes;i++)
			System.out.printf("%10s",villes[i].getNom());
		System.out.println("");

		for(int i=0;i<num_villes;i++)
			afficherDistance(villes,i);
	}
}