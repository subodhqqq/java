import java.util.*;
public class firstarry{
public static void main(String[] args) {
   int a[]={1,2,3,4,5};
    for(int i=0; i<a.length;i++){
          System.out.println(a[i]);
          

    }
    fromUser();
}

public static void fromUser(){
    System.out.println("enter the Array size");
    int size=new Scanner(System.in).nextInt();
    int b[]=new int[size];
    for(int i=0;i<b.length;i++){
        System.out.println("enter the element of array:");
        b[i]=new Scanner(System.in).nextInt();

    }
    for(int i=0;i<b.length;i++){
        
        System.out.println("the elemet of array is:"+b[i]+" ");
        
    }

}
}