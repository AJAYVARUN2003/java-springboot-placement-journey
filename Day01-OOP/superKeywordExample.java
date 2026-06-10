class Animal{
public void sound(){
System.out.println("The animal makes sound");
}
}

class Dog extends Animal{
public void sound(){
super.sound();/*Super keyword first calls the parent class method then it calls sub classmethod*/
System.out.println("The dog Bow Bow");
}
}

public class superKeywordExample{
public static void main(String[] args){
Dog d=new Dog();
d.sound();
}
}
