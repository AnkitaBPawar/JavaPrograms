package Constructor;



	public class ContructoReuirePRogram {
	        int rollno;
	  String name;

	  /*
	  public  ContructoReuirePRogram (int rollno1, String name1)
	  {
	   this.rollno = rollno1;
	   this.name = name1;
	   System.out.println("Rollno : "+rollno+" & Name : "+name);
	  }*/
	  
	  public void method1(int rollNo1, String name1) {
	   this.rollno=rollNo1;
	   this.name=name1;
	   System.out.println("Rollno : "+rollno+" & Name : "+name);
	   
	  }
	  
	  
	  
	  
	 
	 
	  public static void main(String[] args)
	  {
	  // ContructoReuirePRogram s1=new ContructoReuirePRogram(1,"rahul");
	  // ContructoReuirePRogram s2=new ContructoReuirePRogram(3,"ram"); 
	  //ContructoReuirePRogram s2=new ContructoReuirePRogram(4,"ramesh"); 
	   
	 
	   ContructoReuirePRogram  obj= new ContructoReuirePRogram ();
	   obj.method1(1, "rahul");
	   
	   ContructoReuirePRogram  obj1= new ContructoReuirePRogram ();
	   obj1.method1(1, "ram");
	   
	   
	   ContructoReuirePRogram  obj2= new ContructoReuirePRogram ();
	   obj2.method1(1, "ramesh");
	   
	   
	   
	   
	   
	   
	   
	   
	  
	  }
	 }
