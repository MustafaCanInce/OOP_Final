# OOP_Final

## A. Class Diagram
https://github.com/MustafaCanInce/OOP_Final/blob/master/class_diagram.PNG

## B. What are the differences between an abstract class and a concrete class?

• Abstract class: is a restricted class that cannot be used to create objects (to access it, it must
be inherited from another class).

• Concrete class: A concrete class is a class that has an implementation for all of its methods. They
cannot have any unimplemented methods. It can also extend an abstract class or implement an
interface as long as it implements all their methods. It is a complete class and can be instantiated.

## C. What is Encapsulation?
The main purpose of encapsulation is to hide sensitive data from users. If a data member is private, it
is accessible only within the same class. No outer class can access the data as it is, but we use setter
and getter methods to update and read data from outside classes. This way the outer class can access
these private data.

• Better control of class attributes and methods

• Encapsulation increases data security in our code.

• It makes the code we write more flexible, it can change one part of the code without affecting
the other.

## D. What are the advantages of Inheritance in Object Oriented Programming?
Inheritance ; It is the mechanism that allows one class to inherit the attributes and methods of another
class. We use the extends keyword to inherit from the superclass we have created. superclass; inherit
class (I used ”Inventory” class as superclass in my code.) Sub class; class that inherits from another
class (my subclasses are ”Test”,”Bike” and ”Car”) I defined the attributes of Cars and Bike objects in
Inventory class, I set these attributes as setter and getter. In the Test class, I extended the Inventory
class and carried out the definition of attributes of the objects. The benefits of inheritance are;

• When we want to create a new class and there is a class that already contains some of the desired
code, we derive a new class from the existing class.

• We make use of inheritance and polymorphism to increase the fast performance and readability
of the code in the application.

• If we keep the variables constant in the superclass in inheritance; It can be used by the subclass
but cannot be changed.

E. Explain the usage of final keyword in java. Can you use final keyword in any part of your implementation? Explain why or
why not?
Final keyword is a non-access modifier applicable only to a variable, a method or a class.When a
variable is declared with final keyword, its value can’t be modified, essentially, a constant.if the final
keyword is used in classes, the class marked as final cannot be inherited.
I used the final keyword in my code.Because I wanted the prices of vehicles such as cars, motorcycles,
or the options of these vehicles to be kept at a constant value.
2
## F. Have you benefited from polymorphism in your implementation. If yes, copy the code segment where you use polymorphism to your report and give the name of the polymorphic variable.
I used polymorphism over methods in my code;
polymorphic variable ; ”display”.
```
interface vehicle {
void display();
}
class Bike extends Inventory implements vehicle{
...
@Override
public void display(){
...
}
}
class Car extends Inventory implements vehicle{
...
@Override
public void display(){
...
}
}
```
# References

[1] https://dys.mu.edu.tr/

[2] https://www.w3schools.com/java/

[3] https://www.geeksforgeeks.org/

[4] https://www.javatpoint.com/java-tutorial

[5] https://www.tutorialspoint.com/java

[6] https://docs.oracle.com/javase/tutorial/java

