import java.util.*;
class C{
	static int binary(int a[],int l,int h,int target){
		if(l>h){
			return -1;
		}
		else{
			int m = (l+h)/2;
			if(a[m] == target){
				return m;
			}
			else if(a[m]>target){
				return binary(a,l,m-1,target);
			}
			else{
				return binary(a,m+1,h,target);
			}
		}
	}
	public static void main(String arg[]){
		int a[] = {1,2,3,4,5,6};
		int n = a.length;
		int target = 5;
		int x = binary(a,0,n-1,target);
		System.out.print(x);
	}
}