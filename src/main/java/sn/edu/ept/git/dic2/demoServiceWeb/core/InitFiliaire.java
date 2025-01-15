package sn.edu.ept.git.dic2.demoServiceWeb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sn.edu.ept.git.dic2.demoServiceWeb.entities.Departement;
import sn.edu.ept.git.dic2.demoServiceWeb.entities.Filiaire;
import sn.edu.ept.git.dic2.demoServiceWeb.repositories.DepartementRepository;
import sn.edu.ept.git.dic2.demoServiceWeb.repositories.FiliaireRepository;

import java.util.List;

@Component
@Order(2)
public class InitFiliaire implements CommandLineRunner {
    @Autowired
    private FiliaireRepository filiaireRepository;

    @Autowired
    private DepartementRepository departementRepository;

    @Override
    public void run(String... args) throws Exception {
        if (filiaireRepository.count() == 0) {

            System.out.println("#### Initialisation des filiaires ####");
            Departement git = departementRepository.getDepartement("GIT");
            Departement gem = departementRepository.getDepartement("GEM");

            if(git!=null){
                Filiaire filiaireGit = Filiaire.builder()
                        .code(git.getCode())
                        .nom(git.getNom())
                        .departement(git)
                        .build();

                filiaireRepository.save(filiaireGit);
            }

            if(gem!=null){
                filiaireRepository.saveAll(
                        List.of(
                                Filiaire.builder()
                                        .code(gem.getCode())
                                        .nom(gem.getNom())
                                        .departement(gem)
                                        .build(),

                                Filiaire.builder()
                                        .code("GI")
                                        .nom("Genie industriel")
                                        .departement(gem)
                                        .build()
                                )

                );
            }
        }


    }

}
