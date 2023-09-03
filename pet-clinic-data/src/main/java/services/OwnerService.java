package services;

import com.example.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner fimdByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
