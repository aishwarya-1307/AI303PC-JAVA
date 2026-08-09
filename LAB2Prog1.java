import java.util.Scanner;
class LAB2Prog1{
	public static void main(String...args){
           Scanner s = new Scanner(System.in);
           IO.println("Enter the Number: ");
           int x = s.nextInt();
           IO.println("Enter the Number: ");
           int y = s.nextInt();
           int check = x/y;
           IO.println(check);
	}	
}
