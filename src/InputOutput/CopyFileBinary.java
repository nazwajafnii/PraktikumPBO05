/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutput;

/**
 *
 * @author Nazwajafni
 */
import java.io.*;

public class CopyFileBinary {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("gambar.png");
            FileOutputStream out = new FileOutputStream("salinan_gambar.png");

            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }

            in.close();
            out.close();

            System.out.println("File berhasil disalin!");
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}

