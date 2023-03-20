package day1;
import java.util.Arrays;
public class ResizzingArray {

	public static void main(String[] args) {
		int[] myArr = {1, 2, 3, 4, 5};
		int size=10;
		int [] resizedarr=resizeArray(myArr,size);
		System.out.println(Arrays.toString(resizedarr));

	}
	static int[] resizeArray(int[] arr,int newsize) {
		int[] newArr = new int[newsize];
        int copyLength = Math.min(arr.length, newsize);
        System.arraycopy(arr, 0, newArr, 0, copyLength);
        return newArr;
		
	}

}
