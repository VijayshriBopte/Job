interface FunInt {
	public void m1();
	public default boolean equals() {
		//System.out.println("equals");
		return false;
	}

}
class A implements FunInt{

	@Override
	public void m1() {
		System.out.println("class");
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.equals();
	}
	
}