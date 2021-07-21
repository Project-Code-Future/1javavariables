//Java Workshop 1: Variables
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
*/

//@ The class and public static void main method are necessary for any Java file, but not necessary to fully understand for this workshop
class Calculations {

    public static void main(String[]args){

        
        System.out.println("Hello World");
        //!
        //+ System.out.println() tells the System to print out whatever is in the parentheses
        //+ Semicolons in Java indicate the end of a line of code like periods end sentences
        //& Make sure students understand they need surrounding quotes when printing out words
     
        System.out.println(3); 
        System.out.print(5); 
        System.out.print(6);
        //!
        //+ System.out.println() vs System.out.print(): println adds a new line after printing while print does not
        //+ Code is run from top to bottom line by line
        //@ 3 is printed and after it a new line is added. Then 5 and 6 are printed without new lines, resulting in 56

        System.out.println(5+6);
        System.out.println(7*8);
        System.out.println(9-200);
        System.out.println(100/5);
        //!
        //+ Java has operators that can do basic math; + means addition, - means subtraction, * means multiplication, / means division

        System.out.println(24%5);
        //!
        //+ The modulo operator % performs division but returns the remainder

        System.out.println(3+7*2);
        //!
        //+ Math operations in Java follow PEMDAS. However, parentheses do not indicate multiplication. 
        //+ Modulo % and multiplication * are both M in PEMDAS
        //& Have students create and solve a math problem of their own

        int x = 5; 
        //@ This declares an integer variable called x and sets its value to 5.
        //+ Variables store information and can be modified

        System.out.println(x);
        //!
        //@ This prints out the value stored in variable x which is 5

        x=x+1;
        System.out.println(x);
        //!
        //@ This assigns x to a new value of (x+1) and prints it out

        x+=1;
        //+ In-Place Operators shorten the way you write x = x+ some number to x+= some number
        System.out.println(x);
        x++; 
        //@ This is a shortened version of x=x+1
        System.out.println(x);
        //!

        x-=1; 
        System.out.println(x);
        x--;
        System.out.println(x);
        //@ In-Place Operators and -- instead of ++ work for subtraction like they work for addition
        
        //This is a comment 
        //+ Single line comments can be made with a // preceding the comment
        //+ Comments don't affect code, they are just helpful notes for the developer
        /* */ 
        //+ Multiline comments can be made with a /* preceding the comment and a */ ending it
    
        int a = 5; 
        double b = 5.0; 
        System.out.println(a/7); 
        System.out.println(b/7);
        //!
        //+ When declaring a variable, the variable type (int, double, etc.) must be specified first 
        //+ Variables cannot change their variable type, so an int cannot become a double
        //+ ints are Integers which means they are numbers without decimals (..., -2, -1, 0, 1, 2, ...)
        //+ doubles are 64-bit decimals, basically all real numbers including decimals 
        //+ When an integer is divided by an integer, the stuff after the result's decimal point is removed/truncated

        char c = 'c'; 
        String d = "Code Future"; 
        System.out.println(c); 
        System.out.println(d); 
        //!
        //+ Strings are words and sentences while chars are single characters
        //+ Strings are indicated by double quotes ""
        //+ chars are indicated by single quotes ''

        x= 1;

        System.out.println("I have "+ x +" computer");
        //!
        //+ Concatenation: By using the + signs, Strings can be added together with other data types
        
        System.out.print("\"This is cool\"- Code Future\n");
        //!
        //+ Escape Characters - Special characters like "" used in Java can be used in print statements when preceded by \
        //+ Newlines can be created in a String using \n

        //& With the remaining time, challenge students to print out word problems and then print out their solutions to each other's problems
        //& Make sure they use concatenation to print out solutions using both words and numbers, also have them use Java to do the calculations
    }

}