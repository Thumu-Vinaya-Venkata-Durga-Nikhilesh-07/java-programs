import java.util.*;
class A{
	static int Search(int a[],int n,int x){
		int l = 0,h = n-1;
		int index = -1;
		while(l<=h){
			int m = (l+h)/2;
			if(a[m] == x){
				index = m;
				l=m+1;
			}
			else if(a[m]>x){
				h = m-1;
			}
			else{
				l = m+1;
			}
		}
		return index;
	}
	public static void main(String arg[]){
		int a[] = {2,3,3,3,8,8,8,8,8,12,14,14};
		int n = a.length;
		int x = 8;
		int occurence = Search(a,n,x);
		System.out.print(occurence);
	}
}