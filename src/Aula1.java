public class Aula1 {
    void main(){
        int dia =12;

        switch (dia){
            case 1:
                IO.println("Hoje é domingo");
                break;
            case 2:
                IO.println("Hoje é Segunda");
                break;
            case 3:
                IO.println("Hoje é Terça");
                break;
            default:
                IO.println("Digite um dia existente");
        }
    }
}
