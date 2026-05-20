import java.util.Scanner;

public class Ex03 {
    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Digite um código:");
        int produto = sc.nextInt();

        switch (produto){
            case 1:
                IO.println("X-Burguer R$ 15,00");
                break;
            case 2:
                IO.println("X-Salada R$ 18,00");
                break;
            case 3:
                IO.println("Refrigerante R$ 7,00");
                break;
            case 4 :
                IO.println("Batata Frita R$ 12,00");
                break;
            default:
                IO.println("Código inválido! Produto não encontrado");
        }
    }
}
