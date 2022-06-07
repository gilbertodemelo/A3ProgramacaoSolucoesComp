/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3programacaosolucoescomp;

import java.util.ArrayList;
import java.util.Date;


public class Promoter extends Usuario {
    
    // Variáveis de instância
    private String empresa;
    private String cnpjEmpresa;
    
    // Método ocnstrutor
    public Promoter(String nome, String sobrenome, String email, String senha, String cpf, String rg, String telefone, String cep, String endereco, String contato, String tipoUsuario, String empresa, String cnpj){ 
        super(nome, sobrenome, email, senha, cpf, rg, telefone, cep, endereco, contato, tipoUsuario);
        this.empresa = empresa;
        this.cnpjEmpresa = cnpj;
    }
    
    // Métodos Mutadores
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    public void setCnpjEmpresa(String cnpj) { this.cnpjEmpresa = cnpj; }
  
    
    // Métodos Acessores 
    public String getEmpresa() { return this.empresa; }
    public String getCnpjEmpresa() { return this.cnpjEmpresa; }
}
