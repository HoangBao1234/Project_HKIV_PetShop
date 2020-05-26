/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Stateless
public class FoodsFacade extends AbstractFacade<Foods> implements FoodsFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FoodsFacade() {
        super(Foods.class);
    }
    
}
