/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eb.ctex.precadsiscau.facade;

import br.eb.ctex.precadsiscau.modelo.Cadastro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ansua
 */
@Stateless
public class CadastroFacade extends AbstractFacade<Cadastro> {

    @PersistenceContext(unitName = "br.eb.ctex_precadsiscau_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CadastroFacade() {
        super(Cadastro.class);
    }
    
}
