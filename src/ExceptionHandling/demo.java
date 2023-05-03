package ExceptionHandling;

public class demo {


 public static void main(String[] args) {
  
  
  int a[]= {10,20,30};
  try {
     System.out.println(a[5]);
  }
  catch(Exception e) {
   System.out.println("hello");
  }
  finally {
   System.out.println("hello2");
  }
  
  System.out.println("hello3");
  
 }

}
/*Try block
The try block contains set of statements where an exception can occur. 
A try block is always followed by a catch block, which handles the exception that occurs in associated try block. 
A try block must be followed by catch blocks or finally block or both.

Catch Block
A catch block is where you handle the exceptions, this block must follow the try block. A single try block can have several catch blocks associated with it. 
You can catch different exceptions in different catch blocks. When an exception occurs in try block, the corresponding catch block that handles that particular exception executes. 
For example if an arithmetic exception occurs in try block then the statements enclosed in catch block for arithmetic exception executes.

Rules:
Statements that might generate an exception are placed in a try block
Not all statements in the try block will execute; the execution is interrupted if an exception occurs
The try block is followed by one or more catch blocks or, if a try block has no catch block, then it must have the finally block
A catch block specifies the type of exception it can catch. It contains the code known as exception handler
The last catch block may be followed by an optional finally block
Any code contained in a finally block always executes, regardless of whether an exception occurs, except when the program exits early from a try block by calling the System.exit() method

*/