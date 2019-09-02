package Algorithms;


/*
 * An adjacency list is nothing but an array of lists.
 * The size of the array is equivalent to the number of vertices in the graph.
 * The list at a specific index of the array represents the adjacent vertices of the vertex represented by that array index.
 */



import java.util.LinkedList;
public class GraphImplementation
{
    static class Edge
    {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight)
        {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph
    {
        int vertices;
        //Array of LinkedList(Adjacency List)
        LinkedList<Edge>[] adjacencylist;

        Graph(int vertices)
        {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];

            //initialize adjacency lists for all the vertices
            for (int i = 0; i < vertices; i++)
            {
                //Now each of the Array element is a pointer to new Linkedlist
                adjacencylist[i] = new LinkedList<>();
            }
        }

        void addEgde(int source, int destination, int weight)
        {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge);//for directed graph
        }


        void printGraph()
        {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " + list.get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEgde(0, 1, 4);
        graph.addEgde(0, 2, 3);
        graph.addEgde(1, 3, 2);
        graph.addEgde(1, 2, 5);
        graph.addEgde(2, 3, 7);
        graph.addEgde(3, 4, 2);
        graph.addEgde(4, 0, 4);
        graph.addEgde(4, 1, 4);
        graph.addEgde(4, 5, 6);
        graph.printGraph();
    }
}