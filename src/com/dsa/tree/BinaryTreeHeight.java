package com.dsa.tree;

public class BinaryTreeHeight {
    public static void main(String[] a){

        BinaryTreeUtils binaryTree = new BinaryTreeUtils();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.left.left.left = new Node(6);
        binaryTree.root.left.left.left.left = new Node(7);

        System.out.println("Height of the tree is: "+binaryTree.findHeightOfBinaryTree(binaryTree.root));
    }
}

class BinaryTreeUtils {
    Node root;
    public int findHeightOfBinaryTree(Node node){
        if(node == null){
            return -1;
        }
        int lHeight = findHeightOfBinaryTree(node.left);
        int rHeight = findHeightOfBinaryTree(node.right);

        if(lHeight > rHeight){
            return (lHeight+1);
        }else{
            return (rHeight+1);
        }
    }
}

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
