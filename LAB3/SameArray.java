import java.util.Arrays;
class SameArray{
	public static void main(String...args){
	 int[][] arr = {{2, 4}, {3, 5}};
	 int[][] arr1 = {{2, 4}, {3, 5}};
	 System.out.println(Arrays.deepEquals(arr,arr1));
	}
}