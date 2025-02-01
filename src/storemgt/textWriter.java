/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemgt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class textWriter {
    public static void writeTotxt(String content, String fileName) {
        // Define the directory where the report will be saved
        String directoryPath = "C:/Users/asenl/Desktop/projects/javaprojects/reports";
        // Create the directory if it does not exist
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File reportFile = new File(directoryPath, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reportFile))) {
            writer.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(directoryPath, fileName);
        boolean result = file.setReadOnly();
        if (result) {
            System.out.println("File is now read-only.");
        } else {
            System.out.println("Failed to make the file read-only.");
        }
    }
}
