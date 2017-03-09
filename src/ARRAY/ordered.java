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
public class ordered {
    public static void main(String[] args) {
        int value =60;
        int posisi=3;
        int nElement=5;
        int arr[]=new int [6];
        
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        arr[4]=70;
        
        
        for(posisi=0;posisi<nElement;posisi++){
            if(arr[posisi]>value){
                break;
            }
                
        }
        for(int j= nElement;j>posisi;j--){
            arr[j]=arr[j-1];
            
        }
        
        arr[posisi]=value;
        nElement++;
        
    }
    
}
