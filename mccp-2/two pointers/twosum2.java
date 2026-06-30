import java.util.*;
class C{
	static int[] check(int a[],int n,int target){
		Arrays.sort(a);
		int i=0,j = n-1;
		while(i<j){
			if((a[i]+a[j])==target){
				return new int[]{i,j};
			}
			else if((a[i]+a[j])<target){
				i++;
			}
			else{
				j--;
			}
		}
		return new int[]{-1,-1};
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ts[] = check(a,n,target);
		System.out.print(ts);
	}
}