import java.util.Scanner;

public class Ex09 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite a letra:");
        String letra = sc.next();

        switch (letra){
            case "A":
                IO.println("Excelente! Continue Assim");
                break;
            case "B":
                IO.println("Bom! Parabéns");
                break;
            case "C":
                IO.println("Regular! Foi bem mas pode melhorar");
                break;
            case "D":
                IO.println("Ruim! Melhore urgentemente");
                break;
            default:
                IO.println("Conceito não encontrado! Tente Novamente");
        }
    }
}
