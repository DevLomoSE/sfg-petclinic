package com.devlomose.sfgpetclinic.services.map;

import com.devlomose.sfgpetclinic.model.Speciality;
import com.devlomose.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * SpecialityServiceMap at: pet-clinic-data/src/main/java/com/devlomose/sfgpetclinic/services/map
 * Created by @DevLomoSE at 7/9/21 11:48.
 */
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
