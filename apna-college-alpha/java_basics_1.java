import java.util.*;

// THEORY IN THIS FILE

// OPERATORS
// SCOPE

public class java_basics_1 {
    
    public static void main(String args[]) {
        //public static = access modifiers // in oops
        //void = return type // output
        //main = function // main function
        //String args[] = input type // input array
        Scanner sc = new Scanner(System.in);


// OPERATORS

        // -- 1 -- // ARITHEMATIC OPERATORS
        // BINARY |   +  -  *  /  %
        // UNARY  |   ++   --

        // -- 2 -- // RELATIONAL OPERATORS
        //   ==   !=   >   <   >=   <=

        // --3 -- // LOGICAL OPERATORS
        //   &&   ||   !

        // -- 4 -- // ASSIGNMENT OPERATORS
        //   =   +=   -=   *=   /=

//loop trick use i=1 when it is multiplyy //
// FUNCTION OVERLOADING : multiple functions with same name but different parameters : only dependent on parameters and not on return type

// SCOPE
    /*
        Class Scope:
            Definition: Variables and methods declared at the class level, accessible by any method within the class. 
                public class MyClass {
                    static int classScopeVariable = 10;
                }

        Method Scope: Variables declared within a method, accessible only within that method.
        Example:
            public void myMethod() {
                int methodScopeVariable = 20;
            }
            
        Block Scope: Variables declared within a block of code (e.g., loops, conditional statements), accessible only within that block.
        Example:
            if (condition) {
                int blockScopeVariable = 30;
            }

        Local Scope: Parameters and variables declared within a method or block, accessible only within that method or block.
        Example:
            public void myMethod() {
                int localScopeVariable = 40;
            }

        Instance Scope: Variables declared within a class but outside of any method, accessible to all methods and blocks within the class, as long as the instance of the class exists.
        Example:  
            public class MyClass {
                int instanceScopeVariable = 50;
            }

        Static Scope: Variables declared as static within a class, accessible to all instances of the class, and can be accessed without creating an instance.
        Example:
            public class MyClass {
                static int staticScopeVariable = 60;
            }
     */

   

    
    }
}
