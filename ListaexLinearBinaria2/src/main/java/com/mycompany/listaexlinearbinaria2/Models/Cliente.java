/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexlinearbinaria2.Models;

/**
 *
 * @author guilh
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String cpf;

    public Cliente(int codigo, String nome, String dataNascimento, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

 
    public int compareTo(Cliente outroCliente) {
        return Integer.compare(this.codigo, outroCliente.codigo);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", CPF: " + cpf;
    }
}
