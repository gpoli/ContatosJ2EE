/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poc.services;

import java.util.List;
import javax.ejb.Local;
import poc.entity.Contato;

/**
 *
 * @author gpoli
 */
@Local
public interface ContatoFacadeLocal {

    void create(Contato contato);

    void edit(Contato contato);

    void remove(Contato contato);

    Contato find(Object id);

    List<Contato> findAll();

    List<Contato> findRange(int[] range);

    int count();
    
}
