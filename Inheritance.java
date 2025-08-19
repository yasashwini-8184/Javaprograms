package java2;
class Animal {
	    void makeSound() {
	        System.out.println("Some generic animal sound");
	    }

	    void eat() {
	        System.out.println("This animal eats food");
	    }
	}

	// Derived class (Child)
	class Dog extends Animal {
	    void makeSound() {
	        System.out.println("Bark bark!");
	    }

	    void fetch() {
	        System.out.println("Dog is fetching the ball");
	    }
	}

	// Main class to test inheritance
	public class Inheritance{
	    public static void main(String[] args) {
	        Dog myDog = new Dog();

	        // Inherited method
	        myDog.eat();         // Output: This animal eats food

	        // Overridden method
	        myDog.makeSound();   // Output: Bark bark!

	        // Child class method
	        myDog.fetch();       // Output: Dog is fetching the ball
	    }
	}


