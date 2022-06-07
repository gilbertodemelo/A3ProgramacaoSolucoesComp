/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3programacaosolucoescomp;

import java.util.Date;
import java.util.ArrayList;


public class A3ProgramacaoSolucoesComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Promoter
        Promoter joao = new Promoter("João", "Silva", "joao.silva@anhembi.br",
                "11-555-5555", "3456564", "23512233300", "UAM Eventos", "12345678000110");
        
        
        // Evento
        String nomeEvento = "Festa de São João da UAM";
        Date dataEvento = new Date(2022,5, 25); // YYYY-MM-DD
        String localEvento = "Campus Vila Olimpia";
        Promoter promoter = joao;
        
      
        joao.criaEvento(nomeEvento, dataEvento, localEvento, promoter);
        
        joao.procuraEventos();
    }
    
}
