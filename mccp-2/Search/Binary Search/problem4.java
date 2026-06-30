import java.util.*;
class D{
	static int No(int a[],int n){
		int l = 0,h= n-1;
		while(l<h){
			if(a[l]<a[h]){
				return l;
			}
			else{
				int m = (l+h)/2;
				if(a[m]<=a[h]){
					h=m;
				}
				else{
					l=m+1;
				}
			}
		}
		return l;
	}
	public static void main(String arg[]){
		int a[] = {10,1,2,3,4};
		int n = a.length;
		System.out.print(No(a,n));
	}
}