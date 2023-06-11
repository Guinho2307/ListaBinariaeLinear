/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexlinearbinaria1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class ListaExLinearBinaria1 {

    public static void main(String[] args) {
       int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números a cadastrar:"));

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (i + 1) + ":"));
        }

        Arrays.sort(numeros);

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("----- Menu -----\n" +
                "1 - Pesquisa linear\n" +
                "2 - Pesquisa binária\n\n" +
                "Escolha uma opção:"));

        int numeroPesquisar = Integer.parseInt(JOptionPane.showInputDialog("Informe o número a ser pesquisado:"));

        int indiceEncontrado = -1;

        if (opcao == 1) {
            indiceEncontrado = pesquisaLinear(numeros, numeroPesquisar);
        } else if (opcao == 2) {
            indiceEncontrado = pesquisaBinaria(numeros, numeroPesquisar);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida. Encerrando o programa.");
            System.exit(0);
        }

        if (indiceEncontrado != -1) {
            JOptionPane.showMessageDialog(null, "O número " + numeroPesquisar + " foi encontrado no índice " + indiceEncontrado + ".");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numeroPesquisar + " não foi encontrado.");
        }
    }

    public static int pesquisaLinear(int[] numeros, int numeroPesquisar) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroPesquisar) {
                return i;
            }
        }
        return -1;
    }

    public static int pesquisaBinaria(int[] numeros, int numeroPesquisar) {
        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (numeros[meio] == numeroPesquisar) {
                return meio;
            } else if (numeros[meio] < numeroPesquisar) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}

