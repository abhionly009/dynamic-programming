package main.java.graph;

import java.util.ArrayList;


public class GraphStringExample {

    public static void main(String[] args) {

        int vertices =5;
        ArrayList<ArrayList<String>> graph = new ArrayList<>();

       for (int i =0;i<=vertices;i++){
            graph.add(new ArrayList<>());
       }

        graph.get(0).add("X");
        graph.get(0).add("B");
        graph.get(0).add("C");
        graph.get(0).add("D");
        graph.get(0).add("X");



        graph.get(1).add("A");
        graph.get(1).add("X");
        graph.get(1).add("C");
        graph.get(1).add("X");
        graph.get(1).add("X");


        graph.get(2).add("A");
        graph.get(2).add("B");
        graph.get(2).add("X");
        graph.get(2).add("D");
        graph.get(2).add("X");



        graph.get(3).add("A");
        graph.get(3).add("X");
        graph.get(3).add("C");
        graph.get(3).add("X");
        graph.get(3).add("E");



        graph.get(4).add("X");
        graph.get(4).add("X");
        graph.get(4).add("X");
        graph.get(4).add("D");
        graph.get(4).add("X");



        for (int i =0;i<vertices;i++){

            for (int j =0;j<graph.get(i).size();j++){
                System.out.print( graph.get(i).get(j) +" ");
            }
            System.out.println();
        }


    }
}
