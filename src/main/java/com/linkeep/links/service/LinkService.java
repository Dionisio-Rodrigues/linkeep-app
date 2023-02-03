package com.linkeep.links.service;

import org.springframework.beans.factory.annotation.Autowired;
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

        List<Link> myLinks = linkRepository.findByUriAndUser(link.getUri(), link.getUser());

        if(myLinks.size() > 0)
            link.setId(myLinks.get(0).getId());

        linkRepository.save(link);
    }

    public void deleteLink(Link link) {
        List<Link> myLink = linkRepository.findByUriAndUser(link.getUri(), link.getUser());

        linkRepository.delete(myLink.get(0));
    }

    public List<Link> findAllByUser(String user){
        return linkRepository.findAllByUserOrderById(user);
    }

    public List<Link> findAll(){
        return linkRepository.findAll();
    }

}
