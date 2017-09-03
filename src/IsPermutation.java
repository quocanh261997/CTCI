import java.util.Arrays;
import java.util.HashMap;

public class IsPermutation {
	public static void main(String[] args) {
		System.out.println(Solution2("aabdc", "bacaek"));
	}
	
	//Space complexity O(1) and time complexity O(NlogN)
	public static boolean Solution (String a, String b){
		if (a.length()!=b.length()) return false;
		char[] arr1 = a.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = b.toLowerCase().toCharArray();
		Arrays.sort(arr2);
		for (int i = 0; i<arr1.length;i++){
			if (arr1[i]!=arr2[i]) return false;
		}
		return true;
	}
	
	//Space complexity O(n) and time complexity O(n)
	public static boolean Solution2 (String a, String b){
		if (a.length()!=b.length()) return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i<a.length();i++){
			if (!map.containsKey(a.charAt(i))) map.put(a.charAt(i), 1);
			else map.put(a.charAt(i), map.get(a.charAt(i))+1);
		}
		for (int i = 0; i<b.length();i++){
			if (!map.containsKey(b.charAt(i))) return false;
			else {
				if (map.get(b.charAt(i))==1) map.remove(b.charAt(i));
				else map.put(b.charAt(i), map.get(b.charAt(i))-1);
			}
		}
		return true;
	}
}
