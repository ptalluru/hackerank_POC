package Inheritance;

//Methods that are already overridden by other candidates are ignored. 
//This circumstance can arise when supertypes share a common ancestor.

//Consider the following interfaces and classes:

 interface Animal1 {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}
 interface EggLayer extends Animal1 {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
 interface FireBreather extends Animal1 { }
public class Dragon implements EggLayer, FireBreather {
    public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}
/*If two or more independently defined default methods conflict, or a default method conflicts with an
 *  abstract method, then the Java compiler produces a compiler error. You must explicitly override 
 *  the supertype methods.
 

Consider the example about computer-controlled cars that can now fly. 
You have two interfaces (OperateCar and FlyCar) that provide default implementations for the same method,
 (startEngine):

public interface OperateCar {
    // ...
    default public int startEngine(EncryptedKey key) {
        // Implementation
    }
}
public interface FlyCar {
    // ...
    default public int startEngine(EncryptedKey key) {
        // Implementation
    }
}
A class that implements both OperateCar and FlyCar must override the method startEngine. 
You could invoke any of the of the default implementations with the super keyword.

public class FlyingCar implements OperateCar, FlyCar {
    // ...
    public int startEngine(EncryptedKey key) {
        FlyCar.super.startEngine(key);
        OperateCar.super.startEngine(key);
    }
}
The name preceding super (in this example, FlyCar or OperateCar) must refer to a direct superinterface 
that defines or inherits a default for the invoked method. This form of method invocation is not restricted 
to differentiating between multiple implemented interfaces that contain default methods with the 
same signature. You can use the super keyword to invoke a default method in both classes and interfaces.


Note: Static methods in interfaces are never inherited.

*/