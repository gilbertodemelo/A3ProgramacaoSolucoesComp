/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3programacaosolucoescomp;

import java.util.Date;

public class Evento {
    
    
    // Variáveis de Instância
    private String nomeEvento;
    private Date dataEvento;
    private String localEvento;
    private Promoter promoter;          // O Promoter responsável pelo evento
    
    /**
     * Constructor
     * @param nome
     * @param data
     * @param local
     * @param promoter
     */
    public Evento(String nome, Date data, String local, Promoter promoter) {
        this.nomeEvento = nome;
        this.dataEvento = data;
        this.localEvento = local;
        this.promoter = promoter;
        
    }
    
    @Override
    public String toString() {
        StringBuilder ss = new StringBuilder();
        ss.append("Nome do Evento: " + this.nomeEvento + "\n");
        ss.append("Data: " + this.dataEvento + "\n");
        ss.append("Local:"  + this.localEvento + "\n");
        ss.append("Promoter: " + this.promoter.getPrimeiroNome() + " " + this.promoter.getSobrenome());
        
        return ss.toString();
    }
    
    
}
