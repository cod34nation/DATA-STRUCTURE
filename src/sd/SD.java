/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

/**
 *
 * @author AFRIZAL
 */
import java.io.*;
import java.util.Scanner;

public class SD {

    public static void main(String[] args) {
        int i, j;
        boolean tian;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Banyaknya Batas Bilangan Prima = ");
        int batas = input.nextInt();
        int hasil = 0;

        for (i = 1; i <= batas; i++) {
            {
                tian = false;
                if (i == 2) {
                    tian = true;
                } else {
                    for (j = 2; j < i; j++) {
                        if (i % j == 0) {
                            tian = false;
                            break;
                        } else {
                            tian = true;
                        }
                    }
                }

                if (tian) {
                    System.out.printf(i + ",");
                }
            }
        }
    }
}
