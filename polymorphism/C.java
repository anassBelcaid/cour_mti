package polymorphism;

public class C extends B {

	public void meth() {
		System.out.println("***");
	}
	public static void main(String[] args) {
		
		A o1=new A();
		o1.meth();
		
		//B o2=new A();
		
		o1=new B();
		//o1.meth2();
		o1.meth();
		
		C o3=new C();
		o3.meth2();
		o3.meth();
		System.out.println("==============================");
		A o4=new C();
		o4.meth();
	}

}
