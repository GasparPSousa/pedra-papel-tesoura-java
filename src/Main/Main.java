package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome1 = entrada.nextLine();
        System.out.println("Digite uma das 3 opções: pedra / papel / tesoura");
        String opcao1 = entrada.nextLine();

        System.out.println("Digite seu nome: ");
        String nome2 = entrada.nextLine();
        System.out.println("Digite uma das 3 opções: pedra / papel / tesoura");
        String opcao2 = entrada.nextLine();

        int contador1 = 0;
        int contador2 = 0;

        while(!opcao1.equals("*")) {

            if(nome1.equals(wichWin(opcao1, opcao2, nome1, nome2))) {
                contador1++;
                System.out.println("\n" + nome1 + " ganhou!!");

            } else if(nome2.equals(wichWin(opcao1, opcao2, nome1, nome2))) {
                contador2++;
                System.out.println("\n" + nome2 + " ganhou!!");

            } else {
                System.out.println("\nEmpatou!!");
            }

            System.out.println("\nPlacar: " + nome1 + " " + contador1+ " x " + contador2 + " " + nome2);


            System.out.println("\n" + nome1 + " escolha novamente: pedra / papel / tesoura");
            opcao1 = entrada.nextLine();

            if(opcao1.equals("*")) {
                System.out.println("Jogo Finalizado!");
            } else {
                System.out.println("\n" + nome2 + " escolha novamente: pedra / papel / tesoura");
                opcao2 = entrada.nextLine();

            }
        }
    }


    public static String wichWin(String opcao1, String opcao2, String nome1, String nome2) {

        String ganhador = "";

        if(opcao1.equalsIgnoreCase("pedra")  && opcao2.equalsIgnoreCase("tesoura")) {
            ganhador = nome1;

        } else if(opcao1.equalsIgnoreCase("pedra") && opcao2.equalsIgnoreCase("papel")) {
            ganhador = nome2;

        } else if(opcao1.equalsIgnoreCase("papel") && opcao2.equalsIgnoreCase("pedra")) {
            ganhador = nome1;

        } else if(opcao1.equalsIgnoreCase("papel")  && opcao2.equalsIgnoreCase("tesoura")) {
            ganhador = nome2;

        } else if(opcao1.equalsIgnoreCase("tesoura") && opcao2.equalsIgnoreCase("papel")) {
            ganhador = nome1;

        } else if(opcao1.equalsIgnoreCase("tesoura")  && opcao2.equalsIgnoreCase("pedra")) {
            ganhador = nome2;

        } else {
            ganhador = "empate";
        }

        return ganhador;

    }

}
