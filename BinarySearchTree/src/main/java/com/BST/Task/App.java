package com.BST.Task;
//Binary tree is the tree that have two children and the keys is used to create binary trees
//Have a children smaller value in the left
//Have a children bigger value in the right
//Maximum number if the children is two

public class App {
    //Every single tree has a root value
    Node root;

    public void addNode(int key, String name) {
        //This method is to adding nodes
        //create a new node and initialize it by pass the key and the name
        Node newNode = new Node(key, name);

        //Then you check if this indeed the root element of the our tree
        //then going to throw new node
        if (root == null) {
            root = newNode;
        } else {
            // we going to create another node
            //Focus the root at this node if its else
            //we gonna call the focus node because this node that will be focusing on
            //we gonna set root at this node because you are surely starting from the root
            Node focusNode = root;
            //Startup the parent Node
            //the future parent for our new node is be like this
            Node parent;
            while (true) {
                //set the parent as focus node
                parent = focusNode;
                //check if the new node should go in the left or the right side of our parent
                //so you can put this if control statement
                if (key < focusNode.key) {
                    //change the focus to the left child because the left child have a key value that less than the parent
                    focusNode = focusNode.leftChild;
                    //if the left children has no child then we want to pace new node on the left of it
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        //then return to jump out of this
                        return;
                    }
                } else {
                    //put our node on the right
                    focusNode = focusNode.rightChild;
                    // then show if right child have no children
                    if (focusNode == null) {

                        parent.rightChild = newNode;
                        return;

                    }
                }

            }


        }


    }

    //When all node go to be visited in ascending order
    //Then you gonna see the recursion is gonna be used used by go to the one node then go to children node and so forth and so on
    //create a method of the inorder traverse tree and this method receive a node which gonna be focus are focus node
    public void in0rderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            //you calling the method to traversing the left node
            in0rderTraverseTree(focusNode.leftChild);
            //Then you visit the currently focused on node because it will be the next value that is the lowest value
            //Then you make a traverse the right child as you see
            System.out.println(focusNode);
            in0rderTraverseTree(focusNode.rightChild);
        }
    }

    public void preTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preTraverseTree(focusNode.leftChild);
            preTraverseTree(focusNode.rightChild);
        }
    }

    public void postTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postTraverseTree(focusNode.leftChild);
            postTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }

    }

    //This method is to show how to find node after create tree
    //And pass the key that define the node that want be to looking it
    public Node findNode(int key) {
        //start the top of the tree and the focus node is gonna the root
        Node focusNode = root;
        while (focusNode.key != key) {

            if (key < focusNode.key) {
                //we should search in the left children
                //if yes it is can shift the focus node to the left child of the focus node
                focusNode = focusNode.leftChild;

            } else {
                focusNode = focusNode.rightChild;

            }

            if (focusNode == null)
                return null;
        }

        return focusNode;

    }

    //Create a method that helps to remove nodes form tree
    public boolean remove(int key) {
        //find a couple nodes
        Node focusNode = root;
        Node parent = root;
        //when you search a node to delete we should look to left or to the right when you search through binary tree
        boolean isITALeftChild = true;
        while (focusNode.key != key) {

            parent = focusNode;
            //we should search for the left

            if (key < focusNode.key) {

                isITALeftChild = true;
                focusNode = focusNode.leftChild;


            } else {
                isITALeftChild = false;
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null)
                return false;


        }
        //if the node not have children do this
        if (focusNode.leftChild == null && focusNode.rightChild == null) {
            if (focusNode == root) {
                root = null;
                //basic says if no have a left child or right child its equal to root then the root can be null

            } else if (isITALeftChild) {

                parent.leftChild = null;

            } else {
                parent.rightChild = null;

            }
        }
        //if you no right child
        else if (focusNode.rightChild == null) {
            if (focusNode == root)
                root = focusNode.leftChild;

            else if (isITALeftChild)
                parent.leftChild = focusNode.leftChild;

            else parent.rightChild = focusNode.leftChild;

        }
        //if the situation have no left child
        else if (focusNode.leftChild == null) {

            if (focusNode == root)
                root = focusNode.rightChild;

            else if (isITALeftChild)
                parent.leftChild = focusNode.rightChild;
            else
                parent.rightChild = focusNode.leftChild;


        } else {
            Node replacement = getReplacementNode(focusNode);

            if (focusNode == root)
                root = replacement;
            else if (isITALeftChild)
                parent.leftChild = replacement;
            else
                parent.rightChild = replacement;
            replacement.leftChild = focusNode.leftChild;

        }
        return true;
    }

    public Node getReplacementNode(Node replacedNode) {
        //define our replacement parent as well as replacement itself
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        Node focusNode = replacedNode.rightChild;
        while (focusNode != null) {

            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;

        }
        if (replacement != replacedNode.rightChild) {
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;

        }
        return replacement;
    }

    public static void main(String[] args) {
        App theTree = new App();
        //Then you add node to this
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Manager");
        theTree.addNode(15, "IT Employee ");
        theTree.addNode(30, "Marketing Employee");
        theTree.addNode(75, "Sales Officer");
        theTree.addNode(85, "Secretary");

        theTree.in0rderTraverseTree(theTree.root);
        System.out.println("----------------------------------------------------");
        theTree.preTraverseTree(theTree.root);
        System.out.println("----------------------------------------------------");
        theTree.postTraverseTree(theTree.root);
        System.out.println("----------------------------------------------------");
        System.out.println("Search for 30");
        System.out.println(theTree.findNode(30));
        System.out.println("----------------------------------------------------");
        System.out.println("Remove key 50");
        theTree.remove(50);
        theTree.preTraverseTree(theTree.root);


    }

}

class Node {
    //To create a tree you wanna to create Nodes class and add key value
    int key;
    String name;
    //The right and left child are containing null values because is not important have to exist
    //we just cant have more than one left child and one right child
    Node leftChild;
    Node rightChild;

    //create a constructor with this parameter as you see
    Node(int key, String name) {
        //Assign the constructor values
        this.key = key;
        this.name = name;
    }

    public String toString() {
        //This method is to print the information in the screen if you want
        return name + "has a key" + key;
    }

}