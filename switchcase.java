import java.util.Scanner;
void main(){
	System.out.println("Enter the name of phone to get the Brand");
	String cname = new Scanner(System.in).nextLine();

    String str = switch(cname){
        case  "iPhone 18": 
           System.out.println("APPLE");
           yield  "Apple";

        default:
           yield "Unknown Brand";
    };
} 