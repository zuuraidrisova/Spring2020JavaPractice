package Replit_Practices;

public class Encapsulation_Value {

    /*
    Instance variables:
            val as int
            modified as boolean
     */
     int val;
     boolean modified;
/*
Constructors:

        a constructor with no parameters
        a constructor accepting a single int parameter to initialize val
 */
    public Encapsulation_Value(){

    }
    public Encapsulation_Value(int val){

        this.val = val;
    }
    /*
    Methods:

        a getter method for instance variable val name it getVal
        a getter method for instance variable modified, name it wasModified
        a setter method for instance variable val, name it setVal
            it will set the value of the val to new value passed
            calling setVal method means original value of instance val has been modified
            so set the value of instance variable modified to appropriate value to indicate
            data has been modified after calling the setVal
     */

    public int getVal(){

        return val;
    }

    public boolean wasModified(){

        return modified;
    }

    public void setVal(int val){

        this.val = val;

        this.modified = true;
    }
}
