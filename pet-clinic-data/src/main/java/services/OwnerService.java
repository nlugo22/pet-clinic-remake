package services;

import com.example.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner fimdByLastName(String lastName);
}
