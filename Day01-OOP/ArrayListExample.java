import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
ArrayList<String> foods=new ArrayList<>();
System.out.println("Enter how many food you want:");
int numOfFood=sc.nextInt();
sc.nextLine();
for(int i=0;i<numOfFood;i++){
System.out.print("Enter food "+i+":");
String food=sc.nextLine();
foods.add(food);
}
System.out.println(foods);
sc.close();
}
}
