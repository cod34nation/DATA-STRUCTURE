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
public class Node {
    String nama;
    Node next;
    
   
    
    public static void main(String[] args) {
    Node current=null;    
    Node first =new Node();
    Node second =new Node();
    Node thrid = new Node();
    
    first.nama="Afrizal";
    first.next=second;
    second.nama="Satryo";
    second.next=thrid;
    thrid.next=null;
    current=first;
    while(current!=null){
        System.out.println(current.nama);
        current=current.next;
    }
    }
}
