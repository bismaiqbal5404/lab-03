

package group.lab_03_ex_05;


public class Lab_03_ex_05 {
    public static int  sum( int a , int b){
        if ( a ==b){
            return a;
        }
        else if (a<b){
            return a + sum(a+1,b);
        }
        else{
            return b + sum(a,b+1);
        }
    }
    public static void main(String[] args) {
       int num1=1;
       int num2=20;
       int res = sum(num1,num2);
       System.out.println("Sum of numbers between " + num1 + " and " + num2 + " is: " + res);
    }
}
