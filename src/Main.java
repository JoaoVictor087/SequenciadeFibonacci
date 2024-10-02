import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("SEQUENCIA DE FIBONACCI");
        System.out.println("Verifique se um número se encontra na sequencia de fibonacci");
        int verificador = scanner.nextInt();

        //sequencia de fibonacci
        lista.add(0);
        lista.add(1);
        do{
            lista.get(lista.size()-2);
            lista.add(lista.get(lista.size()-1) + lista.get(lista.size()-2));

        }while(lista.getLast() <= 1000000000 ); //numero limitador

        //verificador de números presentes na sequencia de fibonacci
        boolean neymar2011 = lista.contains(verificador);
        if (neymar2011 == true){
            System.out.println("este número se encontra na sequencia de Fibonacci");
        }else{
            System.out.println("este número não se encontra na sequencia de Fibonacci");
        }

        //sequencia de fibonacci por extenso
        System.out.println("Gostaria de ver a sequência de Fibonacci completa ?");
        System.out.println("1 - SIM 2 - NÃO");
        int opcao;
        do {
            opcao = scanner.nextInt();
            if (opcao == 1) {
                for (Integer i : lista) {
                    System.out.print(i + ", ");
                }
            } else if (opcao == 2) {
                System.out.println("Finalizando programa");
            }else{
                System.out.println("Opção Inválida");
                System.out.println("Digite novamente");
            }
        }while(opcao > 2 || opcao < 0);
    }
}