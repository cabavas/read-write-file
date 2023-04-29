package org.example;

import java.io.*;
import java.util.Scanner;

public class EscritaArquivo {
    static int opcao;
    static Scanner texto = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        File file = new File("C:/Workspace/data-from-file/src/main/resources/file.txt");
        do {
            System.out.println("1 - Imprimir na tela");
            System.out.println("2 - Escrever no arquivo");
            System.out.println("3 - Sair");
            opcao = option.nextInt();
            if (opcao == 1) {
                try {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                    scanner.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    PrintWriter writter = new PrintWriter(file);
                    System.out.println("Digite a primeira linha: ");
                    writter.println(texto.nextLine());
                    System.out.println("Digite a segunda linha: ");
                    writter.println(texto.nextLine());
                    writter.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (opcao != 3);


    }
}
