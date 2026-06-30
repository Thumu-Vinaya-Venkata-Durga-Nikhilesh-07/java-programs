import java.util.*;
class D{
	static int[] check(int a[],int n,int target){
		for(int i=0;i<n;i++){
			if(bs(a,n,target-a[i])!=a[i]){
				return new int[]{a[i],a[i]-target};
			}	
		}
		return new int[]{-1,-1};
	}
	static int bs(int a[],int n,int x){
		int l = 0,r = n-1;
		while(l<=r){
			int mid = (l+r)/2;
			if(x==a[mid]){
				return mid;
			}
			else if(x<a[mid]){
				r = mid-1;
			}
			else{
				l = mid+1;
			}
		}
		return -1;
	}
	public static void main(String arg[]){
		int a[] = {10,5,-3,6,4,5};
		int n = 6;
		int target = 16;
		System.out.print(check(a,n,target));
	}
}