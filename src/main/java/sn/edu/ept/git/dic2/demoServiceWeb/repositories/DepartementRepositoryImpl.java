package sn.edu.ept.git.dic2.demoServiceWeb.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sn.edu.ept.git.dic2.demoServiceWeb.entities.Departement;

import java.util.List;

@Repository
public class DepartementRepositoryImpl implements DepartementRepository {
    @PersistenceContext
    private EntityManager em;


    @Override
    public Departement getDepartement(String code) {
        return em.find(Departement.class, code);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Departement> getAllDepartements() {
        Query q = em.createQuery("select d from Departement d");
        return q.getResultList();
    }


    @Override
    @Transactional
    public void createDepartement(Departement departement) {
        em.persist(departement);
    }

    @Override
    @Transactional
    public void deleteDepartement(Departement departement) {
        em.remove(departement);
    }

    @Override
    @Transactional
    public void updateDepartement(Departement departement) {
        em.merge(departement);
    }
}
