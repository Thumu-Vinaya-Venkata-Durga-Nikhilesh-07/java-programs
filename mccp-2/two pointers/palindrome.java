import java.util.*;
class A{
	public static boolean isPalin(String s){
		int x = 0,y = s.length()-1;
		while(x<y){
			if(s.charAt(x)!=s.charAt(y)){
				return false;
			}
			x++;
			y--;
		}
		return true;
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		String z = sc.next();
		boolean c = isPalin(z);
		System.out.print((c)?"True":"False");
	}
}