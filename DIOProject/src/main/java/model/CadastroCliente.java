package model;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    
    private static List<CadastroCliente> clientesCadastrados = new ArrayList<CadastroCliente>();
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int senha;
    
    // Construtor vazio necess�rio para instancia��o via reflex�o ou frameworks
    public CadastroCliente() {
    }

    public CadastroCliente(String nome, String cpf, String endereco, String telefone, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static List<CadastroCliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

    public static void adicionarCliente(CadastroCliente cliente) {
        clientesCadastrados.add(cliente);
    }
}