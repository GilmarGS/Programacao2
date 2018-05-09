/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criandolista;

/**
 *
 * @author gilmar
 */
public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String sobrenome, String telefone, String email){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (email.trim().equals("")) {
           return  nome + " - " + sobrenome + " - " + telefone; 
        } else{
           return  nome + " - " + sobrenome + " - " + telefone + " - " + email;
        }
        
    }    
}
