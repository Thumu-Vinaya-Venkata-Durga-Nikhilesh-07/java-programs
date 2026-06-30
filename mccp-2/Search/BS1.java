import java.util.*;
class B{
	static int linear(int a[],int n,int target){
		for(int i=0;i<n;i++){
			if(a[i] == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String arg[]){
		int a[] = {2,3,4,5,6,7,8};
		int n = a.length;
		int target = 6;
		int x = linear(a,n,target);
		System.out.print(x);
	}
}