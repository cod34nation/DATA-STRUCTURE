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
public class linkedListAPP {
    public static void main(String[] args) {
        linkMethod theList = new linkMethod();
        
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.insertFirst(99);
        theList.displayList(); 
        while(!theList.isEmpty()){
            list aLink = theList.deleteFirst();
            System.out.println("Deleted");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
        
        theList.insertFirst(33);
        theList.insertFirst(55);
        theList.insertFirst(77);
        theList.insertFirst(88);
        theList.displayList();
        
        list f= theList.find(77);
        if(f != null){
            System.out.println("Ketemu "+f.data);
        }else{
            System.out.println("Link tidak ketemu ");
        }
        
        list d = theList.delete(88);
        if(d!=null){
            System.out.println("Hapus link dengan key "+d.data);
        }else{
            System.out.println("link tidak ketemu ");
        }
        theList.displayList();
        
    }
}
