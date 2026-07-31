package main.java.graph;

public class GraphUsingMatrix {




        /**
         *          A
         *        /   \
         *        B---C
         *
         *      matrix will be
         *          A B C
         *      A  0  1  1
         *      B  1  0  1
         *      C  1  1  0
         *
         */

        public static void main(String[] args) {

            int vertices = 3;

            int graph [][] = new int[vertices][vertices];

            graph[0][1] = 1;
            graph[0][2] = 1;


            graph[1][0] = 1;
            graph[1][2] = 1;



            graph[2][0] = 1;
            graph[2][1] = 1;

            printGraph(graph);


        }

        private static void printGraph(int graph [][]){

            for (int i=0;i<graph.length;i++){

                for(int j=0;j<graph[i].length;j++){
                    System.out.print(graph[i][j] +" ");
                }

                System.out.println();

            }

        }

}
