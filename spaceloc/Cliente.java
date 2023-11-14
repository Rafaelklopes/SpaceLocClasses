/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceloc;
import java.util.ArrayList;
/**
 *
 * @author rafae
 */
public class Cliente extends Usuário{
    public ArrayList<Sala> Historico;
    
    public Cliente(String nome, String email, String cpf, String senha, String telefone, ArrayList historico){
        super(nome, email, cpf, senha, telefone);
        this.Historico= historico;
    }

    @Override
    void getHistorico() {
       
    }
    
}
