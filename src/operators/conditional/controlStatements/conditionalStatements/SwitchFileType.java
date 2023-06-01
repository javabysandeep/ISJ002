package operators.conditional.controlStatements.conditionalStatements;

import java.util.Scanner;

public class SwitchFileType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        switch (fileName) {
            case "txt":
                System.out.println("code to read txt files");
                break;
            case "doc":
                System.out.println("code to read doc files");
                break;
            case "excel":
                System.out.println("code to read excel files");
                break;
            case "json":
                System.out.println("code to read json files");
                break;
            case "pdf":
                System.out.println("code to read pdf files");
                break;
            default:
                System.out.println("invalid file type");
                break;
        }


    }
}
