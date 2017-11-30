package classes;

public class Guerrier {

	private String name;
	private int HP;
	private int AP;
	private int DF;
	private int MP;
	private static int nbGuerriers=0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		if(hP>=0)
			HP = hP;
		else
			HP=0;
	}

	public int getAP() {
		return AP+(5*nbGuerriers);
	}

	public void setAP(int aP) {
		if(isValid(aP,0,255))
			AP = aP;
	}

	public int getDF() {
		return DF;
	}

	public void setDF(int dF) {
		if(isValid(dF,0,255))
			DF = dF;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		if(isValid(mP,0,255))
			MP = mP;
	}

	private boolean isValid(int value,int low,int high)
	{
		return (value>= low && value<=high);
	}
	public Guerrier(String name, int HP, int AP, int DF, int MP)
	{
		setName(name);
		setHP(HP);
		setAP(AP);
		setDF(DF);
		setMP(MP);
		nbGuerriers++;
	}
	
	public boolean isAlive()
	{
		return (getHP()>0);
	}
	
	public String className()
	{
		return "Guerrier";
	}
	public void afficherInfo()
	{
		System.out.printf("%s :: %s\n",className(),getName());
		System.out.printf("%2s: %5d\n","HP",getHP());
		System.out.printf("%2s: %5d\n","AP",getAP());
		System.out.printf("%2s: %5d\n","DF",getDF());
		System.out.printf("%2s: %5d\n","MP",getMP());
		
	}
	public void attaquerMagician(Magician autre)
	{
		System.out.println(getName()+"attaque ="+autre.getName());
		int diff=getAP()-autre.getDF();
		System.out.println("diff="+diff);
		if(diff>0)
		{
			System.out.println("Je change mes points de vie");
			autre.setHP(autre.getHP()-diff*5);
		}
	}
	
	public static void main(String []args)
	{
		Guerrier g1=new Guerrier("g1",2000,100,50,60);
		g1.afficherInfo();
		Guerrier g2=new Guerrier("g2",2000,110,50,60);
		g1.afficherInfo();
	}
}
