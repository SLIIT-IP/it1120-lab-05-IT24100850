import java.util.Scanner;
public class IT24100850Lab5Q1
{
     public static void main(String[] args)
     {
     
         Scanner input = new Scanner(System.in);
         
         int number1;
         int number2;
         int number3;
   
         System.out.println("Enter the first integer : ");
         number1 = input.nextInt();

      
         System.out.println("Enter the second integer : ");
         number2 = input.nextInt();

  
         System.out.println("Enter the third integer : ");
         number3 = input.nextInt();


         System.out.println("User entered numbers are :" +number1+" "+number2+" "+number3);

     
         if(number1 < number2 && number1 < number3)
         {

             System.out.println("The smallest number is : " +number1);

         }


         else if(number2 < number1 && number2 < number3)
         {

             System.out.println("The smallest number is : " +number2);

         }
   
         else 
         {
   
             System.out.println("The smallest number is : " +number3);
    
         }

         if(number1 > number2 && number1 > number3)
         {
       
             System.out.println("The largest number is : " +number1);

         }
    
         else if(number2 > number1 && number2 > number3)
         {
  
             System.out.println("The largest number is : " +number2);

         }

         else
         {
 
             System.out.println("The largest number is : " +number3);

         }
  
     }
}



        
    