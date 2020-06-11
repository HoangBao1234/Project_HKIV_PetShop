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
public class PetsFacade extends AbstractFacade<Pets> implements PetsFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PetsFacade() {
        super(Pets.class);
    }

    @Override
    public void deleteByAnimals(Animals animals) {
        String query = "DELETE FROM Pets p WHERE p.cFId = :animals";
        Query q = em.createQuery(query);
        q.setParameter("animals", animals);
        q.executeUpdate();
    }

    @Override
    public void deleteBYBreed(Breeds breeds) {
        String query = "DELETE FROM Pets p WHERE p.cPId = :breeds";
        Query q = em.createQuery(query);
        q.setParameter("breeds", breeds);
        q.executeUpdate();
    }

    @Override
    public List<Pets> recommentPet(Breeds breeds) {
        String query = "SELECT p FROM Pets p WHERE p.cPId = :breeds";
        Query q = em.createQuery(query).setMaxResults(5);
        q.setParameter("breeds", breeds);
        return q.getResultList();
    }

    @Override
    public List<Pets> searchByName(String name) {
        String query = "SELECT p FROM Pets p WHERE p.pName LIKE :name";
        Query q = em.createQuery(query);
        q.setParameter("name", "%"+name+"%");
        return q.getResultList();
    }
    
    
    
}
