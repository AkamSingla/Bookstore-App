/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab3;
import java.util.ArrayList;

/**
 *
 * @author ECBME
 */
public class QueueOfDistinctStrings {
      
// Overview: QueueOfDistinctstrings are mutlabe. bounded
// collection of disinct strings that operate in
// FIFO (First In First Out)order.

// The abstration fucntion is:
//  AF(c) = an abstract queue d 
    //          
    //      where d.front = c.get(0) which is the very first element in the array/queue
    //            d.end = c.get(n-1) which is the very last element in the queue
    //      here n is the number of strings storedin the queue 
    //      and c is a QueueOfDistinctObjects Java Object
    //              the collecection of queue can be expressed as
    //              {element 0, element 1 ......, element n}
    //                  ^                               ^
    //                front     middle elements        end

//The rep invariant is:
//RI(c) = true if (c.size() != 0)&&
    //     for all integers i,j
    //      (0 <= i< j < c.size =>
    //      c[i] != c[j]   ) //this would test all the values in the array to be equal or not to any other value
//        false otherwise

// the rep
private ArrayList<String> items;

//constructor
public QueueOfDistinctStrings() {
    //Effects: Creates a new QueueOfDistinctStrings object
  items = new ArrayList<String>();
} 
 
//MODIFIES: this
//EFFECTS: Appends the element at the end of the queue
//          if the element is not in the queue, otherwise
//          does nothing.

public void enqueue(String element) throws Exception{
    if(element == null) throw new Exception();
    if(false == items.contains(element)) items.add(element);
}

public String dequeue() throws Exception{
    //MODIFIES: this
    //EFFECTS: Removes an element from the front of the queue
    if (items.size() == 0) throw new Exception(); 
    return items.remove(0);
}

public boolean repOK(){
    //Effects: Returns true if the rep invariant holds for this
    //          object; otherwise returns false
    if(items.size() == 0) {
    return false;
    }
    else{
    for(int i = 0;i<items.size();i++){
        for(int j = 0; j < items.size() ; j++){
          if (items.get(i) == items.get(j)) return false;
          else return true;
        }
    }   
   }
  return false;  
}

public String tostring(){
// EFFECTS: Returns a strin that contains the zdtrings in the 
//          queue, the front element and the end element.
//          implements the abstraction function.
String intro, array = null;
    intro = "This ques has " + items.size() + " items which are {";
    for(int i = 0; i < items.size() ; i++) 
    {array = " " + array + items.get(i) + ",";}

    return intro + array + "}/n" + "Front: " + items.get(0)+ " /nEnd: " + items.get(items.size());
}

}
