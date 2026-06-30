import java.util.*;

class Connect{
    int n;
    int[] parent;
    int[] size;
    Connect(int n){
        this.n = n;
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    int find(int i){
        if(parent[i]==i){
            return i;
        }
        else{
            return find(parent[i]);
        }
    }
    void cQuery(int i,int j){
        int i1 = find(i);
        int j1 = find(j);
        if(i1!=j1){
            parent[i1] = j1;
            size[j1] = size[i1]+size[j1];
        }
    }
    int qQuery(int i){
        int i1 = find(i);
        return size[i1];
    }
}
class Employes{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Connect ob = new Connect(n);
        while(true){
            System.out.println("Cquery\nQquery\nexit");
            int op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Enter 2 values of i and j");
                    int i = sc.nextInt();
                    int j = sc.nextInt();
                    ob.cQuery(i, j);
                    break;
                case 2:
                    System.out.println("Enter i to get size");
                    int z = sc.nextInt();
                    System.out.println("Size of company of "+z+": "+ob.qQuery(z));
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}