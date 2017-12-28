package heritage;

public class Permanant extends Employee {
	
	private double salMensuel;     //salaire mensuel;
	
	

	public Permanant(String name, int id, int numSom, double percent, double salMensuel) {
		super(name, id, numSom, percent);
		this.salMensuel = salMensuel;
	}

	public double Salaire()
	{
		return salMensuel+percent*nbArticles;
	}

	public static void main(String[] args) {
		Permanant emp=new Permanant("emp", 2, 111222, 0.5, 2000);
		
		System.out.println(emp);
	}

	@Override
	public String toString() {
		return "Permanant [salMensuel=" + salMensuel + ", percent=" + percent + ", nbArticles=" + nbArticles + "]";
	}

}
