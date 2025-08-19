package java2;

class Animal {
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}
class Dog extends Animal {
 void makeSound() {
     System.out.println("Dog barks");
 }
}
class Cat extends Animal {
 void makeSound() {
     System.out.println("Cat meows");
 }
}
public class Polymorphism {
 public static void main(String[] args) {
     Animal myAnimal;

     myAnimal = new Dog(); 
     myAnimal.makeSound();  

     myAnimal = new Cat();  
     myAnimal.makeSound();  
 }
}

