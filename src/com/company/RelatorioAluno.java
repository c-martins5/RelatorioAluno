package com.company;

import java.util.Scanner;

public class RelatorioAluno {

    public static void main(String[] args) {
        String nomeDoAluno;
        String nomeDoCurso;
        Integer numeroDoPeriodo;
        Double primeiraNota;
        Double segundaNota;
        Integer qntFalta;
        Double media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nomeDoAluno = entrada.next();

        System.out.println("Digite o nome do curso: ");
        nomeDoCurso = entrada.next();

        System.out.println("Digite o período do curso: ");
        numeroDoPeriodo = entrada.nextInt();

        System.out.println("Digite a primeira nota: ");
        primeiraNota = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = entrada.nextDouble();

        System.out.println("Digite a quantidade de faltas: ");
        qntFalta = entrada.nextInt();

        media = (primeiraNota + segundaNota) / 2;

        System.out.println("");
        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + nomeDoAluno);
        System.out.println("Curso: " + nomeDoCurso);
        System.out.println("Período: " + numeroDoPeriodo);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Faltas: " + qntFalta);
        System.out.println("Média do aluno: " + media);
    }
}