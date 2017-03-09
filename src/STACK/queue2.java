/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package STACK;

/**
 *
 * @author AFRIZAL
 */
public class queue2 {
 
 // Variabel Internal
 private int head = 0;
 private int tail = 0;
 private String[] isi = new String [4];
 
 // Kontruktor
 public queue2() {}

 public String GetIsiByIndex(int index)
 {
  return isi[index];
 }
 
 // Enqueue
 public void Enqueue(String x)
 {
  if(tail < 4) {
   isi[tail] = x;
   tail++;
  } else {
   System.out.println("Antrian masih Penuh, harap tunggu..");
  }
 }
 
 // Dequeue
 public String Dequeue()
 {
  if(tail != head) {
   String temp = isi[head];
   for(int a = head; a < tail; a++) {
    if(a == tail-1) {
     isi[a] = "Kosong";
    } else {
     isi[a] = isi[a+1];
    }
   }
   tail--;
   return temp;
  } else {
   System.out.println("antrian kosong");
   
   return "0 Person";
   
  }
 }
 
 // Print
 public void Print()
 {
  String teks = "";
  for(int a=0; a<4; a++) {
   teks += isi[a]+",";
  }
  System.out.println(teks);
 }
 
 public static void main(String[] args) {
  
  // Buat queue
  queue2 q1 = new queue2();
  
  // Enqueue
  q1.Enqueue("Andi");
  q1.Enqueue("Ahmad");
  q1.Enqueue("Satrio");
  q1.Enqueue("Afrizal");
  q1.Enqueue("sukran");
  q1.Enqueue("Mahmud");
  q1.Print();
  
  System.out.println(q1.Dequeue()+" Keluar antrian ");
  q1.Print();
  System.out.println();
  System.out.println(q1.Dequeue()+" Keluar antrian");
  q1.Print();
   System.out.println();
  System.out.println(q1.Dequeue()+" Keluar antrian");
  q1.Print();
   System.out.println();
  System.out.println(q1.Dequeue()+" Keluar antrian");
  q1.Print();
   System.out.println();
  System.out.println(q1.Dequeue());
  q1.Print();
 }
 
}
