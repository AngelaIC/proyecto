package edu.udea.main.service;

import edu.udea.main.model.Enterprise;
import edu.udea.main.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public void createdEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }
}
