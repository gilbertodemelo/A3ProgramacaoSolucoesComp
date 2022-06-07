/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3programacaosolucoescomp;

import java.util.ArrayList;


public class Participante implements Usuario {
    
     // Variáveis de instância
    private String primeiroNome;
    private String sobreNome;
    private String email;
    private String numeroTelefone;
    private String rg;
    private String cpf;
    private String nomeUsuarioIg;       // nome de usuario de Instagram 
    private ArrayList<Evento> eventos;  // Eventos a quais o Participante ira
    
    /**
     * Constructor
     * @param primeiroNome
     * @param sobreNome
     * @param email
     * @param numTel
     * @param rg
     * @param cpf
     * @param instagram
     */
    public Participante(String primeiroNome, String sobreNome, String email, 
            String numTel, String rg, String cpf, String instagram) {
       this.primeiroNome = primeiroNome;
       this.sobreNome = sobreNome;
       this.email = email;
       this.numeroTelefone = numTel;
       this.rg = rg;
       this.cpf = cpf;
       this.nomeUsuarioIg = instagram;
       this.eventos = new ArrayList<>();
    }
    
    // Métodos Mutadores
    @Override
    public void setPrimeiroNome(String primeiroNome) { this.primeiroNome = primeiroNome; }
    @Override
    public void setSobrenome(String sobreNome) { this.sobreNome = sobreNome; }
    @Override
    public void setEmail(String email) { this.email = email; }
    @Override
    public void setTelefone(String numTel) { this.numeroTelefone = numTel; }
    @Override
    public void setRg(String rg) { this.rg = rg;}
    @Override
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setInstagram(String instagram) { this.nomeUsuarioIg = instagram; }
    
    // Métodos Acessores 
    @Override
    public String getPrimeiroNome() { return this.primeiroNome; }
    @Override
    public String getSobrenome() { return this.sobreNome; }
    @Override
    public String getEmail() { return this.email; }
    @Override
    public String getNumTelefone() { return this.numeroTelefone; }
    @Override
    public String getRg() { return this.rg; }
    @Override
    public String getCpf() { return this.cpf; }
    public String getInstagram() { return this.nomeUsuarioIg; }
 
    
}
