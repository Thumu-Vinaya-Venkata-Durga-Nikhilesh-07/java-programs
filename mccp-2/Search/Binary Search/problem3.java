import java.util.*;
class C{
	static int C(int a[],int n,int x){
		int l=0,h=n;
		while(l<=h){
			int m =(l+h)/2;
			if(a[m] == x){
				return m;
			}
			else if(a[m]>=a[l] && x>=a[l] && x<=a[m]){
				h=m;
			}
			else{
				l=m+1;
			}
		}
		return -1;
	}
	public static void main(String arg[]){
		int a[] = {8,11,14,15,1,4,6};
		int n = a.length-1;
		int x = 4;
		System.out.print(C(a,n,x));
	}
}