package com.linkeep.links.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.linkeep.links.entity.Link;
import com.linkeep.links.repository.LinkRepository;

import java.util.List;

@Service
public class LinkService {

    private LinkRepository linkRepository;

    @Autowired
    public LinkService(LinkRepository linkRepository){
        this.linkRepository = linkRepository;
    }

    public void saveLink(Link link) {
        List<Link> links = linkRepository.findByUri(link.getUri());

        if(links != null)
            link.setId(links.get(0).getId());
        
        linkRepository.save(link);
    }

    public void deleteLink(Link link) {
        linkRepository.delete(link);
    }

    public List<Link> findAllByUserId(Long user){
        return linkRepository.findAllByUser(user);
    }

    public List<Link> findAll(){
        return linkRepository.findAll();
    }

}
