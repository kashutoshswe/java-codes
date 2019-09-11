package Collections;

public class GraphDemo
{
    public static void main(String[] args)
    {
        Graph graph=new Graph();
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(0,5);
        graph.addEdge(1,4);
        graph.addEdge(1,3);
        graph.addEdge(3,2);
        graph.addEdge(2,1);
        graph.addEdge(3,4);

        graph.display();
    }
}
