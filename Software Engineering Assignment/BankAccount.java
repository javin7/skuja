import java.util.*;
import java.io.*;

/*
BankAccount
Javin Liu
Mark Ungar
Caleb Yoon
2022-05-23
This program creates individual ID codes and pins that is fully interactable as a bank account
*/

public class BankAccount {
   
   //Global variables
   public static int newAccountFileName = 000001;
   public static String convertAccFileName = "";
   public static boolean accountCheck = false;
   public static double randNums = 0;
   public static int randAccNum = 0;

   
   //Variables
   public static String loginAccNum = "";
   public static int validAccount;
   
   /*
   newAccount(int accNumCheck, int accPinCheck)
   returns accNumCheck
   int accNumCheck - checks if the account num is valid, int accPinCheck - checks if the pin num is valid
   This method checks if someones account is valid
   */
   
   public static int newAccount (int accNumCheck, int accPinCheck) { 
      //Scanner
      Scanner sc = new Scanner(System.in);
      
      //Variables
      int convertRandNums, userPinNum, userPinNumCheck, fourDigitCheck;
      String firstName = "", lastName = "", formattedAccNum = "";    
      double accNum;
      int intAccNum;
      
      
      try 
      {  
         //Variables
         accNum = Math.random();
         accNum = accNum * 1000000;
         intAccNum = (int) accNum;
         formattedAccNum = Integer.toString(intAccNum);
         
         //Prints out account number
         System.out.println("Your new account number is " + intAccNum);
         
         BufferedWriter out = new BufferedWriter(new FileWriter(formattedAccNum, false));//Opens writer
         
         //Asks user for their 4 digit pin, user inputs
         System.out.print("Please enter a four digit pin: ");
         userPinNum = sc.nextInt();
      
         fourDigitCheck = String.valueOf(userPinNum).length();//Makes sure it is 4 digits
         
         //If statement to check if its 4 digits
         if (fourDigitCheck != 4) {
            System.out.println("NOT FOUR DIGITS"); //Prints that it is not
            return(accNumCheck);//returns accNumCheck
         } 
         
         //asks user to reenter their pin, gets user input and declares new variable
         System.out.print("Please reenter your four digit pin: ");
         userPinNumCheck = sc.nextInt();
         
         //if statement to check if its the same pin
         if (userPinNum != userPinNumCheck) {
            System.out.println("NOT THE SAME PIN");//prints that it is not
            return(accNumCheck);//returns accNumCheck
         }
         
         //asks user to input first name, gets input
         System.out.print("Please enter your first name: ");
         firstName = sc.next();
         
         //asks user to input last name, gets input
         System.out.print("Please enter your last name: ");
         lastName = sc.next(); 
         
         //tells user they need to reenter all the information so they can log in
         System.out.print("(Press 1 then reenter credidentials to log in)\n");
         
         out.write("ACC NUM ~\n" + formattedAccNum);//Writes account number header and account number to file
         
         out.newLine(); //New line
         
         out.write("PIN ~\n" + userPinNum); //Writes pin header and pin to file
         
         out.newLine();//New line
         
         out.write(firstName + " " + lastName); //Writes first name and last name
         
         out.close(); //Closes file
         
      }
      
      catch (Exception e)
      {
         System.out.println("ERROR");//Catch exception
      }
   
      return (accNumCheck);//Return value of accNumCheck
   }

   
   /*
   checkDetails(int accNumCheck, int accPinCheck)
   returns accNumCheck
   int accNumCheck - checks if the account num is valid, int accPinCheck - checks if the pin num is valid
   This method checks if someones account is valid
   */
   
   public static int checkDetails (int accNumCheck, int accPinCheck) { 
      //Scanner
      Scanner sc = new Scanner(System.in);
      
      //Variables
      String throwAway, pinNumCheck;
      int intPinNumCheck;      
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(loginAccNum));
         
         //Ignore first three lines to get to pin number line
         throwAway = in.readLine();
         throwAway = in.readLine();
         throwAway = in.readLine();
         pinNumCheck = in.readLine();
         
