package project1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project1.model.Album;
import project1.model.WaxPeople;
import project1.service.WaxService;

import java.util.List;

@RestController
public class WaxController {

    WaxService waxService;

    @Autowired
    public WaxController(WaxService waxService){
        this.waxService = waxService;
    }

    //Listener mappings
    @GetMapping()
    public List<WaxPeople> getAllPeople(){return waxService.findAllPeople();}
    public List<Album> getAllAlbum(){return waxService.findAllAlbums();}

    @GetMapping({"name/{name}"})
    public WaxPeople getByName(@PathVariable String name){return waxService.findPeopleByName(name);}
    public Album getAlbumByName(@PathVariable String name){return waxService.findAlbumsByName(name);}

    @PostMapping()
    public WaxPeople postPeople(@RequestBody WaxPeople waxperson){return waxService.savePeople(waxperson);}
    public Album postAlbum(@RequestBody Album waxalbum){return waxService.saveAlbum(waxalbum);}

    //@DeleteMapping()
    //@PatchMapping()


}
