//import java.util.*;
//class Edge
//{
//    int weight;
//    int source;
//    int des;
//    Edge(int weight,int source,int des)
//    {
//        this.weight=weight;
//        this.source=source;
//        this.des=des;
//    }
//}
//public class krushkals {
//    static int ans=0;
//    public static void main(String args[])
//    {
//        List<Edge> graphEdges = new ArrayList<Edge>();
//        // graphEdges.add(new Edge(1, 0, 1));
//        // graphEdges.add( new Edge(2, 0, 2));
//        //        graphEdges.add( new Edge(    3, 1, 3));
//        //        graphEdges.add( new Edge(1, 2, 4));
//        //        graphEdges.add(new Edge(2, 3, 4));
//        //        graphEdges.add(new Edge(10,2,3));
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of vertices");
//        int v=sc.nextInt();
//        System.out.println("Enter number of edges");
//        int edges=sc.nextInt();
//
//        int max=0;
//        int value=edges;
//        while(value>0)
//        {   System.out.println("Enter weight , source and destination of the edge");
//            int weight=sc.nextInt();
//            int source=sc.nextInt();
//            int destination=sc.nextInt();
//            max=Math.max(max,Math.max(source,destination));
//            graphEdges.add(new Edge(weight, source, destination));
//            value--;
//
//        }
//
//        graphEdges.sort(new Comparator<Edge>() {
//            @Override public int compare(Edge o1, Edge o2)
//            {
//                return o1.weight - o2.weight;
//            }
//        });
//        krushkals(graphEdges,max,v);
//        System.out.println("cost of mst would be"+ans);
//
//    }
//    static void krushkals(List<Edge> graphEdges,int max,int v)
//    {
//        int noedges=0;
//        int j=0;
//        int p[]=new int[max+1];
//        for(int i=0;i<p.length;i++)
//        {
//            p[i]=i;
//        }
//        while(noedges<v-1)
//        {
//            Edge nextedge=graphEdges.get(j);
//            int x=findRoot(p,nextedge.source);
//            int y=findRoot(p,nextedge.des);
//            if(x!=y)
//            {
//                union(p,x,y);
//
//                noedges++;
//                ans+=nextedge.weight;
//                System.out.println(nextedge.source+" : "+nextedge.des);
//            }
//            j++;
//        }
//    }
//    static int findRoot(int p[],int value)
//    {
//        return p[value];
//    }
//    static void union(int p[],int x,int y)
//    {
//        p[y]=p[x];
//    }
//}
