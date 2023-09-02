package Atm;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Atm{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        String userName, password;

        int right=3;
        int balance=1500;
        int select;


        while(right>0){

        System.out.print("Your User Name: ");
        userName=input.nextLine();
        System.out.print("Your Password: ");
        password=input.nextLine();
        
        if(userName.equals("hunter") && password.equals("hunter24")){
            System.out.println("You entered the system successfuly");
            System.out.println("Welcome to The DedectiveBank!");
            
            do {
                 System.out.println("Please select the operation you want to perform");
            System.out.println("1. Deposit Money\n" +
            "2. Withdrawal of Money\n"+
            "3. Balance Inquiry\n"+
            "4. Exit");

            select=input.nextInt();

            if(select==1){
                System.out.println("The Amount of Money You Deposit");
                int price=input.nextInt();
                balance += price;
                System.out.println("Your New Balance: "+balance);

            } else if(select==2){
                System.out.println("The Amount of Money You Withdraw");
                int price=input.nextInt();
                if(price > balance){
                    System.out.println("Your balance is not enough!");
                } else{
                    balance-=price;
                    System.out.println("Your new balance: "+balance);
                }

            } else if(select==3){
                System.out.println("Your Balance: "+balance);

            } 
                
            } while (select != 4);
            System.out.println("Have a Nice Day!");
           

            break;
            
        } else {
            
            System.out.println("You entered user name or password wrong!");
            
            System.out.print("Your remaining right to log in: "+ --right);
            System.out.println();

        }
        }
        if(right==0){
                System.out.println("Your account has blocked.  Please contact with your bank");
            }

        


    }
}