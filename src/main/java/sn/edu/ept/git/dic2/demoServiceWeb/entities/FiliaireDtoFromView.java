package sn.edu.ept.git.dic2.demoServiceWeb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "filiairedto")
public class FiliaireDtoFromView {
    @Id
    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "nom")
    private String nom;

    @Column(name = "departement")
    private String departement;

}