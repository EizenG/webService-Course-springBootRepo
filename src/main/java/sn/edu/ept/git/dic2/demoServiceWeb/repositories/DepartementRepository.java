package sn.edu.ept.git.dic2.demoServiceWeb.repositories;

import sn.edu.ept.git.dic2.demoServiceWeb.controller.Departement;

import java.util.List;

public interface DepartementRepository {
    public Departement getDepartement(String code);
    public List<Departement> getAllDepartements();
    public void createDepartement(Departement departement);
    public void deleteDepartement(Departement departement);
    public void updateDepartement(Departement departement);
}
