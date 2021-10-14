import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    static int[][] check;
    static boolean[] checked;
    static int n;
    static int m;
    static int start;
    
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        start=sc.nextInt();
        
        
        check=new int [1001][1001];
        checked=new boolean[1001];
        
        
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            check[a][b]=check[b][a]=1;
        }
        
        dfs(start);
        
        checked=new boolean[1001];
        System.out.println();
        
        bfs();
    }
    
    public static void dfs(int i){
        checked[i]=true;
        System.out.print(i+" ");
        
        for(int j=1;j<=n;j++){
            if(check[i][j]==1&&checked[j]==false){
                dfs(j);
            }
        }
    }
    
    public static void bfs(){
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.offer(start);
        checked[start]=true;
        System.out.print(start+" ");
        
        while(!queue.isEmpty()){
            int temp=queue.poll();
            for (int j=1;j<=n;j++){
                if(check[temp][j]==1&&checked[j]==false){
                    queue.offer(j);
                    checked[j]=true;
                    System.out.print(j+" ");
                }
            }
        }
    }
}

//bfs식 풀이

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    static int[][] check;
    static boolean[] checked;
    static int n;
    static int m;
    
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        
        check=new int[n+1][n+1];
        checked=new boolean[n+1];
        
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            check[a][b]=check[b][a]=1;
        }
        
        
        bfs();
        int cnt=0;
        for(int k=1;k<=n;k++){
            if(checked[k]==true){
                cnt++;
                }
            }
        System.out.println(cnt-1);
    }
    
    public static void bfs(){
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(1);
        checked[1]=true;
        
        while(!queue.isEmpty()){
            int temp=queue.poll();
            for(int i=1;i<=n;i++){
                if(check[temp][i]==1 &&checked[i]==false){
                    queue.offer(i);
                    checked[i]=true;
                }
            }
        }
    }
}
