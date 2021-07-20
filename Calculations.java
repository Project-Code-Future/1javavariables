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

        System.out.println("I have "+ x +" things");
        //+ Concatenation: 

        x+=1;
        System.out.println(x);
        x++; 
        System.out.println(x);
    }

}