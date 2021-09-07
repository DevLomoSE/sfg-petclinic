package com.devlomose.sfgpetclinic.services.map;

import com.devlomose.sfgpetclinic.model.PetType;
import com.devlomose.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * PetTypeServiceMap at: pet-clinic-data/src/main/java/com/devlomose/sfgpetclinic/services/map
 * Created by @DevLomoSE at 7/9/21 10:45.
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