         intPinNumCheck = Integer.parseInt(pinNumCheck);//converts line into int
         
         //if statement to check if input is the same as the pin number
         if (accPinCheck == intPinNumCheck) {
            System.out.println("LOGGED IN");//outputs logged in
            validAccount = 1;
         } else {
            System.out.println("Not a valid pin number");//outputs not valid
         
            return(accNumCheck);//returns to main
         }
         
         in.close();//closes file         
         
      }
      
      catch (IOException e) 
      {
         System.out.println("Customer doesnt exist");//error statement
      }
      
      return (accNumCheck);//returns to main
   }
   
    
   /*
   checkBalance (int accNumber)
   returns accNumber
   int accNumber, imports the acc number to find the file
   This method checks individual account balances
   */
   
   public static int checkBalance (int accNumber) { 
      Scanner sc = new Scanner(System.in);
      
      String accNumConvert = "", throwAway, cheqBalance, savBalance, totalBalance;//declares/initilizes variables
      
      int balanceCheck = 0;//declares/initilizes variables
           
      accNumConvert = Integer.toString(accNumber);//declares/initilizes variables
      
      //displays options and asks for users inputs
      System.out.println("Enter 1 to check chequing account balance");
      System.out.println("Enter 2 to check savings account balance");
      balanceCheck = sc.nextInt();//gets input
      
      try 
      {
         BufferedReader in = new BufferedReader(new FileReader(accNumConvert));
         
         //for chequing account
         if (balanceCheck == 1) {
            
            //reads and outputs the chequing balance 
            throwAway = in.readLine(); 
            throwAway = in.readLine(); 
            throwAway = in.readLine(); 
            throwAway = in.readLine(); 
            cheqBalance = in.readLine();
            System.out.println(cheqBalance);
            
           //for savings account
         } else if (balanceCheck == 2) { 
            
            //Read and outputs savings balance
            throwAway = in.readLine(); 
            throwAway = in.readLine(); 
            throwAway = in.readLine(); 
            throwAway = in.readLine(); 
            throwAway = in.readLine();
            throwAway = in.readLine();
            savBalance = in.readLine();
            System.out.println(savBalance);
            
         }
         
      }
         
      catch (IOException e)
      {
         System.out.println("Account does not exist"); //Error if account doesn't exist
      }
      
      
      return (accNumber);//returns to main
   } 
   
   /*
   deposit (int accNumber)
   returns accNumber
   int accNumber, imports the acc number to find the file
   This method deposits money
   */
   
   public static int deposit (int accNumber) { 
      Scanner sc = new Scanner(System.in);
      
      String accNumConvert = "", readLine = "";//declares/initilizes variables
      
      int accType = 0, depositAmount = 0, balance, newBalance;//declares/initilizes variables
      
      accNumConvert = Integer.toString(accNumber);//declares/initilizes variables  
      
      //header to display options
      System.out.println("Enter 1 to deposit to your chequing account");
      System.out.println("Enter 2 to deposit to your savings account");
      accType = sc.nextInt();//gets user input
      
      //asks how much the user would like to deposit
      System.out.println("How much money would you like to deposit into your account?");
      depositAmount = sc.nextInt();//gets number
            
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(accNumConvert));       
         BufferedWriter out = new BufferedWriter(new FileWriter(accNumConvert, true));//sets .txt files
         
         //for chequing
         if (accType == 1) {
            
            //finds chequing balance
            while(!readLine.equals("CHEQUING"))
            {
               readLine = in.readLine();
            }
            
            //if statement for if readLine is not null
            if (readLine != null) {
               //reads balance
               readLine = in.readLine();
               
               balance = Integer.parseInt(readLine);//declares balance while converting line into int
               
               newBalance = balance + depositAmount;//new balance is created by adding the deposit to balance
                  
            }
           
         //for savings
         } else if (accType == 2) {
         
            //loop to find savings
            while(!readLine.equals("SAVINGS"))
            {
               readLine = in.readLine();//reads lines
            }
            
            if (readLine != null) {
               readLine = in.readLine();//reads balance
               
               balance = Integer.parseInt(readLine);//declares balance while converting line into int
               
               newBalance = balance + depositAmount;//new balance is created by adding the deposit to balance
                
            } else {
               System.out.println("No accounts found");//reads if there isnt an account open
            
            }
         
         }
      }
      
      catch (Exception e)
      {
         System.out.println("Error reading file");//error message     
      }   
      return (accNumber);//returns to main
   
   }


   /*
   withdraw (int accNumber)
   returns accNumber
   int accNumber, imports the acc number to find the file
   This method withdraws money
   */
   
   public static int withdraw (int accNumber) { 
      Scanner sc = new Scanner(System.in);//scanner
      
      String accNumConvert = "", readLine = "";//declares/initilizes variables
      
      int accType = 0, withdrawAmount = 0, balance, newBalance;//declares/initilizes variables
      
      accNumConvert = Integer.toString(accNumber);//declares/initilizes variables
      
      //header to display options 
      System.out.println("Enter 1 to withdraw from your chequing account");
      System.out.println("Enter 2 to withdraw from your savings account");
      accType = sc.nextInt();//gets user input
      
      //asks how much money user would like to withdraw
      System.out.println("How much money would you like to withdraw from your account?");
      withdrawAmount = sc.nextInt();//gets number
            
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(accNumConvert));       
         BufferedWriter out = new BufferedWriter(new FileWriter(accNumConvert, true));//sets .txt files
         
         //for chequing
         if (accType == 1) {
         
            //finds chequing balance
            while(!readLine.equals("CHEQUING"))
            {
               readLine = in.readLine();//reads lines
            }
            
            if (readLine != null) {
               readLine = in.readLine();//reads balance
               
               balance = Integer.parseInt(readLine);//declares balance while converting line into int
               
               //if the amount of money in balance is less than the desired withdraw
               if (withdrawAmount < balance) {
                  newBalance = balance - withdrawAmount;//subtracts from balance, creates new balance 
                  
                  
               
               } else {
                  System.out.println("Not enough money in account. Cannot withdraw.");//outputs if the ammount of money in balance is less than desired withdraw
               
               }
            }
         
         //for savings
         } else if (accType == 2) {
         
            //loop to find savings balance
            while(!readLine.equals("SAVINGS"))
            {
               readLine = in.readLine();//reads lines
            }
            
            if (readLine != null) {
               readLine = in.readLine();//reads balance
               
               balance = Integer.parseInt(readLine);//declares balance while converting line into int
               
               //if the amount of money in balance is less than the desired withdraw
               if (withdrawAmount < balance) {
                  newBalance = balance - withdrawAmount;//subtracts from balance, creates new balance
                  
                  
               
               } else {
                  System.out.println("Not enough money in account. Cannot withdraw.");//outputs if the ammount of money in balance is less than desired withdraw
               
               }
            }
         
         }
      }
      
      catch (Exception e)
      {
         System.out.println("Error reading file");//error message           
      }   
      return (accNumber);//returns to main
   }
   
   /*
   closeAccount (int accNumber)
   returns accNumber
   int accNumber, imports the acc number to find the file
   This method closes an account
   */
   
   public static int closeAccount (int accNumber) { 
      Scanner sc = new Scanner(System.in);//scanner
      
      String accNumConvert = "", throwAway;//declares/initilizes variables
      
      String lineRead[] = new String[16];//sets array
      
      int accType = 0, lineCount = 0;//declares/initilizes variables
      
      accNumConvert = Integer.toString(accNumber);//declares/initilizes variables
      
      //header to display options
      System.out.println("Enter 1 to close a chequing account");
      System.out.println("Enter 2 to close a savings account");
      accType = sc.nextInt();//gets user input
      
      try
      {
         BufferedReader in = new BufferedReader(new FileReader(accNumConvert));       
         BufferedWriter out = new BufferedWriter(new FileWriter(accNumConvert, true));//sets .txt files
         
         //for chequing
         if (accType == 1) {
            //loop if line isnt equal to null
            while (lineRead != null) {               
               lineRead[lineCount] = in.readLine();//reads lines and sets to array
               
               //if statement if the line is chequing
               if (lineRead.equals("CHEQUING")) {
                  lineRead[lineCount] = "";//removes writing from file
                  throwAway = in.readLine();//throwaway
                  throwAway = in.readLine();//throwaway
                  
                  System.out.println("Chequing Account Closed");//outputs that the account is closed
                  
                  return(accNumber);//returns to main
               }
               lineCount++;//adds 1 to line count
            }
         //for savings
         } else if (accType == 2) {
            //loop if line isnt equal to null
            while (lineRead != null) {               
               lineRead[lineCount] = in.readLine();//reads lines and sets to array
               
               //if statement if the line is chequing
               if (lineRead.equals("SAVINGS")) {
                  lineRead[lineCount] = "";//removes writing from file
                  throwAway = in.readLine();//throwaway
                  throwAway = in.readLine();//throwaway
                  
                  System.out.println("Savings Account Closed");//outputs that the account is closed
                  
                  return(accNumber);//returns to main
               }
               lineCount++;//add 1 to line count
            }
         }
         
      }
      
      catch (IOException e)
      {
         System.out.println("Error reading file");//error message        
      }         
      return (accNumber);//returns to main
   }
   
   /*
   openAccount (int accNumber)
   returns accNumber
   int accNumber, imports the acc number to find the file
   This method opens an account 
   */
   
   public static int openAccount (int accNumber) { 
      Scanner sc = new Scanner(System.in);//scanner
      
      String accNumConvert = "";//declares/initilizes variables
      int accType = 0;//declares/initilizes variables
      
      accNumConvert = Integer.toString(accNumber);//declares/initilizes variables
      
      //header to display options
      System.out.println("Enter 1 to open a chequing account");
      System.out.println("Enter 2 to open a savings account");
      accType = sc.nextInt();//gets user input
      
      try
      { 
         BufferedReader in = new BufferedReader(new FileReader(accNumConvert));//sets .txt file
          
         BufferedWriter out = new BufferedWriter(new FileWriter(accNumConvert, true));//sets .txt file
         
         //for chequing
         if (accType == 1) {
            //writes a chequings header and a starting balance of 0 to file
            out.write("");
            out.write("CHEQUING");
            out.write("0");
            System.out.println("Account Opened");//outputs that the account is open
         } else if (accType == 2) {
            //writes a savings header and a starting balance of 0 to file
            out.write("");
            out.write("SAVINGS");
            out.write("0");
            System.out.println("Account Opened");//outputs that the account is open
         }
         
         
      }
      
      catch (IOException e)
      {
         System.out.println("Error reading file");//error statement          
      }   
      
            
      return (accNumber);//returns to main
   }
   
   /*
   changePin (int accNumber)
   returns accNumber
   int accNumber, imports the acc number to find the file
   This method changes your pin
   */
   
   public static int changePin (int accNumber, int currentPin) { 
      Scanner sc = new Scanner(System.in);//scanner
      
      String accNumConvert = "";//declares/initilizes variables
      
      String lineRead = "", throwAway, newPinString;//declares/initilizes variables
      
      String[] reWriteFile;//declares/initilizes variables
      
      int lineCount = 0, counter = 0, currentPinCheck = 0, newPin = 0;//declares/initilizes variables
      
      accNumConvert = Integer.toString(accNumber);//declares/initilizes variables
      
      //asks for the current pin
      System.out.println("Enter your current pin to change your pin");
      currentPinCheck = sc.nextInt();//gets user input
      
      //if the pin matches
      if (currentPinCheck == currentPin) {
         System.out.println("Enter the pin you would like to change to");//asks for pin user wants to change to
         newPin = sc.nextInt();//gets new pin
         
         try
         {
            BufferedReader in = new BufferedReader(new FileReader(accNumConvert));       
            
            //reads to see if text exists in file
            while (lineRead != null) {               
               lineRead = in.readLine();//reads lines
               lineCount++;//adds 1 to line count
            }
         
            reWriteFile = new String[lineCount];//declares/initilizes variables
            
            //loop for finding the pin number
            while (counter < 3) {
               reWriteFile[counter] = in.readLine();//reads number
               counter++;//adds 1 to counter
            }
            
            newPinString = Integer.toString(newPin);//declares new pin
            
            reWriteFile[counter] = newPinString;//replaces old pin to new pin
            counter++;//adds 1 to counter
            
            //loop for finding pin
            for (int i = counter; i < lineCount; i++) {
               reWriteFile[counter] = in.readLine();//reads line 
            }
            
            
            BufferedWriter out = new BufferedWriter(new FileWriter(accNumConvert, true));//sets .txt files
            
            //loop for finding pin number
            for (int i = 0; i < lineCount; i++) {
               out.write(reWriteFile[counter]);//writes new pin
            }            
         
         
         }
         
         catch (IOException e)
         {
            System.out.println("Error reading file"); //error statement          
         }
         
      //if pin doesn't match        
      } else {
         System.out.println("Not the same pin.");//outputs that the pins are not the same
      
      }
      
      return (accNumber);//returns to main
   }
   
   
   
   
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);//scanner
      
      
      String nextAccNum;//declares/initilizes variables
      
      int logInChoice, accNumLog = 0, accPinLog = 0, cancelLoop = 0, accountOptionSelection = 0, logOut = 0;//declares/initilizes variables
      
      validAccount = 0;//declares/initilizes variables
      
      //infinite loop for choices
      while (cancelLoop != -1) {
         
         //outputs header
         System.out.println("BANKING SIMULATOR");
         System.out.println("-----------------");
         
         //outputs options and user intputs an option
         System.out.println("Enter 1 to log in. Enter 2 to create a new account. Enter 3 to end program.");
         logInChoice = sc.nextInt();
         
         //if they choose to log in
         if (logInChoice == 1) {
            System.out.print("Enter your account number: ");//asks for account number, user inputs
            accNumLog = sc.nextInt();
            
            loginAccNum = Integer.toString (accNumLog);
            
            //asks user to enter their pin
            System.out.print("Enter your pin number: ");
            accPinLog = sc.nextInt();
            
            checkDetails(accNumLog, accPinLog);//goes to method to see if it is a valid account
         
         } else if (logInChoice == 2) {
            newAccount(0, 0);//goes to method
         } else if (logInChoice == 3) {
            cancelLoop = -1;//ends program
         } 
         
         //infinite loop for options after user logs in
         if (validAccount == 1) {
            do
            {
               //header to display their options
               System.out.println("\nEnter 1 to check account balance");
               System.out.println("Enter 2 to deposit money");
               System.out.println("Enter 3 to withdraw money");
               System.out.println("Enter 4 to close an account");
               System.out.println("Enter 5 to open an account");
               System.out.println("Enter 6 to change your pin");
               System.out.println("Enter 7 to log out");
               accountOptionSelection = sc.nextInt();
               
               //goes to each method depending on their choice
               if (accountOptionSelection == 1) {
                  checkBalance(accNumLog);//method checks balance
               
               } else if (accountOptionSelection == 2) {
                  deposit(accNumLog);//method for depositing
               
               } else if (accountOptionSelection == 3) {
                  withdraw(accNumLog);//method for withdrawing
               
               } else if (accountOptionSelection == 4) {
                  closeAccount(accNumLog);//method to close account
               
               } else if (accountOptionSelection == 5) {
                  openAccount(accNumLog);//method to open chequing or saving
               
               } else if (accountOptionSelection == 6) {       
                  changePin(accNumLog, accPinLog);//method to change pin number
               
               } else if (accountOptionSelection == 7) {
                  logOut = -1;
                  validAccount = 0;//ends loop and goes back to login options
               
               }
               
            }
            while (logOut != -1);
               
         }
          
         
      }
      
   }

   
}
