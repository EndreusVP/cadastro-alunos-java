package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;

public class cadastro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //criando a lista dos alunos
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

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

            //testando se o usuario quer continuar
            if (opcao != 0) {
                switch (opcao) {
                    //add aluno
                    case 1:
                        System.out.println("digite o nome do aluno");
                        String nomeAluno = entrada.nextLine();
                        System.out.println("digite a idade do aluno");
                        int idadeAluno = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("digite o curso do aluno");
                        String cursoAluno = entrada.nextLine();

                        Aluno aluno = new Aluno(nomeAluno, idadeAluno, cursoAluno);
                        listaAlunos.add(aluno);

                        break;
                    //listar alunos cadastrados
                    case 2:
                        for(int i = 0; i < listaAlunos.size(); i++){
                            System.out.println(listaAlunos.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("digite o nome do aluno");
                        String resposta = entrada.nextLine();
                        
                        for (int i = 0; i < listaAlunos.size(); i++ ) {
                            //pegando os alunos 
                            Aluno alunoBusca = listaAlunos.get(i);
                            if (resposta.equals(alunoBusca.getNome())) {
                                System.out.println(alunoBusca);
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("digite o nome do aluno");
                        String respostaDelete = entrada.nextLine();

                        for(int i = 0; i < listaAlunos.size(); i++){
                            Aluno alunoDelete = listaAlunos.get(i);
                            if(respostaDelete.equals(alunoDelete.getNome())){
                                listaAlunos.remove(i);
                                System.out.println("aluno removido");
                            }
                        }
                        break;
                    default:
                        System.out.println("opção nao encontrada");
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
