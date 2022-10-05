// example of runtime polymorphism
// all classes inherit from the Mammal class
// the Mammal class provides the MammalSound() method, which is overridden by the subclasses
class Mammal {
    public void MammalSound() {
        System.out.println("The Mammal makes a sound");
    }
}
    
class Pig extends Mammal {
    public void MammalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Mammal {
    public void MammalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Mammal myMammal = new Mammal();  // Create a Mammal object
        Mammal myPig = new Pig();  // Create a Pig object
        Mammal myDog = new Dog();  // Create a Dog object
        myMammal.MammalSound();
        myPig.MammalSound();
        myDog.MammalSound();
    }
}