package com.passVR.task;

public class App {

    //create a method of the pass by value
    //void method cant return any thing
    // i pass the value to the parameter in this method

    public static void passBYVal(int num) {
        //Make an print line statement that show the number inside the passBYVal method number
        System.out.println("inside the passBYVal method the number is " + num);
        //Make sure the number in the main method is copied in the num variable of the passBYVal method
        // The value 'number 'copied to the passBYVal method parameter
    }

    public static void passBYRef(int []value){
        //Make an print line statement that show the number inside the passBYRef method number
        // This when you pass non java primitive type to  the method like an array or an object
        System.out.println("inside the passBYRef method the number is " + value[0]);
        //Value and val arrays in this method and in the main method is pointing to the same memory location
        //if you need to change the first element value
        value[0] = 200;
        System.out.println("inside the passBYRef method the number is " + value[0]);

    }

    public static void main(String args[]) {
        //create an integer number that display number before calling the passBYVal method
        int number = 100;
        //Display line that this number before calling the passBYVal method
        System.out.println("The Number Before calling the passBYVal method is  " + number);
        passBYVal(number);
        System.out.println("The Number After calling the passBYVal method is  " + number);
/*///////////////////////////////////////////////////////////////////////////////////////////////////*/
        int val[] = {50 , 60};
        //Before show the passBYRef method
        System.out.println("the first value element in the array is "+val[0]);
        // calling the passBYRef method
        passBYRef(val);
        //After show the passBYRef method
        System.out.println("the first value element in the array is "+val[0]);
        //if you make any change of the value of the array the change of the value will be reflect
    }

}