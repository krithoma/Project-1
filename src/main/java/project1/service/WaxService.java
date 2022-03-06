package project1.service;


import org.springframework.stereotype.Component;
import project1.model.WaxPeople;
import project1.repository.PeopleRepository;

import java.util.List;

@Component
public class WaxService {
    PeopleRepository peopleRepository;

    public WaxService(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }

    //Listener services
    public List<WaxPeople> findAllPeople() {return peopleRepository.findAll();}

    public WaxPeople findPeopleByName(String name){return peopleRepository.findByName(name);}

    public WaxPeople savePeople(WaxPeople waxperson){return peopleRepository.save(waxperson);}

}
