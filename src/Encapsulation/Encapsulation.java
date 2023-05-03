package Encapsulation;

public class Encapsulation {
	
	
	private String name;

	
    //To set or update the value
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//To access the value
	public String getName() {
		return name;
	}
	
	
	
}







/*
 * Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

1.declare class variables/attributes as private
2.provide public get and set methods to access and update the value of a private variable

 */