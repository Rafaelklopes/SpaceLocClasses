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
public class Proprietario extends Usuário {
    public ArrayList<Sala> minhasSalas;

    public Proprietario(String nome, String email, String cpf, String senha, String telefone, ArrayList<Sala> minhasSalas){
        super(nome, email, cpf, senha, telefone);
        this.minhasSalas= minhasSalas;
    }
    public void cadastrarSala(){
        
    }
    
    
    
    
    
    @Override
    void getHistorico() {
    }
    
}
