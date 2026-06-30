import java.util.*;
class B{
	static int C(int a[],int x){
		int first = 0;
		int last = 0;
		for(int i=0;i<a.length;i++){
			if(a[i] == x){
				first = i;
				break;
			}
		}
		for(int i=a.length-1;i>=0;i--){
			if(a[i] == x){
				last = i;
				break;
			}
		}
		return (last - first)+1;
	}
	public static void main(String[] arg){
		int a[] = {2,6,6,9,9,9,9,11,11,15,15,16};
		int n = a.length;
		int x = 6;
		int count = C(a,x);
		System.out.println(count);
	}
}