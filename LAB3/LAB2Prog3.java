import java.util.Scanner;
class LAB2Prog3{
	public static void main(String...args){
        int[] x = new int[5];
        Scanner s= new Scanner(System.in);

        for(int i=0; i<x.length; i++){
                x[i] = s.nextInt();
        }
        for(int v : x)
               System.out.println(v+" ");
    }
 
 }      