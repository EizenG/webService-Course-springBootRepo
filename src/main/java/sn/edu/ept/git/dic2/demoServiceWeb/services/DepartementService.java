package sn.edu.ept.git.dic2.demoServiceWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.ept.git.dic2.demoServiceWeb.controller.Departement;
import sn.edu.ept.git.dic2.demoServiceWeb.repositories.DepartementRepository;

import java.util.List;

@Service
public class DepartementService {
    @Autowired
    private DepartementRepository departementRepository;

    public List<Departement> getAllDepartements() {
        return departementRepository.getAllDepartements();
    }
    public Departement getDepartementById(String code) {
        return departementRepository.getDepartement(code);
    }

    public void createDepartement(Departement departement) {
        departementRepository.createDepartement(departement);
    }

    public void updateDepartement(Departement departement) {
        departementRepository.updateDepartement(departement);
    }

    public void deleteDepartement(Departement departement) {
        departementRepository.deleteDepartement(departement);
    }

    public void deleteByCode(String code) {
        Departement dept = departementRepository.getDepartement(code);
        departementRepository.deleteDepartement(dept);
    }
}
