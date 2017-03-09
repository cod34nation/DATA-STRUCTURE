/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author AFRIZAL
 */
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
public class stack2
{
private int maxSize;        // deklarasi variabel ukuran stack
private String[] stackArray;
private int top;            // deklarasi variabel untuk menyimpan nilai atas(top)stack
//-------------------------------------------------------------
stack2(int s)         // konstraktor
{
maxSize = s;             // set ukuran statck
stackArray = new String[maxSize];  // buat wadah untuk stack
top = -1;                // mengkosongkan item
}
//-------------------------------------------------------------
void push(String j)    // method untuk memasukkan nilai ke dalam stack( PUSH)
{
stackArray[++top] = j;     // menambahkan nilai ke tumpukan stack
}

public String pop()           // method mengambil nilai dari atas tumpukan stack
{
return stackArray[top--];  // 
}
//-------------------------------------------------------------
public String peek()          // method unutk meletakkan nilai kedalam stack
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
        stack2 Stack= new stack2(10);  // membuat statck baru dengan mengisi parameter constraktor dengan nilai
        
        
        Stack.push("K");               // push nilai kedalam statck
        Stack.push("A");
        Stack.push("S");
        Stack.push("U");
        Stack.push("R");
        
        while( !Stack.isEmpty() )     
        {
            
        String isiStatck = Stack.pop();
        
        System.out.print(isiStatck);      
        System.out.print(" ");
        }  // end while
        System.out.println("");

            }
}


