package project1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project1.model.WaxPeople;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PeopleRepository extends JpaRepository<WaxPeople, Integer> {

    //@Query("from People")
    List<WaxPeople> findAll();

    //@Query("from People")
    WaxPeople findByName(String name);

    //@Query("from People")
    WaxPeople save(WaxPeople waxperson);
}
