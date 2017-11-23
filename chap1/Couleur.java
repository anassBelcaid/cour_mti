class Couleur {
	
	private int r;        //red
	private int g;        //green
	private int b;        //blue

	public Couleur()
	{
		r=0;
		g=0;
		b=0;
	}

	public Couleur(int r,int g,int b)
	{
		this.r=r;
		this.g=g;
		this.b=b;
	}

	public void setR(int r)
	{
		if(r>=0 && r<255)
			this.r=r;
	}
	public void afficher()
	{
		System.out.printf("(%3d,%3d,%3d)\n",r,g,b);
	}

	public static void main(String[] args) {
		
		//
		Couleur B=new Couleur(0,0,255);
		B.afficher();

		//le champs est public
		B.setR(-2);
		B.afficher();
	}
}