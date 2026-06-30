import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer>> a;
    int n;
    Graph(int n){
        this.n = n;
        a = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>al = new ArrayList<>();
            a.add(al);
        }
    }
    public void addEdge(int u,int v){
        a.get(u).add(v);
        a.get(v).add(u);
    }
    public boolean biparte(int n){
        int[] colour = new int[n];
        for(int i=0;i<n;i++){
            colour[i] = -1;
        }
        for(int i=0;i<n;i++){
            if(colour[i]==-1){
                if(dfs(i,0,colour)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int s,int col,int[] colour){
        colour[s] = col;
        for(int x:a.get(s)){
            if(colour[x]==-1){
                if(dfs(x,1-col,colour)==false){
                    return false;
                }
            }
            else if(colour[x]==col){
                return false;
            }
        }
        return true;
    }
}
class A{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vertices:");
        int n = sc.nextInt();
        Graph ob = new Graph(n);
        boolean xx = true;
        while(xx){
            System.out.println("add edge\nstop");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    ob.addEdge(a, b);
                    break;
                case 2:
                    xx = false;
                    break;
            }
        }
        System.out.println(ob.biparte(n));
    }
}