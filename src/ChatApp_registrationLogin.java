/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp_registrationlogin;

/**
 *
 * @author Student
 */
class chat {
    //global variable
        String username; 
  String password;
  String firstname;
  String lastname;
  String cellphone;
   //creating a return method to check username validation
  boolean checkeusername(String username){
      //karaboledwaba123
      //Username must be at least 6 characters and contain only alphanumeric characters
      
      // Check if username is not empty and at least 6 characters
      if (username == null || username.length() < 6) {
          return false;
      }
      
      // Check if username contains only letters and numbers
      if (!username.matches("[a-zA-Z0-9]+")) {
          return false;
      }
      
      return true;
    }
     //creating a return method to check password validation
    boolean checkpassword(String password){
        //Password must be at least 8 characters and contain at least one uppercase letter, one lowercase letter, and one digit
        
        // Check if password is not empty and at least 8 characters
        if (password == null || password.length() < 8) {
            return false;
        }
        
        // Check if password contains at least one uppercase letter, one lowercase letter, and one digit
        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*") || !password.matches(".*\\d.*")) {
            return false;
        }
        
        return true;
    }
     //creating a return method to check cellphone validation
    boolean checkcellphone(String cellphone){
        //Cellphone number must be exactly 10 digits and contain only numbers
        
        // Check if cellphone number is not empty and exactly 10 digits
        if (cellphone == null || cellphone.length() != 10) {
            return false;
        }
        
        // Check if cellphone number contains only digits
        if (!cellphone.matches("\\d{10}")) {
            return false;
        }
        
        return true;
    }
    //creating a return method to check firstname validation
    boolean checkfirstname(String firstname){
        //First name must not be empty and contain only letters
        
        // Check if first name is not empty
        if (firstname == null || firstname.isEmpty()) {
            return false;
        }
        
        // Check if first name contains only letters
        if (!firstname.matches("[a-zA-Z]+")) {
            return false;
        }
        
        return true;
    }
    //creating a return method to check lastname validation 
    boolean checklastname(String lastname){
        //Last name must not be empty and contain only letters
        
        // Check if last name is not empty
        if (lastname == null || lastname.isEmpty()) {
            return false;
        }
        
        // Check if last name contains only letters
        if (!lastname.matches("[a-zA-Z]+")) {
            return false;
        }
        
        return true;
    }
    
public class ChatApp_RegistrationLogin {

    /**
     * @param args the command line arguments
     */
    //creating a variable
    public static void main(String[] args) {
        // TODO code application logic here
    }