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
public class stack1
{
private int maxSize;        // deklarasi variabel ukuran stack
private long[] stackArray;
private int top;            // deklarasi variabel untuk menyimpan nilai atas(top)stack
//-------------------------------------------------------------
stack1(int s)         // konstraktor
{
maxSize = s;             // set ukuran statck
stackArray = new long[maxSize];  // buat wadah untuk stack
top = -1;                // mengkosongkan item
}
//-------------------------------------------------------------
void push(long j)    // method untuk memasukkan nilai ke dalam stack( PUSH)
{
stackArray[++top] = j;     // menambahkan nilai ke tumpukan stack
}

public long pop()           // method mengambil nilai dari atas tumpukan stack
{
return stackArray[top--];  // 
}
//-------------------------------------------------------------
long peek()          // method unutk meletakkan nilai kedalam stack
{
return stackArray[top]; 
}
//-------------------------------------------------------------
boolean isEmpty()    // method untuk mengecek apakah stack kosong
{
return (top == -1);
}
//-------------------------------------------------------------
boolean isFull()     //  method untuk mengecek jika stack penuh
{
return (top == maxSize-1);
}
//-------------------------------------------------------------

    public static void main(String[] args) {
        stack1 Stack= new stack1(4);  // membuat statck baru dengan mengisi parameter constraktor dengan nilai
        Stack.push(10);               // push nilai kedalam statck
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
       
        
        
        while( !Stack.isEmpty() )     
        {                             
        long isiStatck = Stack.pop();
        
        if(!Stack.isFull()){
        System.out.print(isiStatck);      
        System.out.print(",");}else{
            System.out.println("Penuuh");
        }
        }
        // end while
        System.out.println("");

            }
}


