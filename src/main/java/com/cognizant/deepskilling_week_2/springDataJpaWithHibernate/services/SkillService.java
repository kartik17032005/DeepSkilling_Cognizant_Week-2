package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Department;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Skill;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.SkillRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillService {

    private SkillRepository skillrepository;

    public SkillService(SkillRepository skillrepository) {
        this.skillrepository = skillrepository;
    }

    @Transactional
    public Optional<Skill> getSkillById(int id){
        return skillrepository.findById(id);
    }

    @Transactional
    public void getSkillById(Skill skill){
        skillrepository.save(skill);
    }
}
