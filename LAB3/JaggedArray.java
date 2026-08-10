import java.util.Scanner;

class JaggedArray{
	public static void main(String...args){
      int[][] arr = new int[3][];
      Scanner s = new Scanner(System.in);

       for (int i = 0; i<arr.length; i++){
       		int rs = s.nextInt();
       		arr[i] = new int[rs];
       		for (int j = 0; j<arr[i].length; j++){
       			arr[i][j]=s.nextInt();
       			System.out.print(arr[i][j] + " ");
       		}
        System.out.println();
       }
    }
}