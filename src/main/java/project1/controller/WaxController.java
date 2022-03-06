package project1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    //@DeleteMapping()
    //@PatchMapping()

    //Listener mappings
    @GetMapping()
    public List<WaxPeople> findAllPeople(){return waxService.findAllPeople();}

    @GetMapping({"pname/{name}"})
    public WaxPeople findPersonByName(@PathVariable String name){
        return waxService.findPersonByName(name);
    }

    @PostMapping()
    public WaxPeople postPeople(@RequestBody WaxPeople person){
        return waxService.savePeople(person);
    }
}
