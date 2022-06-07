/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package a3programacaosolucoescomp;

public class Usuario {
    
    public static int contadorId = 1;
    protected int id = contadorId;
    protected String cpf, rg, email, senha, telefone, endereco, cep, primeiroNome,
            sobrenome, tipoUsuario, contato;
    
    // Método construtor
    public Usuario(){}
    public Usuario(String nome, String sobrenome, String email, String senha, String cpf, String rg, String telefone, String cep, String endereco, String contato, String tipoUsuario){
        this.primeiroNome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.cep = cep;
        this.endereco = endereco;
        this.contato = contato;
        this.tipoUsuario = tipoUsuario;
        contadorId++;
        this.id = contadorId;
    }
    
    // Mutadores);
    public void setCpf(String cpf){ this.cpf = cpf; };
    public void setRg(String rg){ this.rg = rg; };
    public void setEmail(String email){ this.email = email; };
    public void setSenha(String senha){ this.senha = senha; };
    public void setTelefone(String telefone){ this.telefone = telefone; };
    public void setEndereco(String endereco){ this.endereco = endereco; };
    public void setCep(String cep){ this.cep = cep; };
    public void setPrimeiroNome(String primeiroNome){ this.primeiroNome = primeiroNome; };
    public void setSobrenome(String sobrenome){ this.sobrenome = sobrenome; };
    public void setTipoUsuario(String tipoUsuario){ this.tipoUsuario = tipoUsuario; };
    public void setContato(String contato){ this.contato = contato; };
    
    // Acessores
    public int getId(){ return this.id; };
    public String getCpf(){ return this.cpf; };
    public String getRg(){ return this.rg; };
    public String getEmail(){ return this.email; };
    public String getSenha(){ return this.senha; };
    public String getTelefone(){ return this.telefone; };
    public String getEndereco(){ return this.endereco; };
    public String getCep(){ return this.cep; };
    public String getPrimeiroNome(){ return this.primeiroNome; };
    public String getSobrenome(){ return this.sobrenome; };
    public String getTipoUsuario(){ return this.tipoUsuario; };
    public String getContato(){ return this.contato; };
}
