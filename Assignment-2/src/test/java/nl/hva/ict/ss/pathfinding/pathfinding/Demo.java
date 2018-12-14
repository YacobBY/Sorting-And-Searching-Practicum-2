package nl.hva.ict.ss.pathfinding.pathfinding;

import nl.hva.ict.ss.pathfinding.Custom.TestResult;
import nl.hva.ict.ss.pathfinding.weigthedgraph.EdgeWeightedDigraph;
import org.junit.Test;

import java.util.ArrayList;

public class Demo {
    public ArrayList<TestResult> dijkstraResults = new ArrayList<>();
    public ArrayList<TestResult> floydResults = new ArrayList<>();


    @Test
    public void test() {

        // Make sure that it is writeable and we know where to look for it

        System.out.printf("ID;Length Dijkstra;Length Floyd;Costs Dijkstra; Costs Floyd\n");
        for (int i = 1; i <= 25; i++) {
            // Read the graph directly from a image
            EdgeWeightedDigraph graafDijkstra = new EdgeWeightedDigraph("i" + i);
            // Get the start and end node
            final int start = graafDijkstra.getStart();
            final int finish = graafDijkstra.getEnd();

            // Run dijkstra
            final Dijkstra dijkstra = new Dijkstra(graafDijkstra, start);
            if (dijkstra.hasPathTo(finish)) {
                // Show the result
                graafDijkstra.tekenPad(dijkstra.pathTo(finish));
                // Save it
                graafDijkstra.save("i" + i + "-dijkstra");
            }

            // Run Floyd-Warshall
            EdgeWeightedDigraph graafFloyd = new EdgeWeightedDigraph("i" + i);
            FloydWarshall floyd = new FloydWarshall(graafFloyd.createAdjMatrixEdgeWeightedDigraph());
            if (floyd.hasPath(start, finish)) {
                // Show the result
                graafFloyd.tekenPad(floyd.path(start, finish));
                // Save it
                graafFloyd.save("i" + i + "-floyd");
            }
            if (dijkstra.hasPathTo(finish)) {
                System.out.printf("i%d;%d;%d;%1.0f;%1.0f\n", i, length(dijkstra.pathTo(finish)), length(floyd.path(start, finish)), dijkstra.distTo(finish), floyd.dist(start, finish));

                dijkstraResults.add(new TestResult(Integer.toString(i), "4", Integer.toString(length(dijkstra.pathTo(finish))), String.valueOf(dijkstra.distTo(finish))));
                floydResults.add(new TestResult(Integer.toString(i), "4", Integer.toString(length(floyd.path(start, finish))), String.valueOf(floyd.dist(start, finish))));
            } else {
                System.out.printf("i%d;-;-;-;-\n", i);
            }
        }

        System.out.println("Dijkstra: ");
        for (TestResult result : dijkstraResults) {
            System.out.println(result.getBitmapName());
            System.out.println("Tiles");
            System.out.println(result.getTiles());
            System.out.println("Length");
            System.out.println(result.getLength());
            System.out.println("Cost");
            System.out.println(result.getCost());
        }
        System.out.println("Floyd: ");
        for (TestResult result : floydResults) {
            System.out.println(result.getBitmapName());
            System.out.println("Tiles");
            System.out.println(result.getTiles());
            System.out.println("Length");
            System.out.println(result.getLength());
            System.out.println("Cost");
            System.out.println(result.getCost());
        }


    }

    private <T> int length(Iterable<T> iterable) {
        int length = 0;
        for (T notNeeded : iterable) {
            length++;
        }
        return length;
    }

}
