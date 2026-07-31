package main.java.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *      1 ---- 2
 *      |      |
 *      |      |
 *      3 ---- 4
 *
 *         A
 *
 */

public class BfsTraversalExample {

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i =0;i<= vertices;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(1);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(4);


        graph.get(4).add(1);
        graph.get(4).add(2);
        graph.get(4).add(3);

        bfsTraversal(graph, 4);
    }

    private static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int start){

        boolean[] visited = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        visited[start] = true;

        while (!queue.isEmpty()){
            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbour: graph.get(current)){

                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }

            }

        }


    }


}

