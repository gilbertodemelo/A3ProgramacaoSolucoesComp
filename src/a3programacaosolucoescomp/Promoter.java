/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3programacaosolucoescomp;

/**
 *
 * @author gilbertodemelojr
 */
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
    
    //Métdoso Acessores
    public void setPrimeiroNome(String primeiroNome) { this.primeiroNome = primeiroNome; } 
  
}
