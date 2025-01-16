package sn.edu.ept.git.dic2.demoServiceWeb.controller;

import lombok.*;
import sn.edu.ept.git.dic2.demoServiceWeb.entities.Filiaire;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FiliaireDTO {
    private String code;
    private String nom;
    private String departement;

    public static FiliaireDTO fromFiliaire(Filiaire filiaire) {
        return FiliaireDTO.builder()
                .code(filiaire.getCode())
                .nom(filiaire.getNom())
                .departement(filiaire.getDepartement().getCode())
                .build();
    }
}