package com.linkeep.links.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.linkeep.links.entity.Link;

@Repository
public interface LinkRepository extends CrudRepository<Long, Link>{
    
}
 