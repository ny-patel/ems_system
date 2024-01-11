
import java.util.*;
public class EmployeeInfo {    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int workLoc; // encode e.g. 0 for Mississauga, etc.
    public double deductRate; // e.g. 0.21 for 21%
    
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	workLoc = wL;
    	deductRate = dR;
        
        
    }
    
    
    // METHODS
    
    public int getEmpNum() {
        return empNum;  
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public int getWorkLocation(){
        return workLoc;
    }
    
    public double getDeductionRate(){
        return deductRate ;
    }
   
    

    
    
}
