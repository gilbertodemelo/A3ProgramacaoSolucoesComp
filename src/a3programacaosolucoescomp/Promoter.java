/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3programacaosolucoescomp;

public class Promoter implements Usuario {
    
    // Variáveis de instância
    private String primeiroNome;
    private String sobreNome;
    private String email;
    private String numeroTelefone;
    private String rg;
    private String cpf;
    private String empresa;
    private String cnpjEmpresa;
  
    /**
     * Constructor
     * @param primeiroNome
     * @param sobreNome
     * @param email
     * @param numTel
     * @param rg
     * @param cpf
     * @param empresa
     * @param cnpj
     * 
     */
    public Promoter(String primeiroNome, String sobreNome, String email, 
            String numTel, String rg, String cpf, String empresa, String cnpj) {
       this.primeiroNome = primeiroNome;
       this.sobreNome = sobreNome;
       this.email = email;
       this.numeroTelefone = numTel;
       this.rg = rg;
       this.cpf = cpf;
       this.empresa = empresa;
       this.cnpjEmpresa = cnpj;
               
       
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
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    public void setCnpjEmpresa(String cnpj) { this.cnpjEmpresa = cnpj; }
    
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
    public String getEmpresa() { return this.empresa; }
    public String getCnpjEmpresa() { return this.cnpjEmpresa; }

   
}
