
import java.util.*;
public class pattern{
 
  
    public static void butterfly(int n){
   for(int i=1;i<=n;i++){
      // for star
      for(int j=1; j<=i ; j++){
              System.out.print("*");

      }
      // for space
     for(int j=1;j<=2*(n-i);j++){
          System.out.print(" ");

     }
     // for star
       for(int j=1; j<=i ; j++){
              System.out.print("*");

      }
                  System.out.println(" ");
   }
   // 2nd half
for(int i=n;i>0;i--){
      // for star
      for(int j=1; j<=i ; j++){
              System.out.print("*");

      }
      // for space
     for(int j=1;j<=2*(n-i);j++){
          System.out.print(" ");

     }
     // for star
       for(int j=1; j<=i ; j++){
              System.out.print("*");

      }
                  System.out.println(" ");
   }

 }
  
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a= sc.nextInt();

    butterfly(a);
  }
}