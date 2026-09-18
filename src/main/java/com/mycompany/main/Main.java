package com.mycompany.main;
//Imports Scanner so we can get user input
import java.util.Scanner;
//Create the Main class
public class Main {
    
    // Create Scanner for user input
    static Scanner input = new Scanner(System.in);
    // stores the user's entered details
    
    static String username;
    static String password;
    static String cellPhone;
    
    
    // Stores the registered username
    static String registeredUsername;
    
    // Store the registered password
    static String registeredPassword;
    
    // Store the registered cellphone number
    static String registeredCellPhone;
    
    // Create the username checking method and checks if the username is valid
     public static boolean checkUserName(String username) {
         // Username must have exactly 5 characters
         // and must contain an underscore
         if(username.length()== 5 && username.contains("_")) {
             System.out.print("Username successfully captured. ");
         return true;
         }else{
             System.out.print("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters in length.");
         return false;
        
     }
     }
   
    // Create the password checking method
    
     public static boolean checkPasswordComplexity (String password) {
         // Temporary return value
         // Password must have at least 8 characters 
         // and contain uppercase, lowercase, number and special character
         if(password.length() >= 8
             
             && password.matches(".*[A-Z].*")
             && password.matches(".*[a-z].*")
             && password.matches(".*[0-9].*")
             && password.matches(".*[^a-zA-Z0-9].*")) {
             System.out.print("Password successfully captured. ");
         return true;
     }else {
             System.out.print("Password is not correctly formatted; please ensure that the password contains at least eisght  characters, a capital letter, a number, and a speccial character.");
           return false;
             }
     }
        
     // Create the cellphone checking method
     public static boolean checkCellPhoneNumber(String number) {
         // Number must start with +27
         // followed by exactly 9 digits
         if (number.matches("^\\+27[0-9]{9}$")){
             System.out.print("Cell phone number successfully added.");
         return true;
     }else {
             System.out.print("Cellphone number incorrectly formatted or does not obtain international code.");
             return false;
         }
     }
          
     // Create the registered method
     // Handles the registration process
     public static void registerUser() {
         // Infinite loop for username 
         while (true){
             // Ask user for username
             System.out.print("Enter your username: ");
             username = input.nextLine();
             
             // Check username 
             boolean usernameCorrect = checkUserName(username);
             
             // Check if username is correct
             if (usernameCorrect){
                 break;
             }else{
                 System.out.print("Username is incorrecctly formatted. please try again. ");
             }
         }
     
         // Infinite loop for password
         while (true){ 
             // Ask for password
             System.out.print("Enter your password: ");
             password = input.nextLine();
             // Check password
             boolean passwordCorrect = checkPasswordComplexity(password);
             // Check if password is correct 
             if (passwordCorrect){
                 break;
             }else {
                 System.out.print("Password is correctly  formatted. Please try again.");
                 
             }
         }
         // Infinite loop for cellphone number
         while (true){
             // Ask for cellphone number
             System.out.print("Enter your cellphone number (+27): ");
             cellPhone = input.nextLine();
             
             //Check cellphone number
             boolean phoneCorrect = checkCellPhoneNumber(cellPhone);
             // Check if cellphone number is correct
             if (phoneCorrect){
                 break;
             
                     
         }else{
                 System.out.print("Cellphone is incorrectly formatted. Please try again");
                 }
         }
     
     // save the valid username
     registeredUsername = username;
     
     // save the valid password
     registeredPassword = password;
     
     // Save the valid cellphone number
     registeredCellPhone = cellPhone;
     
     // Display success message 
     System.out.println("User registered successfully.");
     }
     // Check login details
     public static boolean loginUser (String username, String password) {
         // Infinite loop login
         while (true){
             // Compare entered details with registered deatils
             if (username.equals(registeredUsername)
                     && password.equals(registeredPassword)){
                 return true;
             }else {
                 // Login details are correct
                 System.out.print("Username or password incorrect, please try again.");
                 // re-prompt the user for username
                 System.out.print("Enter your username to login: ");
                 username = input.nextLine();
                 // Re-prompt for password
                 System.out.print("Enter your password to login: ");
                 password = input.nextLine();
             }
                 
         }
         
         }
         
     // Return the login status message
     public static String returnLoginStatus(boolean loginSuccessful) {
         // Check if login was successful 
         if (loginSuccessful){
             return "Welcome, it's great to see you again.";
         }else{
         return "username or password incorrect, please try again.";
     }
     }
     // Main method where the program starts
     public static void main(String[] args){
         // Calls the registration method
         registerUser();
         // Ask user to login
         System.out.print("Enter your username to login: ");
         String loginUsername = input.nextLine();
         System.out.print("Enter your password to login: ");
         String loginPassword = input.nextLine();
         // Call login method 
         boolean loginSuccessful = loginUser(loginUsername, loginPassword);
         
         // Calls login status method
         System.out.print(returnLoginStatus(loginSuccessful));
     }
}
         
         
         
         