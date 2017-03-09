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
public class HightArray {

    private int[] arr;
    private int nElement;

    public HightArray(int max) {
        arr = new int[max];
        nElement = 0;
    }

    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElement; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == nElement) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElement; i++) {
            if (value == arr[i]) {
                //System.out.println(value +" Sudah dihapus ");
                break;
            }
        }
        if (i == nElement) {
            return false;
        } else {
            for (int j = i; j < nElement; j++) {
                arr[j] = arr[j + 1];
            }
            nElement--;
            return true;
        }
    }

    public void display() {
        System.out.println("elemet" + nElement);
        for (int i = 0; i < nElement; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
