

package group.lab_03_ex_04;


public class Lab_03_ex_04 {
    
    public static int product (int n){
       if (n ==1) {
           return 1;
       }
       return n*product(n-1);
    }
    public static void main(String[] args) {
      int  no = 5;
      int result = product(no);
      System.out.println("product of Number " + result);
          
      }
    }

