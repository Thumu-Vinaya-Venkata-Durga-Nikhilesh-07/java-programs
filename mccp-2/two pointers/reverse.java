import java.util.*;
class Reverse{
	public static String rev(String s){
		char ch[] = s.toCharArray();
		int i=0,j = s.length()-1;
		while(i<j){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String reverse = rev(s);
		System.out.println(reverse);
	}
}