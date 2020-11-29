package project5ltw.data;


import java.util.List;

import java.util.Optional;

import project5ltw.xekhach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface xekhachRepository extends CrudRepository<xekhach, Long>{
	Optional <xekhach> findById(Long id);
	List <xekhach> findAll();
	xekhach save (xekhach x);
}
