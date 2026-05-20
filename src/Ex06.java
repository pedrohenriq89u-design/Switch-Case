import java.util.Scanner;

public class Ex06 {
    void main(){

        Scanner sc = new  Scanner(System.in);

        IO.println("Observe as opções de curso:");
        IO.println("1- Java");
        IO.println("2- Banco de Dados");
        IO.println("3- Desenvolvimento Web");
        IO.println("4- Redes");
        IO.println("Escolha seu curso dentre as opções acima:");
        int curso = sc.nextInt();

        switch (curso){
            case 1:
                IO.println("Você aprenderá sobre Java com o app Intellij com a professora Fiama");
                break;
            case 2:
                IO.println("Aprenderá sobre banco de dados ");
                break;
            case 3:
                IO.println("Aprenderá sobre o desenvolvimento Web");
                break;
            case 4:
                IO.println("Recomento muito essa aréa a melhor escolha possível irá aprender sobre redes, endereço IP, Wire Shark e terá aula com o melhor Prof Fabbri");
                break;
            default:
                IO.println("Curso não encontrado! Tente Novamente");
        }

    }
}
