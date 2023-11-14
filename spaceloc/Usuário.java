/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceloc;

/**
 *
 * @author rafae
 */
public abstract class Usuário {
    public String nome;
    public String email;
    public String cpf;
    public String senha;
    public String telefone;
    public double avaliacao;


public Usuário(String nome, String email, String cpf, String senha, String telefone){
    this.nome= nome;
    this.email= email;
    this.cpf= cpf;
    this.senha= senha;
    this.telefone= telefone;

}
abstract void getHistorico();

public double getAvaliacao(){
    return this.avaliacao;
    
    
}

public void setNome(String nome){
    this.nome= nome;
}
public void setEmail(String email){
    this.email= email;
}
public void setCpf(String cpf){
    this.cpf= cpf;
}
public void setSenha(String senha){
    this.senha= senha;
}
public void setTelefone(String telefone){
    this.telefone= telefone;
}
public String getNome(){
    return this.nome;
}
public String getEmail(){
    return this.email;
}
public String getCpf(){
    return this.cpf;
}
public String getSenha(){
    return this.senha;
}
public String getTelefone(){
    return this.telefone;
}
}