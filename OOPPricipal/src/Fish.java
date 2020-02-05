class Fish extends Animal{
	public String reproduction = "egg";
	public String outerCovering = "Scales";
	private String name;
	void move() {
		 System.out.println("Moves swimming.");
     }
	void eat() {
		 System.out.println("Eats fishfood.");
}	 
	// POLYMORPHISM
	public void swim() {
		System.out.println("The fish is swimming.");
	}
	public void swim(int depth) {
		System.out.println("The fish is swimming " + depth + " metres under water.");
	}
	public void swim(String name, int depth) {
		System.out.println("The " + name + " is swimming " + depth + " feet under water.");
}

	public void swimUp() {
		System.out.println("swimming up...");
	}
	public void swimDown() {
		System.out.println("swimming down...");
	}
}

interface Animal1 {
	
	public void sound();
}
class AnyFish implements Animal1{
	public void sound()
	{
		System.out.println("No sound as Such....");
	}
}
//INHERITANCE
class Whale extends Fish {
	public String name;
	public int lifespan = 15;
	
	//ENCAPSULATION
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

abstract class Animal {
	// abstract methods
	abstract void move();
	abstract void eat();

	// concrete method
	void label() {
		System.out.println("Animal's data:");
}}

class TestWhale {
	public static void main(String[] args) {		
		Whale myWhale = new Whale();
		AnyFish ob=new AnyFish();
		myWhale.setName("Whale");

		System.out.println("Name: " + myWhale.getName()); 			
		System.out.println("Reproduction: " + myWhale.reproduction);
		System.out.println("Outer covering: " + myWhale.outerCovering);
		System.out.println("Lifespan: " + myWhale.lifespan);
		ob.sound();
		myWhale.swimUp();
		myWhale.swimDown(); 		
		myWhale.swim();
		myWhale.swim(10000);
		myWhale.swim("Whale", 10000);
	}
}