import java.util.*;
class B{
	static ArrayList<ArrayList<Integer>> check(int n,int a[],int target){
		ArrayList<ArrayList<Integer>>al = new ArrayList<>();
		HashMap<Integer,Integer>hm = new HashMap<>();
		for(int i=0;i<n;i++){
			if(hm.containsKey(target-a[i])){
				int k = hm.get(target-a[i]);
				for(int j=0;j<k;j++){
					ArrayList<Integer>t = new ArrayList<>();
					t.add(target-a[i]);
					t.add(a[i]);
					al.add(t);
				}
			}
			hm.put(a[i],getOrDefault(a[i],0)+1);
		}
		return al;
	}
	public static void main(String arg[]){
		int n = 8;
		int a[] = {4,2,3,3,6,6,6,9};
		int target = 9;
		ArrayList<ArrayList<Integer>>al = check(n,a,target);
		System.out.print(al);
	}
}