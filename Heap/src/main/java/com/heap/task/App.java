package com.heap.task;
//implementation of the Heaps

import java.util.Arrays;

public class App {
    //This sample of the heap with a fixed length array
    //  if the heap is so big you can increase the capacity
    //Declare the capacity and the size of the  heap
    private int capacity = 10;
    private int size = 0;
    //create a new array that stores the capacity
    int[] items = new int[capacity];

    //create a separate method that get child and parent index
    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    //create separate methods that check if has a child or parent is founded
    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParentIndex(int index) {
        return getParentIndex(index) <= 0;
    }

    //create separate methods that declare the child and parent
    private int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int ParentIndex(int index) {
        return items[getParentIndex(index)];
    }

    //First create swap method that is swaps two indexes
    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    //Then create method that check if the array is full
    // and create array of the double size
    // and its copies all the element

    private void checkFullArray() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        //This method check if the array is empty if it is empty then its return an error
        // if the array is non empty its return the first element in the array
        if (size == 0) ;
        System.out.println("The array is empty");
        //otherwise return the first element that is the minimum element and its the root of the heap
        return items[0];
    }

    public int poll() {
        //This method extract the minimum element and remove it from the array
        //So you check the array if empty and if its empty return an error
        if (size == 0) ;
        System.out.println("The array is empty");
        //otherwise to get the value and get the value write this line of the code
        int item = items[0];
        //Take take the last element and move it to the first element
        items[0] = items[size - 1];
        //Then you can shrink the essential size of the array
        size--;
        //Then you can make re-heap
        //So you need to remove the root element by make a heap down

        // //heapDown();// //
        return item;
    }

    public void add(int item) {
        //ensure the array has a good capacity
        checkFullArray();
        // Then add element to the last spot
        items[size] = item;
        //Then increase the size
        size++;
        //Then fix the heap to the up
        //Swap each element with his parent
        heapUp();

    }

    public void heapUp() {
        //Start with the very last element add
        int index = size - 1;
        while (hasParentIndex(index) && ParentIndex(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapDown() {
        //first start with the root element in an index zero
        int index = 0;
        //See if i have a children keep go down and try to fix up the heap
        while (hasLeftChild(index)) {
            //then check if i have left child
            // if no left child there is certainly to right child

            //set the smaller child index equal to the smaller left and right child
            int smallerChildIndex = getLeftChildIndex(index);

            //if there is have a right child
            //and the right child is smaller than left child
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {

                // small child index equal to the right child
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[index] < items[smallerChildIndex]) {
                break;
            } else {
                //swap the value with the smaller child

                swap(index, smallerChildIndex);
            }
            //move down to the smaller child
            index = smallerChildIndex;
        }
    }

}