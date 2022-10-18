/*
 * Nama : Maulana Hafizul Haq
 * NIM  : 21343054
 * Prodi: Teknik Informatika
 */
package Tugas;

public class NestedLoop {
   public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) 
        {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
            }
            System.out.println();
        }
   } 
}