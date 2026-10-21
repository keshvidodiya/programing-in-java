### Java Program: Overriding Method of Abstract Class


abstract class Animal
{
   
    abstract void sound();
}


class Dog extends Animal
{
    
    void sound()
    {
        System.out.println("Dog barks");
    }
}


class AbstractOverridingDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.sound();
    }
}

