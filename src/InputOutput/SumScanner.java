/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutput;

/**
 *
 * @author Nazwajafni
 */
import java.util.Scanner;

public class SumScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();          // baca int
        sc.nextLine();                 // <- buang newline tersisa (penting!)
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        System.out.println("Jumlah: " + (a + b));
        sc.close(); // ok menutup saat program selesai
    }
}
