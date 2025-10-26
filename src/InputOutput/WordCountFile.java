/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutput;

/**
 *
 * @author Nazwajafni
 */
import java.nio.file.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordCountFile {
    public static void main(String[] args) {
        Path input = Paths.get("input.txt");
        Path output = Paths.get("count.txt");
        Map<String, Integer> freq = new HashMap<>();

        System.out.println("Working Directory: " + System.getProperty("user.dir")); 
        
        try (BufferedReader br = Files.newBufferedReader(input, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                // ubah huruf kecil dan hapus tanda baca sederhana
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
                String[] words = line.trim().split("\\s+");
                for (String w : words) {
                    if (!w.isEmpty()) {
                        freq.put(w, freq.getOrDefault(w, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
        }

        try (BufferedWriter bw = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {
            for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Gagal menulis file: " + e.getMessage());
        }

        System.out.println("Word count selesai. Hasil disimpan di count.txt");
    }
}
