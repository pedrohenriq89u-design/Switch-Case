import java.util.Scanner;

public class Ex05 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Qual seu tipo de usuario?");
        String tipo = sc.next();

        switch (tipo){
            case "A":
                IO.println("Você é um administardor acesso total liberado");
                break;
            case "F":
                IO.println("Você é funcionario acesso parcialmente liberado");
                break;
            case "C":
                IO.println("Você é um cliente acesso a página inicial liberado");
                break;
            default:
                IO.println("Código inválido não encontarmos seu tipo de usuário");

        }
    }
}
