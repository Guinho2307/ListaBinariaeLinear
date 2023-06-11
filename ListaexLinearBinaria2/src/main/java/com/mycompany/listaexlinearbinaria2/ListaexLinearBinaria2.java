/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexlinearbinaria2;

import com.mycompany.listaexlinearbinaria2.Models.Cliente;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class ListaexLinearBinaria2 {

    public static void main(String[] args) {
       int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de clientes a cadastrar:"));

        Cliente[] clientes = new Cliente[quantidade];

        for (int i = 0; i < quantidade; i++) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente " + (i + 1) + ":"));
            String nome = JOptionPane.showInputDialog("Informe o nome do cliente " + (i + 1) + ":");
            String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do cliente " + (i + 1) + ":");
            String cpf = JOptionPane.showInputDialog("Informe o CPF do cliente " + (i + 1) + ":");
            clientes[i] = new Cliente(codigo, nome, dataNascimento, cpf);
        }

        Arrays.sort(clientes);

        int codigoPesquisar = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente a ser pesquisado:"));

        int indiceEncontrado = pesquisaBinaria(clientes, codigoPesquisar);

        if (indiceEncontrado != -1) {
            Cliente clienteEncontrado = clientes[indiceEncontrado];
            JOptionPane.showMessageDialog(null, "Cliente encontrado:\n" + clienteEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    public static int pesquisaBinaria(Cliente[] clientes, int codigoPesquisar) {
        int inicio = 0;
        int fim = clientes.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (clientes[meio].getCodigo() == codigoPesquisar) {
                return meio;
            } else if (clientes[meio].getCodigo() < codigoPesquisar) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}

