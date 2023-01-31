package com.linkeep.links.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkeep.links.service.LinkService;
import com.linkeep.links.entity.Link;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkController{
    
    LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService){
        this.linkService = linkService;
    }

    @GetMapping("findAll")
    public List<Link> findAll(){
        return linkService.findAll();
    }

    @GetMapping("findAllByUserId/{userId}")
    public List<Link> findAllByUser(@PathVariable("userId") Long userId){
        return linkService.findAllByUserId(userId);
    }

    @PostMapping("save")
    public void saveLink(@RequestBody Link link){
        linkService.saveLink(link);
    }

    @DeleteMapping("delete")
    public void deleteLink(@RequestBody Link link){
        linkService.deleteLink(link);
    }
}