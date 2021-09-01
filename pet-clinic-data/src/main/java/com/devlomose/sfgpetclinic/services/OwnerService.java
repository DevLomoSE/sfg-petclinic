package com.devlomose.sfgpetclinic.services;

import com.devlomose.sfgpetclinic.model.Owner;

public interface OwnerService extends  CRUDService<Owner, Long>{

    Owner findByLastName(String lastName);

}
