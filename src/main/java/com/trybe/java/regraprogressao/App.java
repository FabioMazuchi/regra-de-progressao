package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    input = scn.nextLine();
    int qtdAtividades = Integer.parseInt(input);

    for (int i = 1; i <= qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scn.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      input = scn.nextLine();
      int peso = Integer.parseInt(input);
    }

    scn.close();
  }
}