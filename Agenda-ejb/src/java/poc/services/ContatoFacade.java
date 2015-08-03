/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poc.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import poc.entity.Contato;

/**
 *
 * @author gpoli
 */
@Stateless
public class ContatoFacade extends AbstractFacade<Contato> implements ContatoFacadeLocal {
    @PersistenceContext(unitName = "Agenda-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContatoFacade() {
        super(Contato.class);
    }
    
}
