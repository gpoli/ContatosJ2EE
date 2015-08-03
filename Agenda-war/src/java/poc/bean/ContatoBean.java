/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poc.bean;

import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import poc.entity.Contato;
import poc.entity.Tipo;
import poc.services.ContatoFacadeLocal;
import poc.services.TipoFacadeLocal;

/**
 *
 * @author gpoli
 */
@ManagedBean
@RequestScoped
public class ContatoBean {
    @EJB
    private TipoFacadeLocal tipoFacade;
    @EJB
    private ContatoFacadeLocal contatoFacade;
    
    private int    id;
    private String email;
    private String nome;
    private String apelido;
    private String telefone;
    private Date   nascimento;
    private String notas;
    private Tipo   tipo;

    
    public ContatoBean() {
        tipo = new Tipo();
    }
    
    public List<Contato> getAllContatos(){
        return contatoFacade.findAll();
    }
    
    public String criar() {
        Contato c = new Contato();
        c.setApelido(apelido);
        c.setEmail(email);
        c.setNascimento(nascimento);
        c.setNome(nome);
        c.setNotas(notas);
        c.setTelefone(telefone);
        c.setTipoid(tipoFacade.find(tipo.getId()));
        contatoFacade.create(c);
        return "contato";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
