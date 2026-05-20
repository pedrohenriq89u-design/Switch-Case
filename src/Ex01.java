import java.util.Scanner;

public class Ex01 {
    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Escolha o dia:");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                IO.println("Hoje é Domingo");
                break;
            case 2:
                IO.println("Hoje é Segunda");
                break;
            case 3:
                IO.println("Hoje é Terça");
                break;
            case 4:
                IO.println("Hoje é Quarta");
                break;
            case 5:
                IO.println("Hoje é Quinta");
                break;
            case 6:
                IO.println("Hoje é Sexta");
                break;
            case 7:
                IO.println("Hoje é Sabado");
                break;
            default:
                IO.println("Digite um dia existente");
        }

    }

}
