import java.io.*;
import java.util.*;
public class Largestelementarr{

public static void main(String[] args){
    int[] arr={10,20,50,30,300,21212242,433,3242,4352242};
    int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
        max=arr[i];
       }
}
System.out.println("maximum element of the array is "+max);
}
}