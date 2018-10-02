/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freight;
 import java.util.*;
/**
 *
 * @author Eamon
 */
public class MyStack implements StackInterface {
 private ArrayList <FreightType> theStack;  

public MyStack(){
    theStack = new ArrayList <FreightType> ();
}

public boolean isEmpty(){
    return theStack.isEmpty();
}

public boolean isFull(){
    return false;
}

public void push(Object newItem){
    theStack.add((FreightType) newItem);
}
 
public Object pop(){
    if(!theStack.isEmpty()){
    return theStack.remove(0);
    }
    else{
        return null;
    }
}
public int size(){
    return theStack.size();
}

}
