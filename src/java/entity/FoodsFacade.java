/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    @Override
    public List<Foods> recommentFood(Animals animals) {
        String query = "SELECT f FROM Foods f WHERE f.cFId = :animals";
        Query q = em.createQuery(query).setMaxResults(5);
        q.setParameter("animals", animals);
        return q.getResultList();
    }

    @Override
    public List<Foods> searchByName(String name) {
        String query = "SELECT f FROM Foods f WHERE f.name LIKE :name";
        Query q = em.createQuery(query);
        q.setParameter("name", "%"+name+"%");
        return q.getResultList();
    }
    
}
