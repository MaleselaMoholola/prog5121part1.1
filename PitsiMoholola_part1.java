/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pitsimoholola_part1;
 
        import java.util.Scanner;


public class PitsiMoholola_part1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        loginclass loginsystem = new loginclass();
        
        String name;
        String surname;
        String username;
        String password;
        String cellnumber;
        
        System.out.println("Please enter your Name: ");
         name = input.nextLine();
         
         
         System.out.println("Please enter your Surname: ");
         surname = input.nextLine();
        
          System.out.println("Please enter your Username: ");
          username = input.nextLine();
        
           System.out.println("Please enter your password: ");
           password = input.nextLine();
           
            System.out.println("Please enter your Cellphone number: ");
            cellnumber = input.nextLine();
            
            String registrationMessage = loginsystem.registeredUserName(username, password, cellnumber);
            

   input.close();
   
} 
    }
    




    