/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceloc;

/**
 *
 * @author rafae
 */
public class Sala {
    String logradouro;
    String areaQuadrada;
    int capacidade;
    double precoHora;
    String tipoEspaco;
    Boolean servicoAtendimento;
    Boolean disponibilidade;
    String regiao;
    
    public Sala(String logradouro, String areaQuadrada, int capacidade, double precoHora, String tipoEspaco, Boolean servico, Boolean disponibilidade, String regiao){
        this.logradouro= logradouro;
        this.areaQuadrada= areaQuadrada;
        this.capacidade= capacidade;
        this.precoHora= precoHora;
        this.tipoEspaco= tipoEspaco;
        this.servicoAtendimento= servico;
        this.disponibilidade= disponibilidade;
        this.regiao= regiao;
    }
}
