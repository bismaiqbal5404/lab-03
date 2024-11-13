
package lab_03_ex_1;

import java.util.Scanner;

public class Lab_03_ex_1 { 
   static String pNumber,pName,pEmail,pContact,pComplain;
   static double pBill;
   static int age;
   
   public static void Take_Patient_data(){
       Scanner input = new Scanner( System.in);
       System.out.println("Enter Patient' Number please");
       pNumber = input.nextLine();
       System.out.println("Enter Patient's Name please");
       pName = input.nextLine();
       System.out.println("Enter Patient's Complain please");
       pComplain = input.nextLine();
       System.out.println("Enter Patient's Age please");
       age = input.nextInt();
       System.out.println("Enter Patient's Email please");
       pEmail = input.nextLine();
       System.out.println("Enter Patient's Contact please");
       pContact = input.nextLine();
       System.out.println("Enter Patient's Bill please");
       pBill = input.nextDouble();
      
   }
   
   public static void Print_Receipt(){
       System.out.println("Patient's Recipt");
       System.out.println("Patient's Number" + pNumber);
       System.out.println("Patient's Name" + pName);
       System.out.println("Patient's Complain" + pComplain);
       System.out.println("Patient's Email" + pEmail);
       System.out.println("Patient's Contact" + pContact);
       System.out.println("Patient's Bill" + pBill);  
   }
  
    public static void main(String[] args) {
     Take_Patient_data();
     Print_Receipt();
   
    }
    
}
