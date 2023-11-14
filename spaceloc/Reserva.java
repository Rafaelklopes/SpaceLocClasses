/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceloc;

/**
 *
 * @author rafae
 */
public class Reserva {
    String horaEntrada;
    String horaSaida;
    String dataReserva;
    String valorTotal;
    Cliente cliente;
    Proprietario proprietario;
    Sala sala;
    public Reserva(String Hentrada, String Hsaida, String dataReserva, String valorTotal, Cliente cliente, Proprietario proprietario,Sala sala){
        this.horaEntrada= Hentrada;
        this.horaSaida= Hsaida;
        this.dataReserva= dataReserva;
        this.valorTotal= valorTotal;
        this.cliente= cliente;
        this.proprietario= proprietario;
        this.sala= sala;
    }
    public void efetuarPagamento(){
        
    }
    public void reservar(){
        
    }
}
