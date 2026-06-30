import java.util.*;
class A{
	static ArrayList<ArrayList<Integer>> check(int n,int a[],int target){
		ArrayList<ArrayList<Integer>>al = new ArrayList<>();
		for(int i=0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(a[i]+a[j] == target){
					ArrayList<Integer>t = new ArrayList<>();
					t.add(a[i]);
					t.add(a[j]);
					al.add(t);
				}
			}
		}
		return al.size();
	}
	public static void main(String arg[]){
		int n = 8;
		int a[] = {6,1,3,5,4,7,2,12};
		int target;
		int al = (n,a,target);
		System.out.print(al);
	}
}