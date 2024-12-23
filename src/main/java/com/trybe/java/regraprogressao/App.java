package com.trybe.java.regraprogressao;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

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
    String nome;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    input = scn.nextLine();

    int qtdAtividades = Integer.parseInt(input);
    int[] pesos = new int[qtdAtividades];
    int[] notas = new int[qtdAtividades];

    for (int i = 1; i <= qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      nome = scn.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      input = scn.nextLine();
      int peso = Integer.parseInt(input);
      pesos[i - 1] = peso;

      System.out.println("Digite a nota obtida para " + nome + ":");
      input = scn.nextLine();
      int nota = Integer.parseInt(input);
      notas[i - 1] = nota;
    }

    int total = 0;
    for (int peso : pesos) {
      total += peso;
    }

    if (total != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      double divisor = 0;
      double dividendo = 0;
      for (int i = 0; i < pesos.length; i++) {
        divisor += (pesos[i] * notas[i]);
        dividendo += pesos[i];
      }
      double resultado = divisor / dividendo;
      String pref = "Lamentamos informar que, com base na sua pontuação alcançada neste período, ";
      String suf = "%, você não atingiu a pontuação mínima necessária para sua aprovação.";
      String msg = "%! E temos o prazer de informar que você obteve aprovação!";
      if (resultado < 85.0) {
        System.out.println(pref + resultado + suf);
      } else {
        System.out.println("Parabéns! Você alcançou " + resultado + msg);
      }
    }
    scn.close();
  }
}