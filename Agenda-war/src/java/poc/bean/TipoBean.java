/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poc.bean;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import poc.entity.Tipo;
import poc.services.TipoFacadeLocal;

/**
 *
 * @author gpoli
 */
@ManagedBean
@RequestScoped
public class TipoBean {
    
    @EJB
    private TipoFacadeLocal tipoFacade;

    private int    id;
    private String nome;
    private String descricao;
    
    
    public TipoBean() {
    }
    
    public List<Tipo> getAllTipos(){
        return tipoFacade.findAll();
    }
    
    public String criar(){
        Tipo t = new Tipo();
        t.setNome(nome);
        t.setDescricao(descricao);
        tipoFacade.create(t);
        return "tipo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
