import java.util.*;




public class MyHashTable {
	
	// ATTRIBUTES
	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<EmployeeInfo>[] buckets;
	public int numInHashTable;
  

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.
                
		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
		}
		
		numInHashTable = 0;
	}

	
	// METHODS
	
	public int getNumInHashTable() {
        return numInHashTable;  
	}

	
	
	public int calcBucket(int keyValue) {
		return(keyValue % buckets.length);
                // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
	}
	

	
	public boolean addEmployee(EmployeeInfo theEmployee) {

		// Add the employee to the hash table.  Return true if employee is added successfully,
		
		
		if (theEmployee == null) {
			return(false);
		}
                // return false otherwise.
		else {
			int targetBucket = calcBucket(theEmployee.getEmpNum());
			// Add the employee to the ArrayList for the targetBucket.
			boolean addStatus = buckets[targetBucket].add(theEmployee);
			numInHashTable++;
			return addStatus;
		}
		
	} // end AddEmployee
		
	
	
	public void displayContents() {
		
		System.out.println("\n\nDISPLAYING THE CONTENTS OF A HASH TABLE!");
		
		System.out.println("\n  This hash table contains " + numInHashTable + " entries.");
		
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
		
		for (int i = 0; i < buckets.length; i++) {

		    // For the current bucket, print out the emp num for each item
                    // in its ArrayList.

                    System.out.println("\n  Examining the ArrayList for bucket " + i);
                    int listSize = buckets[i].size();
                    if (listSize == 0) {
                    	System.out.println("    Nothing in its ArrayList!");
                    }
                    else {
                        for (int j = 0; j < listSize; j++) {
                           int theEmpNum = buckets[i].get(j).getEmpNum();
                           System.out.println("    Employee " + theEmpNum);
                        }
                    }

                }

	} // end displayContents
        
        
        public EmployeeInfo removeEmployee(int theEmpNum) {
            // Remove this employee from the hash table and return their ref val to the caller.
             int bucket = calcBucket (theEmpNum);
            int id = searchEmpNum (theEmpNum);
            if (id == -1){
               return null;
            }
            buckets[bucket].remove(id);
            // If the employee is not in the hash table, return null to the caller.
              return null;
        }
        
        public int searchEmpNum (int theEmpNum){
            
            //determine the posible of the employee in the ArrayList for the bucket that employee hashes to.
           // if the employee is not found, return -1
           
           int targetBucket = calcBucket(theEmpNum);
           
           for (int f = 0; f < buckets[targetBucket].size(); f++){
              if (theEmpNum == buckets[targetBucket].get(f).getEmpNum()){
                  return(f); 
              } 
           }
           return(-1); //incase theEmpNum was not found in the hashtable
        }
        
         
        public EmployeeInfo getEmployee(int theEmpNum) {
            // Get (but don't remove) this employee from the hash table and return their ref val to the caller.
            
            // If the employee is not in the hash table, return null to the caller.
            return null;
        }
        
        public ArrayList <EmployeeInfo>[] getbuckets(){
            return buckets;
        }

        
       
	
} // end MyHashTable
