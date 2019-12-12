import java.util.Scanner;

public class pattern2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the Number here :  ");
		
		int NoOfRows = sc.nextInt();
		int rowcount =1;
		
		for(int i= NoOfRows; i > 0 ; i--) {
			
			for(int j = 1; j <=i; j++) {
				
				System.out.print(" ");
					}
			for (int j = 1; j<=rowcount; j++ ) {
				System.out.print(j + " ");
				}
			 System.out.println();
			 
			 rowcount++;
		}
	}

}
