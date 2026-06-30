import java.util.*;
class AA{
	static boolean is(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]+a[j] == 0){
					return true;
				}
			}
		}
		return false;		
	}
	public static void main(String arg[]){
		int a[] = {1,0,-1,2,-3,3};
		System.out.print(is(a));
	}
}