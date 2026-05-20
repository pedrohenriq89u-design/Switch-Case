import java.util.Scanner;

public class Ex02 {
    void main(){


    Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero");
        double conta = sc.nextDouble();
        IO.println("Digite outro numero");
        double cont = sc.nextDouble();
        IO.println("Escolha a operação:");
        String op = sc.next();

        switch (op){
            case "*":
                IO.println(conta * cont);
                break;
            case "+":
                IO.println(conta + cont);
                break;
            case "/":
                IO.println(conta / cont);
                break;
            case "-":
                IO.println(conta - cont);
                break;
            default:
                IO.println("Conta não realizada! Tente novamente");
        }



}
}