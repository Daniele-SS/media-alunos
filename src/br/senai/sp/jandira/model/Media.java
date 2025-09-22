package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Media {
    String nomeAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double somaDasNotas;
    double mediaFinal;
    double somaDasNotas2;

    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("CALCULADORA DA MÉDIA FINAL DOS ALUNOS");
        System.out.println("-------------------------------------");

        //Obtendo o nome do Aluno
        System.out.print("Digite seu Nome: ");
        nomeAluno = leitor.nextLine();

        //Obtendo as notas dos Alunos
        System.out.print("Digite sua 1ª nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite sua 2ª nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Digite sua 3ª nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Digite sua 4ª nota: ");
        nota4 = leitor.nextDouble();

        System.out.println("-------------------------------------");

        calcularNota();
    }

    public void calcularNota() {
        //Somando as 4 notas
        mediaFinal = somaDasNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        exibirResultado();

        //Calculando a média das notas
        if (somaDasNotas >= 5) {
            System.out.println("VOCÊ FOI APROVADO(A) " + nomeAluno + ", PARABÉNS!");

        } else if (somaDasNotas < 4) {
            System.out.println("VOCÊ FOI REPROVADO(A) " +nomeAluno+ ", MELHORE!");

        } else {
            System.out.println("VOCÊ ESTÁ DE RECUPERAÇÃO " +nomeAluno+ " !");
        }

    }
    public void exibirResultado(){
        System.out.println("MÉDIA DO(A) ALUNO(A): " + mediaFinal);
    }

}