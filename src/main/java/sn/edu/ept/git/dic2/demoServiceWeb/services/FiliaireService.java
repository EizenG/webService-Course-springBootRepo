package sn.edu.ept.git.dic2.demoServiceWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.ept.git.dic2.demoServiceWeb.controller.FiliaireDTO;
import sn.edu.ept.git.dic2.demoServiceWeb.entities.Filiaire;
import sn.edu.ept.git.dic2.demoServiceWeb.repositories.FiliaireRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FiliaireService {
    @Autowired
    private FiliaireRepository filiaireRepository;

    public List<Filiaire> getAllFiliaire(){
        return filiaireRepository.findAll();
    }
    public Optional<Filiaire> getFiliaireById(String code){
        return filiaireRepository.findById(code);
    }
    public Filiaire saveFiliaire(Filiaire filiaire){
        return filiaireRepository.save(filiaire);
    }
    public void deleteFiliaire(String code){
        filiaireRepository.deleteById(code);
    }

    public Filiaire findByNom(String nom){
        return filiaireRepository.findByNom(nom);
    }
}
