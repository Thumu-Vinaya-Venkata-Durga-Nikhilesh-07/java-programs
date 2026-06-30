import java.util.*;
class C{
	public static void main(String arg[]){
		int n = 6;
		int a[] = {0,1,2,0,1,2};
		int c1 = 0,c2 = 0,c3 = 0;
		int l=0,m=0,h=n-1;
		while(m<=h){
			if(a[m] == 0){
				int temp = a[l];
				a[l] = a[m];
				a[m] = temp;
				l++;
				m++;
			}
			else if(a[m] == 1){
				m++;
			}
			else if(a[m] == 2){
				int temp = a[h];
				a[h] = a[m];
				a[m] = temp;
				h--;
			}
		}
		for(int z:a){
			System.out.print(z+" ");
		}
	}
}