import java.util.*;
class D{
	public static void main(String arg[]){
		String s = "aaabbaaccc";
		int si = 0,ei = 0;
		StringBuilder sb = new StringBuilder();
		while(ei<s.length()){
			if(s.charAt(ei)==s.charAt(si)){
				ei++;
			}
			else{
				sb.append(s.charAt(si));
				si = ei;
			}
		}
		sb.append(s.charAt(si));
		System.out.print(sb);
	}
}