/*
 * Payroll Class
 */

public class Payroll {

    //Establish arrays of employee information
    int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277,
                        1302850, 7580489};

    int[] hours = new int[7];
    double[] payRate = new double[7];
    double[] wages = new double[7];
    
    
    //The setHours method accepts an argument and sets the hours of 
    //the accepted array subscript value as the accepted argument
    public void setHours(int h, int sub)    {
        
        hours[sub] = h;
        
    }
    
    
    //The setPayRate method accepts an argument and sets the payRate of 
    //the accepted array subscript value as the accepted argument
    public void setPayRate(double pr, int sub) {
        
        payRate[sub] = pr;
        
    }
    
    
    //The getEmployeeID method returns the employee ID indicated by the
    //array subscript accepted as the argument
    public int getEmployeeID(int sub)   {
        
        return employeeID[sub];
        
    }
    
    
    //The getHours method returns the hours of the employee indicated by the 
    //array subscript accepted as the argument
    public int getHours(int sub)    {
        
        return hours[sub];
        
    }
    
    
    //The getPayRate method returns the pay rate of the employee indicated 
    //by the array subscript accepted as the argument
    public double getPayRate(int sub)   {
        
        return payRate[sub];
        
    }
    
    //The getWages method returns the wages, determined by the hours and the 
    //pay rate of the employee indicated by the array subscript accepted
    //as the argument
    public double getWages(int sub) {
        
        return (hours[sub] * payRate[sub]);
        
    }

    //The findPayRate method accepts an employee ID number as an argument
    //and searches the employeeId array and wages array to find the
    //employee's wages
    public double findPayRate(int id) {

        boolean numberFound = false;
        double employeeWages = 0;

        for (int x = 0; x < 7; x++) {

            if (id == employeeID[x]) {

                employeeWages = wages[x];

            }

        }

        return employeeWages;

    }

}
