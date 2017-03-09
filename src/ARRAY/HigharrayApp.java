/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ARRAY;

/**
 *
 * @author AFRIZAL
 */
public class HigharrayApp {
    public static void main(String[] args) {
        int maxSize=100;
        HightArray arr;
        arr = new HightArray(maxSize);
        
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(25);
            
        
        
        arr.display();
        
        int key =2;
        if(arr.find(key)){
            System.out.println(key+ " Ditemukan");
        }else{
            System.out.println(key+" Tidak ditemukan");
        }
        arr.delete(30);
        
        arr.display();
    }
}
