package Absraction;

public interface interfaceA {

	
	public void merhod1();
}


/*Interface demo--

Like abstract classes, interfaces cannot be used to create objects 
Interface methods do not have a body - the body is provided by the "implements" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract

An interface cannot contain a constructor (as it cannot be used to create objects)

If we want to extend one interface by another then need to use extends keyword


Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces.
 Note: To implement multiple interfaces, separate them with a comma 






            abstacrt clas                      interface

1. can have regular and abstarct methods        can have only abstarct methods-
2. cannot create the object--                   cannot crate the object--   
    we need to create sublcas to create         We need implements class-
3.we use extends jkeyword                       we use implement keyword


can we create object of abstarct class--No
can we create object of interface--No
can we create object of abstarct method-No
can abstacrt class have body--yes-
can abstarct method have body--No 
*/