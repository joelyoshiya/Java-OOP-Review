// Good example of Inheritance -> Pig "IS-A" Animal

// Abstract class - The Specification
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
  }
  
  // Subclass (inherit from Animal) - The Implementation
  class Cow extends Animal { // extends indicates the Pig class inherits from the Animal class
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The cow says: I'm a cow");
    }
  }
  
  class Abstract {
    public static void main(String[] args) {
      Cow myCow = new Cow(); // Create a Pig object
      myCow.animalSound();
      myCow.sleep();
    }
  }