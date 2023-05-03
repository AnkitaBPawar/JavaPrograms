package LoopAssignments;

public class WordPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int alpha=65;
		for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((char)(alpha++)+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
