/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutput;

/**
 *
 * @author Nazwajafni
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Masukkan kalimat: ");
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                System.out.println("Jumlah kata: 0");
                return;
            }
            String[] words = line.trim().split("\\s+");
            System.out.println("Jumlah kata: " + words.length);
        } catch (IOException e) {
            System.err.println("Input tidak valid: " + e.getMessage());
        }
    }
}

