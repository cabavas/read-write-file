package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Workspace/data-from-file/src/main/resources/file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ARQUIVO NÃO ENCONTRADO");
        }
    }
}