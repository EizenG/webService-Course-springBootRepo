package sn.edu.ept.git.dic2.demoServiceWeb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.ept.git.dic2.demoServiceWeb.controller.Departement;
import sn.edu.ept.git.dic2.demoServiceWeb.repositories.DepartementRepository;

@Component
public class InitDepartement implements CommandLineRunner {
    @Autowired
    private DepartementRepository departementRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("################Initialisation des departements############");
        Departement departement = new Departement();
        departement.setCode("GIT");
        departement.setNom("Genie Informatique et Telecom");

        departementRepository.createDepartement(departement);
    }
}
