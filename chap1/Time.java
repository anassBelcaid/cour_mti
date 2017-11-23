import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Time {
	
	private int s;
	private  int m;
	private  int h;

	public Time( int h, int m, int s)
	{
		setS(s);
		setM(m);
		setH(h);
	}

	public void setS( int s)
	{
		if(s>=0 && s<60)
			this.s=s;
	}
	public void setM(int m)
	{
		if(m>=0 && m<60)
		this.m=m;
	}
	public void setH( int h)
	{
		if(h>=0 && h<24)
			this.h=h;
	}
	public int getS()
	{
		return s;
	}
	public int getM()
	{
		return m;
	}
	public int getH()
	{
		return h;
	}

	public void afficher()
	{
		System.out.printf("%2d:%2d:%2d\n",getH(),getM(),getS());
	}


	public void ajouterSeconds(int s)
	{
		//obtenir le nombre de second
		int S=getS()+s;

		int M=S/60;
		s=S%60;

		setS(s);

		ajouterMinutes(M);
	}

	public void ajouterMinutes(int m)
	{
		int M=getM()+m;

		int H=M/60;
		m=M%60;

		setM(m);
		ajouterHeures(H);
	}
	public void ajouterHeures(int h)
	{
		int H=getH()+h;
		setH(H%24);
	}

	public boolean precede(Time autre)
	{
		if(getH()<autre.getH())
			return true;
		else if(getM()<autre.getM())
			return true;
		else if(getS()<autre.getS())
			return true;
		return false;
	}

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		//Construie l'heure actuelle
		Time current=new Time(17,15,30);
		current.afficher();

		current.ajouterSeconds(15);
		current.afficher();

		current.ajouterSeconds(120);
		current.afficher();

		current.ajouterSeconds(3600+120+16);
		current.afficher();

		//lire un temp
		System.out.println("Donner un temps (hh:mm:ss)");
		int h=in.nextInt();
		int m=in.nextInt();
		int s=in.nextInt();
		Time T=new Time(h,m,s);
		T.afficher();

		while(true)
		{
			try
			{
			//dormir pendent 1 second
			TimeUnit.SECONDS.sleep(1);
			}catch(Exception e){};
			T.ajouterSeconds(1);
			T.afficher();
		}
	}
}