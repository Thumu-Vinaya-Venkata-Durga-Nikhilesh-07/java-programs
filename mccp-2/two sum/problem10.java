import java.util.*;
class E{
	public static void main(String arg[]){
		int n = 6;
		int a[] = {0,3,1,2,5,4};
		int i = 0,j = n-1;
		while(i<=j){
			if(a[i]%2==0){
				i++;
			}
			if(a[j]%2!=0){
				j--;
			}
			if(a[i]%2!=0 && a[j]%2==0){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		for(int x:a){
			System.out.print(x+" ");
		}
	}
}