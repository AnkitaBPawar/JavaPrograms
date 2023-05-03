package ExceptionHandling;

public class tryCatch {


 
 //The try block contains set of statements where an exception can occur. 

 
 //Syntax
 /*try {
    //  Block of code to try
  }
  catch(Exception e) {      // e' stands for exception, but you can rename it anything you like, however, the data type has to remain 'Exception') The 'e' variable stores an exception-type object in this case.
    //  Block of code to handle errors
  }*/

 
 
 
 public static void main(String[] args) {
  
  int a[]= {10,20,30};
  try {
     System.out.println(a[8]);
  }
  catch(Exception e) {
     e.printStackTrace();//This will print the exception details
      System.out.println("please try to access value within range");
   System.out.println("hello");
  }
  
 
 }

}