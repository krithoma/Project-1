package project1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project1.model.Album;
import project1.model.Track;
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
    public List<Track> getAllTrack(){return waxService.findAllTracks();}

    @GetMapping({"name/{name}"})
    public WaxPeople getByName(@PathVariable String name){return waxService.findPeopleByName(name);}
    public Album getAlbumByName(@PathVariable String name){return waxService.findAlbumsByName(name);}
    public Track getTrackByName(@PathVariable String name){return waxService.findTracksByName(name);}

    @GetMapping({"id/{id}"})
    public WaxPeople getById(@PathVariable int id){return waxService.findPeopleById(id);}

    @PostMapping()
    public WaxPeople postPeople(@RequestBody WaxPeople waxperson){return waxService.savePeople(waxperson);}
    public Album postAlbum(@RequestBody Album waxalbum){return waxService.saveAlbum(waxalbum);}
    public Track postTrack(@RequestBody Track waxtrack){return waxService.saveTrack(waxtrack);}

    @DeleteMapping({"name/{name}"})
    public int deletePeople(@PathVariable String name){return waxService.removePeople(name);}
    public int deleteAlbum(@PathVariable String name){return waxService.removeAlbum(name);}
    public int deleteTrack(@PathVariable String name){return waxService.removeTrack(name);}

    @PatchMapping()
    public WaxPeople patchPeople(@RequestBody WaxPeople waxperson){return waxService.updatePeople(waxperson);}
    public Album patchAlbum(@RequestBody Album waxalbum){return waxService.updateAlbum(waxalbum);}
    public Track patchTrack(@RequestBody Track waxtrack){return waxService.updateTrack(waxtrack);}

}
