
public class OneAway {
	public static void main(String[] args) {
		System.out.println(oneAway("bale", "pale"));
	}
	
	public static boolean oneAway(String a, String b){
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (Math.abs(a.length()-b.length())>=2) return false;
		else{
			if (a.length()==b.length()){
				int count = 0;
				for (int i = 0; i<a.length(); i++){
					if (a.charAt(i)!=b.charAt(i)) count++;
				}
				return count <=1;
			}
			else{
				int max = Math.max(a.length(), b.length());
				String longer = a;
				String shorter = b;
				if (b.length()==max){
					longer = b;
					shorter = a;
				}
				int i = 0;
				for (int j = 0; j<longer.length(); j++){
					if (j-i>1) return false;
					if (longer.charAt(i)==longer.charAt(j)){
						i++;
					}
				}
				return true;
			}
		}
	}
	
}
