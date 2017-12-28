package heritage;

public class Employee {

	//Attributs
	private String name;
	private int id;
	private int numSom;
	protected double percent;
	protected int nbArticles;
	
	public void setNbArticles(int nbArticles)
	{
		this.nbArticles=nbArticles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id = (id>=0)?id:0;
	}
	public int getNumSom() {
		return numSom;
	}
	public void setNumSom(int numSom) {
		this.numSom = numSom;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		if(percent>=0 && percent <=1)
			this.percent = percent;
		else
			this.percent=0;
	}
	public Employee(String name, int id, int numSom, double percent) {
		this.name = name;
		this.id = id;
		this.numSom = numSom;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", nbArticles=" + nbArticles + "]";
	}
	
	
   
	public static void main(String [] args)
	{
		Employee em1=new Employee("EMP", 1, 11111, 0.5);
		System.out.println(em1);
	}
	
}
