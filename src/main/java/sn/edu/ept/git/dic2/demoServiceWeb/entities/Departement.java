package sn.edu.ept.git.dic2.demoServiceWeb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Departement {
    @Id
    private String code;
    private String nom;


}
