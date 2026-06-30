import java.util.*;
class B{
	public static boolean ts(int a[],int n,int target){
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if((a[i]+a[j])==target){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		boolean check = ts(a,n,target);
		System.out.print((check)?"True":"False");
	}
}