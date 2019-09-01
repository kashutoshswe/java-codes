package Algorithms;
import java.util.LinkedList;
class Graph
{
    int vertex;
    LinkedList<Integer> list[];

    private Graph(int vertex)
    {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++)
        {
            list[i] = new LinkedList<>();
        }
    }

    private void addEdge(int source, int destination)
    {
        //add edge for Directed graph
        list[source].addFirst(destination);

        /*//add back edge ((for undirected)
        list[destination].addFirst(source);*/
    }

    private void printGraph()
    {
        for (int i = 0; i < vertex; i++)
        {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++)
                {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }

    private void Prims()
    {
        
    }

}

