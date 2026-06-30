import java.util.*;
class A{
	static int f(int a[],int x){
		int c=0;
		int l=0,h=a.length-1;
		while(l<=h){
			int m=(l+h)/2;
			if(a[m]==x){
				c=m;
				h = m-1;
			}
			else if(a[m]<x){
				l = m+1;
			}
			else{
				h = m-1;
			}
		}
		return c;
	}
	static int l(int a[],int x){
		int c=0;
		int l=0,h=a.length-1;
		while(l<=h){
			int m=(l+h)/2;
			if(a[m]==x){
				c=m;
				l=m+1;
			}
			else if(a[m]<x){
				l = m+1;
			}
			else{
				h = m-1;
			}
		}
		return c;
	}
	static int C(int x,int a[]){
		int first = f(a,x);
		int last = l(a,x);
		if(first==0 && last==0){
			return 0;
		}
		else{
			return (last-first)+1;
		}
	}
	public static void main(String arg[]){
		int a[] = {2,6,6,9,9,9,9,15,15,24,24};
		int n = a.length;
		int x = 9;
		int count = C(x,a);
		System.out.print(count);
	}
}