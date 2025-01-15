package sn.edu.ept.git.dic2.demoServiceWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sn.edu.ept.git.dic2.demoServiceWeb.entities.Filiaire;

import java.util.List;

public interface FiliaireRepository extends JpaRepository<Filiaire, String> {
    public Filiaire findByNom(String nom);

    @Query("SELECT f from Filiaire f where f.nom = :txt or f.code = :txt or f.departement.code = :txt or f.departement.nom = :txt")
    public List<Filiaire> rechercherFiliaire(String txt);
}
