package controller;

import java.util.Scanner;

import model.Aluno;

public class cadastro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("=====menu=====");
            System.err.println("1 - cadastrar novo aluno");
            System.out.println("2 - listar alunos cadastrados");
            System.out.println("3 - buscar aluno pelo nome");
            System.out.println("4 - excluir aluno");
            System.out.println("0 - sair");

            System.err.println("\nEscolha uma opção");

            int opcao = entrada.nextInt();
            entrada.nextLine(); 

            if (opcao != 0) {
                switch (opcao) {
                    case 1:
                        
                        break;
                    case 2:

                        break;
                    case 3:
                        
                        break;
                    case 4:

                        break;
                    default:
                        break;
                }
            }else {
                continuar = false;
            }
        }

        System.out.println("você saiu do programa");

        entrada.close();
    }
}
