import java.util.Scanner;

public class Ex08 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Observe as opções e depois escolha:");
        IO.println("1- Consultar Saldo");
        IO.println("2- Sacar Dinheiro");
        IO.println("3- Depositar Dinheiro");
        IO.println("4- Sair");
        IO.println("Qual a opção escolhida");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                IO.println("Você escolheu CONSULTAR SALDO");
                break;
            case 2:
                IO.println("Você escolheu SACAR O DINHEIRO");
                break;
            case 3:
                IO.println("Você escolheu DEPOSITAR DINHEIRO");
                break;
            case 4:
                IO.println("Você escolheu SAIR");
                break;
            default:
                IO.println("Opção Inválida");
        }
    }
}
