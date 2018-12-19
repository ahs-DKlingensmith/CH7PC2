/**
 * Dylan Klingensmith
 * CH7PC2 - Payroll Class
 * AP Computer Science 
 * 12/19/18
 */

import java.util.Scanner;

public class PayrollDemo {

    public static void main(String[] args) {
        
        //Establish Payroll object, scanner, and variables
        Payroll employees = new Payroll();
        
        Scanner keyboard = new Scanner(System.in);
        
        int num;
        double decimal;
        
        //Get hours and pay rate for each employee as indicated by the 
        //shown ID number
        //Do NOT accept negative hours and pay rates less than 6.00       
        for (int x = 0; x < 7; x++) {
            
            System.out.println("Enter the hours worked by employee "
                    + "number " + employees.getEmployeeID(x));
            
            num = keyboard.nextInt();
            
            while (num < 0) {
                
                System.out.println("This is not a valid number of hours. "
                        + "Input the hours worked by employee number "
                        + employees.getEmployeeID(x));
                num = keyboard.nextInt();
                
            }
            
            employees.setHours(num, x);
            
            
            System.out.println("Enter the pay rate of employee number "
                    + employees.getEmployeeID(x));
            
            decimal = keyboard.nextDouble();
            
            while (decimal < 6.00)  {
                
                System.out.println("This is not a valid pay rate. Input "
                        + "the hours worked by employee number "
                        + employees.getEmployeeID(x));
                decimal = keyboard.nextDouble();
                
            }
            
            employees.setPayRate(decimal, x);
            
        }
        
        
        //Return the employee ID number alongside their gross wages
        
        System.out.println("PAYROLL DATA");
        System.out.println("------------");
        
        for (int y = 0; y < 7; y++) {
            
            System.out.println(employees.getEmployeeID(y) + "\t\t$" 
                + employees.getWages(y));       
            
            
        }
        
    }

}
