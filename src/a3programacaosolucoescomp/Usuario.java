/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package a3programacaosolucoescomp;

public interface Usuario {
    
    // Mutadores);
    public void setPrimeiroNome(String primeiroNome);
    public void setSobrenome(String sobreNome);
    public void setEmail(String email);
    public void setTelefone(String numTel);
    public void setRg(String rg);
    public void setCpf(String cpf);
    
    // Acessores
    public String getPrimeiroNome();
    public String getSobrenome();
    public String getEmail();
    public String getNumTelefone();
    public String getRg();
    public String getCpf();
  
}
