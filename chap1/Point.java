class Point {
	
	
	public double x;
	public double y;
	public String nom;

		public Point()
		{
			setX(0.0);
			setY(0.0);
			setNom("O");
		}

		public Point(double x,double y,String nom)
		{
			setX(x);
			setY(y);
			setNom(nom);
		}

		public void setX(double x)
		{
			this.x=x;
		}
		public void setY(double y)
		{
			this.y=y;
		}
		public void setNom(String nom)
		
		{
			this.nom=nom;
		}

		public double getX()
		{
			return x;
		}
		public double getY()
		{
			return y;
		}
		public String getNom()
		{
			return nom;
		}

		public void afficher()
		{
			System.out.printf("%s(%.2f, %.2f)\n",getNom(),getX(),getY());
		}

		public double distance(Point autre)
		 {
		 	double dx=autre.getX()-getX();
		 	double dy=autre.getY()-getY();

		 	return Math.sqrt(dx*dx+dy*dy);
		 }
}