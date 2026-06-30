import java.util.*;
class X{
	static int terinary(int a[],int l,int h,int target){
		if(l<=h){
			int m1 = l+(h-l)/3;
			int m2 = h-(h-l)/3;
			if(a[m1] == target){
				return m1;
			}
			else if(a[m2] == target){
				return m2;
			}
			else if(a[m1]<target){
				return terinary(a,l,m1-1,target);
			}
			else if(a[m2]>target){
				return terinary(a,m2+1,h,target);
			}
			else if(a[m1]<target && a[m2]>target){
				return terinary(a,m1+1,m2-1,target);
			}
		}
		else{
			return -1;
		}
	}
	public static void main(String arg[]){
		int a[] = {1,3,5,7,6,4,2};
		int n = a.length;
		int target = 2;
		int x = terinary(a,0,n-1,target);
		System.out.print(x);
	}
}