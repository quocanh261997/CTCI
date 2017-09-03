import java.util.Arrays;

public class IsUnique {
	public static void main(String[] args) {
		System.out.println(Solution("<ad4gb<"));
	}
	
	public static boolean Solution(String s){
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i<s.length()-1;i++){
			if (arr[i] == arr[i+1]) return false;
		}
		return true;
	}
}
