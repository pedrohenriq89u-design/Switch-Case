import java.util.Scanner;

public class Ex07 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite uma letra:");
        String vogal = sc.next();

        switch (vogal) {
            case "A":
                IO.println("É uma vogal");
                break;
            case "E":
                IO.println("É uma vogal");
                break;
            case "I":
                IO.println("É uma vogal");
                break;
            case "O":
                IO.println("É uma vogal");
                break;
            case "U":
                IO.println("É uma vogal");
                break;
            default:
                IO.println("Não é uma vogal");
        }
    }
}