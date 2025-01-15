package sn.edu.ept.git.dic2.demoServiceWeb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Departement {
    @Id
    private String code;
    private String nom;


    public Departement(String nom, String code) {
        this.nom = nom;
        this.code = code;
    }

    public Departement() {
    }

}
