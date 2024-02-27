package Password;
import java.util.Scanner;
public class Password {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.println("||Password Requirements||\nThe password must be 8-16 characters long, and contain 3 of the 4 following specifications:\n1.uppercase letters\n2.lowercase letters\n3.numbers\n4.the following special characters [~!@#$%^&*()-=+_]\nSpaces can be included");
        System.out.println("Please enter a valid password:");
        String password = input.nextLine();
        int length1 = password.length(); 
        int condition = 0; 
        while (length1 > 16 || length1 < 8){
            System.out.println("Please enter a valid password:");
            String password2 = input.nextLine(); 
            length1 = password2.length(); 
            password = password2;
        } 
        int length = password.length(); 
        char Password [] = new char[length]; 
        boolean upper = false;
        boolean lower = false;
        boolean number = false;
        boolean symbol = false;
        for (int i = 0; i < length; i++){
            Password[i] = password.charAt(i);  
        }  
         for (int j = 0; j < length; j++){
            if (Password[j] == 'a' || Password[j] == 'b' || Password[j] == 'c' || Password[j] == 'd' || Password[j] == 'e' || Password[j] == 'f' || Password[j] == 'g'|| Password[j] == 'h' || Password[j] == 'i' || Password[j] == 'j' || Password[j] == 'k' || Password[j] == 'l' || Password[j] == 'm' || Password[j] == 'n' || Password[j] == 'o' || Password[j] == 'p' || Password[j] == 'q' || Password[j] == 'r' || Password[j] == 's' || Password[j] == 't' || Password[j] == 'u' || Password[j] == 'v' || Password[j] == 'w' || Password[j] == 'x' || Password[j] == 'y' || Password[j] == 'z') {
                lower = true; 
            }
           
        }
        for (int j = 0; j < length; j++){
            if (Password[j] == 'A' || Password[j] == 'B' || Password[j] == 'C' || Password[j] == 'D' || Password[j] == 'E' || Password[j] == 'F' || Password[j] == 'G'|| Password[j] == 'H' || Password[j] == 'I' || Password[j] == 'J' || Password[j] == 'K' || Password[j] == 'L' || Password[j] == 'M' || Password[j] == 'N' || Password[j] == 'O' || Password[j] == 'P' || Password[j] == 'Q' || Password[j] == 'R' || Password[j] == 'S' || Password[j] == 'T' || Password[j] == 'U' || Password[j] == 'V' || Password[j] == 'W' || Password[j] == 'X' || Password[j] == 'Y' || Password[j] == 'Z') {
                upper = true;  
            }
        }

        for (int j = 0; j < length; j++){
            if (Password[j] == '0' || Password[j] == '1' || Password[j] == '2' || Password[j] == '3' || Password[j] == '4' || Password[j] == '5' || Password[j] == '6'|| Password[j] == '7' || Password[j] == '8' || Password[j] == '9') {
                number = true;  
            }
        }

        for (int j = 0; j < length; j++){
            if (Password[j] == '~' || Password[j] == '!' || Password[j] == '@' || Password[j] == '#' || Password[j] == '$' || Password[j] == '%' || Password[j] == '^'|| Password[j] == '&' || Password[j] == '*' || Password[j] == '(' || Password[j] == ')' || Password[j] == '_' || Password[j] == '-' || Password[j] == '+'|| Password[j] == '=') {
               symbol = true; 
            }
        }
        if (lower == true){
            condition++; 
        }
        if (upper == true) {
            condition++;
        }
        if (number == true){
            condition++;
        }
        if(symbol == true){
            condition++; 
        }
        if (condition >= 3){
            System.out.println("Your Password is: " + password);
            System.exit(0); 
        }
        condition = 0; 
       int length2 = 0; 
        while (length2 > 16 || length2 < 8 || condition < 3){
            System.out.println("Please enter a valid password:"); 
             condition = 0; 
             upper = false;
             lower = false;
             number = false;
             symbol = false;
            String password2 = input.nextLine(); 
            length2 = password2.length(); 
            password = password2; 
            length = password.length(); 
            char Password2 [] = new char[length];  
            
            for (int i = 0; i < length; i++){
                Password2[i] = password.charAt(i);  
            }  
             for (int j = 0; j < length; j++){
                if (Password2[j] == 'a' || Password2[j] == 'b' || Password2[j] == 'c' || Password2[j] == 'd' || Password2[j] == 'e' || Password2[j] == 'f' || Password2[j] == 'g'|| Password2[j] == 'h' || Password2[j] == 'i' || Password2[j] == 'j' || Password2[j] == 'k' || Password2[j] == 'l' || Password2[j] == 'm' || Password2[j] == 'n' || Password2[j] == 'o' || Password2[j] == 'p' || Password2[j] == 'q' || Password2[j] == 'r' || Password2[j] == 's' || Password2[j] == 't' || Password2[j] == 'u' || Password2[j] == 'v' || Password2[j] == 'w' || Password2[j] == 'x' || Password2[j] == 'y' || Password2[j] == 'z') {
                    lower = true; 
                }
               
            }
            for (int j = 0; j < length; j++){
                if (Password2[j] == 'A' || Password2[j] == 'B' || Password2[j] == 'C' || Password2[j] == 'D' || Password2[j] == 'E' || Password2[j] == 'F' || Password2[j] == 'G'|| Password2[j] == 'H' || Password2[j] == 'I' || Password2[j] == 'J' || Password2[j] == 'K' || Password2[j] == 'L' || Password2[j] == 'M' || Password2[j] == 'N' || Password2[j] == 'O' || Password2[j] == 'P' || Password2[j] == 'Q' || Password2[j] == 'R' || Password2[j] == 'S' || Password2[j] == 'T' || Password2[j] == 'U' || Password2[j] == 'V' || Password2[j] == 'W' || Password2[j] == 'X' || Password2[j] == 'Y' || Password2[j] == 'Z') {
                    upper = true;  
                }
            }
    
            for (int j = 0; j < length; j++){
                if (Password2[j] == '0' || Password2[j] == '1' || Password2[j] == '2' || Password2[j] == '3' || Password2[j] == '4' || Password2[j] == '5' || Password2[j] == '6'|| Password2[j] == '7' || Password2[j] == '8' || Password2[j] == '9') {
                    number = true;  
                }
            }
    
            for (int j = 0; j < length; j++){
                if (Password2[j] == '~' || Password2[j] == '!' || Password2[j] == '@' || Password2[j] == '#' || Password2[j] == '$' || Password2[j] == '%' || Password2[j] == '^'|| Password2[j] == '&' || Password2[j] == '*' || Password2[j] == '(' || Password2[j] == ')' || Password2[j] == '_' || Password2[j] == '-' || Password2[j] == '+'|| Password2[j] == '=') {
                   symbol = true; 
                }
            }
            if (lower == true){
                condition++; 
            }
            if (upper == true) {
                condition++;
            }
            if (number == true){
                condition++;
            }
            if(symbol == true){
                condition++; 
            }
        }
     System.out.println("Your Password is: " + password); 

      
        input.close();         
    }
}