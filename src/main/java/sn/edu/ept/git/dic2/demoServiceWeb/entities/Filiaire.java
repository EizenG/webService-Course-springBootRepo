package sn.edu.ept.git.dic2.demoServiceWeb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Filiaire {
    @Id
    private String code;
    private String nom;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Departement departement;
}
