import java.util.Scanner;

public class Ex10 {
    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Observe as opções e depois escolha:");
        IO.println("1- Cadastrar Usuario");
        IO.println("2- Listar Usuarios");
        IO.println("3- Atualizar Usuario");
        IO.println("4- Excluir Usuario");
        IO.println("5- Encerrar o Sistema");
        IO.println("Qual a opção escolhida");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                IO.println("Sua escolha foi CADASTRAR USUARIO ");
                break;
            case 2:
                IO.println("Sua escolha foi LISTAR USUARIOS");
                break;
            case 3:
                IO.println("Sua escolha foi ATUALIZAR USUARIO");
                break;
            case 4:
                IO.println("Sua escolha foi EXCLUIR USUARIO");
                break;
            case 5:
                IO.println("Sua escolha foi ENCERRAR O SISTEMA");
                break;
            default:
                IO.println("Opcão inválida! Tente Novamente");
        }
    }
}
