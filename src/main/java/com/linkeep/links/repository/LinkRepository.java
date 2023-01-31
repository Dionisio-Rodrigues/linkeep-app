package com.linkeep.links.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linkeep.links.entity.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    List<Link> findByUri(String uri);
    List<Link> findAllByUserId(Long userId);
}
