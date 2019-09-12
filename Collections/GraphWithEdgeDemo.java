package Collections;

public class GraphWithEdgeDemo
{
    public static void main(String[] args)
    {
        GraphWithEdge graph=new GraphWithEdge();
        graph.addEdge(0,1,10);
        graph.addEdge(0,4,20);
        graph.addEdge(0,5,50);
        graph.addEdge(1,4,5);
        graph.addEdge(1,3,25);
        graph.addEdge(1,2,20);
        graph.addEdge(3,2,8);
        graph.addEdge(2,1,6);
        graph.addEdge(3,4,7);

        graph.display();
        graph.findShortestRoute(0);
    }
}
