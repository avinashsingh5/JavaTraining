//Overriding the equals class

public class P3 {
	int id;
	String name;
	
	public P3(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		P3 ref = (P3) obj;
		return this.id == ref.id && this.name == ref.name;
	}
	public static void main(String[] args) {
		P3 ref1 = new P3(1,"Mohit");
		P3 ref2 = new P3(1,"Mohit");
		
		System.out.println("ref1: "+ ref1);
		System.out.println("ref2: "+ ref2);
        
		System.out.println(ref1.equals(ref2)); // true
		
	}
}