/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author AFRIZAL
 */
public class linkMethod {
    private list first;
    public linkMethod(){
        first=null;
        
        
    }
    
    public boolean isEmpty(){
        return (first  == null);
    }
    
    public void insertFirst(int data){
       list newLink=new list(data);
       newLink.next = first;
       first=newLink;
    }
    
    public list deleteFirst(){
        list temp = first;
        first = first.next;
        return temp;
    }
    
    public list find(int key){
        list current =first;
        while(current.data!=key){
            if(current.next==null){
                return null;
            }else{
                current = current.next;
        }
    }
    return current;
    
    
    }
    
    public list delete(int key){
        list current =first;
        list previous =first;
        while (current.data!=key){
            if(current.next ==null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        
        if(current == first ){
            first = first.next;
            
        }else{
            previous.next = current.next;
        }
        return current;
    }
    
    public void displayList(){
        System.out.println("List(first -->last : ");
        
        list current =first;
        while (current!=null){
            current.displayLink();
            current =current.next;
    }
        System.out.println("");
    
}}
