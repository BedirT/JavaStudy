package inheritance;

public class Child extends Inheritance{

	private int privVar;
	protected double protVar;
	int NormalVar;
	public char pubVar;
	
	public Child(int var1, double var2, char var3, int a, int b){
		
		super(var1,var2,var3);
		privVar = a;
		NormalVar = b;
		
	}
	
	protected void print(){
		
	}
	
}
