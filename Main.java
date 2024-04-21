package org.example;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        for(int i = 1; i <= 5; i++)
        {
            tree.insert(i);
        }
        System.out.println(tree.find(1));
        System.out.println(tree.find(6));
    }
}