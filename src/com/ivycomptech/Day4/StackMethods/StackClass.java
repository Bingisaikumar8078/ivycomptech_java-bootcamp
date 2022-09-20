package com.ivycomptech.Day4.StackMethods;

import java.util.Stack;

public class StackClass {
public  void stack(){
    Stack<String>  myStack = new Stack<>();
    myStack.push("sai");
    myStack.push("kumar");
    myStack.push("akkkk");
    myStack.push("psushh");
    System.out.println(myStack);
//    myStack.pop();
//    System.out.println(myStack);
    for(String s: myStack)
        System.out.println(s);

    System.out.println(myStack.peek());
    System.out.println(myStack.search("sai"));
    System.out.println(myStack.capacity());
    System.out.println(myStack.clone());
}

}
