class Variables {
	//instance variable -> Each new Object has its own instance variable .
	int instanceVar = 10;

	static int staticVariable = 1500;

	final int finalVariable = 1000;

	public void display(){
		int localVariable = 1;
		System.out.println("value of instanceVar: "+instanceVar);
		System.out.println("Value of StaticVar: "+staticVariable);
		System.out.println("Value of finalVar: "+finalVariable);
		System.out.println("Value of finalVar: "+ finalVariable);
	}

	public static void main(String[] args){
		Variables obj1 = new Variables();
		obj1.display();

		Variables obj2 = new Variables();
		obj2.instanceVar = 20;
		obj2.display();

		obj1.instanceVar = 15;
		obj1.staticVariable = 1600;
		obj1.display();
		obj2.display();
	}
}



