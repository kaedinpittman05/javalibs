/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;

/**
 *
 * @author kpittman
 */
public class JavaLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 =0;
        double number2 = 0;
        double number3= 0;
        double number4= 0;
        double number5 =0;
        double total = 0;
        double total2= 0;
        double total3=0;
        String firstName;
        String yes;
        String person1;
        String person2;
        String person3;
        
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Please enter first name");
        firstName = sc.nextLine();
        
        System.out.println("Hi"+firstName + " do you want to buy cookies");
        yes = sc.nextLine();
        
        System.out.println("Please enter the emount of cookies you want");
        number1 = sc.nextInt();
        
        
        System.out.println(" if 12 cookies cost $12.12");
        System.out.println("how much does it cost for 1 cookie");
        number2 = sc.nextDouble();
        
        System.out.println("now using this information how much would ");
        System.out.println(number1 + " cookies cost");
        number3= sc.nextDouble();
        
        System.out.println("lets compare answers");
        
        total= number1*number2;
        
        System.out.println("is "  +total+  " equal to " +number3);
        yes = sc.next();
        
        System.out.println("if you split the cost of " + total+ " with 3 people");
        System.out.println("how much would you each have to pay");
        number4 = sc.nextDouble();
        
        total2= total/4;
        
        System.out.println("the total each person would pay is "+ total2);
        
        System.out.println("who is the first person you would splt the cost with");
        person1= sc.next();
        
        System.out.println("who is the second person you would splt the cost with");
        person2 =sc.next();
        
        System.out.println("who is the third person you would splt the cost with");
        person3 = sc.next();
        
        System.out.println("How many cookies would the 4 of you get");
        
        System.out.println("if you split them eveanly amoung your selves");
        number5= sc.nextDouble();
        
        total3= number1/4;
        
        
        System.out.println("The correct answer is " +total3);
        
        
    }
    
    
   
    
    
    
    
    
    
    
    
}
