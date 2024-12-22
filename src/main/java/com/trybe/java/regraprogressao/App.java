package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Método main.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    input = scn.nextLine();
    int qtdAtividades = Integer.parseInt(input);
    int[] pesos = new int[qtdAtividades];

    for (int i = 1; i <= qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scn.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      input = scn.nextLine();
      int peso = Integer.parseInt(input);
      System.out.println("Digite a nota obtida para " + nome + ":");
      input = scn.nextLine();
      int nota = Integer.parseInt(input);
      pesos[i - 1] = nota;
    }

    int total = 0;
    for (int peso : pesos) {
      total += peso;
    }

    if (total != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    scn.close();
  }
}