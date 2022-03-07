package project1.service;


import org.springframework.stereotype.Component;
import project1.model.Album;
import project1.model.Track;
import project1.model.WaxPeople;
import project1.repository.AlbumRepository;
import project1.repository.PeopleRepository;
import project1.repository.TrackRepository;

import java.util.List;

@Component
public class WaxService {
    PeopleRepository peopleRepository;
    AlbumRepository albumRepository;
    TrackRepository trackRepository;

    public WaxService(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }

    //Listener services
    public List<WaxPeople> findAllPeople() {return peopleRepository.findAll();}

    public WaxPeople findPeopleByName(String name){return peopleRepository.findByName(name);}
    public WaxPeople findPeopleById(int id){return peopleRepository.findById(id);}

    public WaxPeople savePeople(WaxPeople waxperson){return peopleRepository.save(waxperson);}

    public int removePeople(String name){return peopleRepository.deleteByName(name);}

    public WaxPeople updatePeople(WaxPeople waxperson){return peopleRepository.save(waxperson);}

    //Album services
    public List<Album> findAllAlbums(){return albumRepository.findAll();}

    public Album findAlbumsByName(String name){return albumRepository.findByName(name);}

    public Album saveAlbum(Album waxalbum){return albumRepository.save(waxalbum);}

    public int removeAlbum(String name){return albumRepository.deleteByName(name);}

    public Album updateAlbum(Album waxalbum){return albumRepository.save(waxalbum);}

    //Track services
    public List<Track> findAllTracks(){return trackRepository.findAll();}

    public Track findTracksByName(String name){return trackRepository.findByName(name);}

    public Track saveTrack(Track waxtrack){return trackRepository.save(waxtrack);}

    public int removeTrack(String name){return trackRepository.deleteByName(name);}

    public Track updateTrack(Track waxtrack){return trackRepository.save(waxtrack);}
}
