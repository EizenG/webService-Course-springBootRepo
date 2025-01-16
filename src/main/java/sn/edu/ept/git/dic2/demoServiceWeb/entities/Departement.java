package sn.edu.ept.git.dic2.demoServiceWeb.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Schema(description = "Représente un département de l'EPT")
public class Departement {
    @Schema(description = "Code du département; Le code est unique pour chaque département", example = "GIT")
    @Id
    private String code;

    @Schema(description = "Nom du département", example = "Génie Informatique et Telecom")
    private String nom;
}
