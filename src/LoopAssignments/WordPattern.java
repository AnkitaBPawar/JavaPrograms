package LoopAssignments;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String s="SOMESH";
		 //String temp="";
		 for(int i=0;i<s.length();i++)
		 {
			for(int j=0;j<=i;j++) {
				 //temp=temp+s.charAt(i);
				 System.out.print(s.charAt(j));
		 }
		  System.out.println();
		 }
	}

}
