import java.util.*;
class Z{
	static boolean check(int a[],int n,int target){
		HashSet<Integer>hs = new HashSet<>();
		for(int i=0;i<n;i++){
			if(hs.contains(target-a[i])){
				return true;
			}
			hs.add(a[i]);
		}
		return false;
	}
	public static void main(String arg[]){
		int a[] = {10,6,5,-3,8,4};
		int n = 6;
		int target = 16;
		System.out.print(check(a,n,target));
	}
}