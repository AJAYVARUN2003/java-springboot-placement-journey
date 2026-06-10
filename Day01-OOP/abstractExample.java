// Abstract class
abstract class Animal{
public abstract void sound();

public void eat(){
System.out.println("The Animal is eating");
}
}

class Pig extends Animal{
public void sound(){
System.out.println("The animal makes sound");
}
}

class abstractExample{
public static void main(String[] args){
Pig p=new Pig();
p.eat();
p.sound();
}
}