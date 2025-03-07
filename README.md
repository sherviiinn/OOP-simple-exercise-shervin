# 🚀 Object-Oriented Programming (OOP) in Java

## 📜 Table of Contents
1. 🎯 Introduction to OOP
2. 🏛️ Understanding Classes and Objects
3. 🏗️ Principles of OOP
   - 🔒 Encapsulation
   - 🎭 Abstraction
   - 👪 Inheritance
   - 🔄 Polymorphism
4. 📝 Exercise

---

## 🎯 1. Introduction to OOP
Object-Oriented Programming (OOP) is a paradigm that organizes software into **objects**, allowing better modularity, **code reuse**, and **scalability**.

### ✨ Key Benefits:
✅ **Code Reusability**: Write once, use multiple times.
✅ **Modularity**: Divide large programs into smaller components.
✅ **Easy Maintenance**: Modify and update code with minimal effort.

---

## 🏛️ 2. Understanding Classes and Objects
A **class** is a blueprint for creating objects, defining properties (fields) and behaviors (methods). An **object** is an instance of a class.

### 📌 Defining a Class
```java
class Car {
    String brand;
    int speed;
    
    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    // Method to display car details
    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
```

### 📌 Creating an Object
```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120);
        myCar.display();
    }
}
```

### 🔹 Key Concepts:
- **Class**: Defines properties and methods.
- **Object**: An instance of a class with actual values.
- **Constructor**: Initializes objects when they are created.

---

## 🏗️ 3. Principles of OOP

### 🔒 Encapsulation
Encapsulation is the practice of bundling data (**fields**) and methods (**functions**) inside a class and restricting direct access to the data.

```java
class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

### 🎭 Abstraction
Abstraction hides unnecessary details and **only exposes essential features**.

```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("🐶 Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
```

### 👪 Inheritance
Inheritance allows one class to acquire the properties of another class.

```java
class Vehicle {
    String brand = "Ford";

    void honk() {
        System.out.println("Beep Beep! 🚗");
    }
}

class Car extends Vehicle {
    String model = "Mustang";
}
```

### 🔄 Polymorphism
Polymorphism allows objects to be treated as their parent class, enabling **flexibility and scalability**.

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("🐱 Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
```

---

## 📝 4. Exercise

### 🏆 Task: Create a Simple Person Class

**Objective:**
- Understand basic OOP concepts like **Encapsulation** and **Methods**.

### 📝 Instructions:
1. Create a `Person` class with private fields for `name` and `age`.
2. Implement a constructor to initialize these fields.
3. Add getter and setter methods.
4. Create a method to display the person's details.
5. Instantiate the class and test the methods in a `Main` class.

✅ **Bonus Challenge:** Add a method to check if the person is an adult (age >= 18) and print a message accordingly! 🚀

### 🔗 Submit Your Work:
Fork this repository: [OOP Simple Exercise](https://github.com/Kourosh-Abbasi/OOP-simple-exersize.git) and implement the exercise in your own fork.
1. **Fork** the repository.
2. **Clone** your forked repository to your local machine.
3. **Implement** the required changes.
4. **Commit & Push** your solution.
5. **Create a Pull Request** to submit your work.

Happy coding! 🚀

