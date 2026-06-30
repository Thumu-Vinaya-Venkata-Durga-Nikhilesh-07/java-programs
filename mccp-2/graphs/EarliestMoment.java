import java.util.*;

class DSU{
    int n;
    int components;
    int time;
    int[] parent;
    DSU(int n){
        this.n = n;
        this.components = n;
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
    }
    static int find(int i){
        if(parent[i]==i){
            return i;
        }
        else{
            return find(parent[i]);
        }
    }
    static void union(int i, int j,int t){
        int i1 = find(i);
        int j1 = find(j);
        if(i1!=j1){
            parent[i1]=j1;
            components--;
            time = t;
        }
        if(components == 1){
            System.out.print(time);
            System.exit(0);
        }
    }
}
class Early{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer arr[][] = new Integer[m][3];
        for(int i=0;i<n;i++){
            Integer temp[] = new Integer[3];
            for(int j=0;j<3;j++){
                temp[j] = sc.nextInt();
            }
            arr[0] = temp;
        }
        Arrays.sort(arr , (a,b) -> Integer.compare(a[2],b[2]));
    }
}