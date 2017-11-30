package classes;

public class Magician {
	
	private String name;
	private int HP;
	private int AP;
	private int DF;
	private int MP;
	private static int nbMagiciens;
	
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
		return AP;
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
		return MP+(10*nbMagiciens);
	}

	public void setMP(int mP) {
		if(isValid(mP,0,255))
			MP = mP;
	}
	public boolean isAlive()
	{
		return (getHP()>0);
	}
	private boolean isValid(int value,int low,int high)
	{
		return (value>= low && value<=high);
	}
	
	//constructor
	public Magician(String name,int HP, int AP,int DF, int MP)
	{
		setName(name);
		setHP(HP);
		setAP(AP);
		setDF(DF);
		setMP(MP);
		nbMagiciens++;
	}

	
	
	
	public void attaquerGuerrier(Guerrier autre)
	{
		System.out.println(getName()+"attaque ="+autre.getName());
		int diff=getAP()-autre.getDF();
		if(diff>0)
		{
			autre.setHP(autre.getHP()-diff*5);
		}
	}
	
	public String className()
	{
		return "Magician";
	}
	public void afficherInfo()
	{
		System.out.printf("%s: %s\n",className(),getName());
		System.out.printf("%2s: %5d\n","HP",getHP());
		System.out.printf("%2s: %5d\n","AP",getAP());
		System.out.printf("%2s: %5d\n","DF",getDF());
		System.out.printf("%2s: %5d\n","MP",getMP());
	}
}
