/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tebogo_Maepa;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Main {
    

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String firstname, lastname, username,password , phone;
        //prompt and receiving user inputs
        System.out.println("-----------------------");
        System.out.println("-------Register--------");
        System.out.println("-----------------------");
        System.out.print("Enter First Name: ");
        firstname = input.nextLine ();
        System.out.print("Enter Last Name: ");
        lastname = input.nextLine();
        System.out.print("Enter Username: ");
        username = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();
        System.out.print("Enter Phone Number (starting with South African international code (+27)): ");
        phone = input.nextLine();
        
        Login login = new Login(); //create and instantiate Login object
        
        boolean validatePhone = login.checkCellPhoneNumber(phone);
        boolean validateUsername = login.checkUserName(username);
        boolean validatePassword = login.checkPasswordComplexity(password);
        
        //checks and validates username
        if (validateUsername ==true){
            System.out.println("Username successfully captured");
        }else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length. ");
        }
        
        
        //checks and validates password
        if (validatePassword ==true){
            System.out.println("Password successfully captured.");
        }else{
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital and small letter, a number and a specialcharacter. ");
        }
        
        
        
        //checks and validates phone number
        if (validatePhone ==true){
            System.out.println("Cellphone number successfully added.");
        }else{
            System.out.println("Cellphone number incorrectly formatted or does not contain international code");
        }
        
        if(validateUsername ==true && validatePassword ==true && validatePhone ==true ){
            System.out.println("You have successfully registered");
             String loginUsername;
            String loginPassword; 
        
             System.out.println("--------------------");
            System.out.println("-------LOGIN--------");
              System.out.println("--------------------");
        
            System.out.print("Enter username: ");
             loginUsername=input.nextLine();
            System.out.print("Enter password: ");
            loginPassword=input.nextLine();
        
             if (loginUsername.equals(username) && loginPassword.equals(password)){
            System.out.println("Welcome " + firstname + " ," + lastname + " it is great to see you again.");
            }else{
            System.out.println("Login failed!, wrong username or password ");
            }
        }else{
            System.out.println("Failed to register");
            main(null);
        }
       

    }
    
}
