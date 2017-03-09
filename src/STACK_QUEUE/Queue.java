/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK_QUEUE;

/**
 *
 * @author AFRIZAL
 */
////////////////////////////////////////////////////////////////
public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
//-------------------------------------------------------------

    Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//-------------------------------------------------------------

    void insert(long j) {
        if (rear == maxSize - 1) 
        {
            rear = -1;
        }
        queArray[++rear] = j;         
        nItems++;                     
    }
//-------------------------------------------------------------

    long remove() 
    {
        long temp = queArray[front++]; 
        if (front == maxSize) 
        {
            front = 0;
        }
        nItems--;                      
        return temp;
    }

    public long peekFront() 
    {
        return queArray[front];

    }

//-------------------------------------------------------------
    boolean isEmpty() 
    {
        return (nItems == 0);
    }
//-------------------------------------------------------------

    boolean isFull() 
    {
        return (nItems == maxSize);
    }
//-------------------------------------------------------------

    int size()
    {
        return nItems;
    }
//-------------------------------------------------------------

    public static void main(String[] args) {
        Queue theQueue = new Queue(5);  
        theQueue.insert(10);            
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.remove();              
        theQueue.remove();            
        theQueue.remove();
        theQueue.insert(50);            
        theQueue.insert(60);            
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty())
        {                            
            long n = theQueue.remove();  
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");

    }
}

//-------------------------------------------------------------
