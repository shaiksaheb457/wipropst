package com.wipro.threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX5 {
    public static void main(String[] args) {
    	
    	String sourcePath = "D:\\Image.png";
    	String destPath = "D:\\WIPROPST\\Image_copy.png";


        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            System.out.println("Error copying image: " + e.getMessage());
        }
    }
}
