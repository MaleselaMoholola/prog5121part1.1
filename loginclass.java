/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pitsimoholola_part1;

import java.util.regex.Pattern;


public class loginclass {
   
    //Attributes for the user to store their details
    private String registeredUserName;
    private String registeredPassWord;
    private String registeredCellNumber;
    
    //Used to initialize the user's details
  



     public boolean checkUsername(String username){
        
    if (username.contains("_") && (username.length()<=5));
        return username.endsWith("@gmail.com");
        
        
    }
        public boolean checkPassWordComplexity(String password) {
        if (password.length() <8){
            return false;
            
        }
        boolean hasCapitalLetter=false;
        boolean hasSpecialCharacter=false;
        boolean hasNumber=false;
        
        for (char ch : password.toCharArray()){
           if(Character.isUpperCase(ch)){
                hasCapitalLetter = true;
           }
                
                if(Character.isUpperCase(ch)){
                hasCapitalLetter = true;
                }
                
                if(Character.isDigit(ch)){
                hasNumber =true;
            }    
                if (Character.isLetterOrDigit(ch)){
        hasSpecialCharacter=true;
    }
        }    
           return hasCapitalLetter && hasSpecialCharacter && hasNumber;
        }
        
        
            public boolean checkCellPhoneNumber(String cellnumber) {
            if (cellnumber == null)
                return false;
            
            String regex = "^\\+27\\d{9}$";
            return Pattern.matches(regex, cellnumber);
            }
            public String registeredUserName(String username, String password, String cellnumber){
                if (!checkUsername(username)){
                    System.out.println("Username must conatain and underscore,Username must conatain @gmail.com andUsername must have more than 5 characters in length. ");
                }
                else if (!checkPassWordComplexity(password)){
                    System.out.println("Password not correctly formatted; must contain an underscore, a capital letter and a digit.");
            }
                else if (! checkCellPhoneNumber(cellnumber)){
                    return "Cellphone number must not contain more than 10 digits;please correct the number and try again.";
                
                }else{ 
                this.registeredUserName = username;
                this.registeredPassWord = password;
                this.registeredCellNumber = cellnumber;
                }
                return "User registered successfully.";
            } 
            public boolean loginuser(String enteredUsername, String enteredPassword){
                if (this.registeredUserName == null || this.registeredPassWord == null){
                    return false;
                }
                return this.registeredUserName.equals(enteredUsername) && this.registeredPassWord. equals(enteredPassword);
            }
            public String returnLoginStatus(boolean isLoggedIn){
                if (isLoggedIn) {
                return "Welcome " + this.registeredUserName +", it's great to see you again.";
            }else{ 
            return "Username or password is incorrect, please try again.";

}
}
}

            
    
        
        



        
    
 
