package ImpPrograms;

public class PairsWithSumIs25 {
	 public static void main(String[] args) {
		  char[] ch = { 10, 15, 20, 5, 7, 17, 8, 10 };
		  int count = 0;
		  for (int i = 0; i < ch.length; i++) {
		   for (int j = i + 1; j < ch.length; j++) {

		    if (ch[i] + ch[j] == 25) {
		     count++;

		    }

		   }

		  }

		  System.out.println(count);

		 }

}
