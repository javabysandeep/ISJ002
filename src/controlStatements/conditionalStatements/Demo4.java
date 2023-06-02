package controlStatements.conditionalStatements;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        if (fileName.equals("txt")) {
            System.out.println("code to read txt files");
        }
        if (fileName.equals("doc")) {
            System.out.println("code to read doc files");
        }
        if (fileName.equals("excel")) {
            System.out.println("code to read excel files");
        }
        if (fileName.equals("json")) {
            System.out.println("code to read json files");
        }
        if (fileName.equals("pdf")) {
            System.out.println("code to read pdf files");
        }
    }
}
