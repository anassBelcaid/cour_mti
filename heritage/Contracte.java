package heritage;

public class Contracte extends Employee {

	public Contracte(String name,int id,int numSom,double percent)
	{
		super(name,id,numSom,percent);
	}
	public double salaire()
	{
		return 400*percent*nbArticles;
	}
	
	@Override
	public String toString() {
		return "Contracte [percent=" + percent + ", nbArticles=" + nbArticles + "]";
	}
	public static void main(String[] args) {
		
		Contracte cont1=new Contracte("cont1", 2, 11122, 0.5);
		cont1.setNbArticles(3);
		Permanant per1=new Permanant("per", 3, 33311, 0.2, 2000);
		per1.setNbArticles(2);
		
		//reference globales
		//Contracte cont2=new Employee("name", 3, 3443, 0.5); error
		
		Permanant per2=new Permanant("per2",3,3231,0.6,1000);
		Employee em=per2;
		System.out.println("salaire="+per2.Salaire());
	
		
	}

}
