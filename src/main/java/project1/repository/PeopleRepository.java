package project1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project1.model.WaxPeople;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PeopleRepository extends JpaRepository<WaxPeople, Integer> {

    @Query("from People")
    List<WaxPeople> findAllPeople();

    @Query("from People")
    WaxPeople findPersonByName(String name);
    @Query("from People")
    WaxPeople savePeople(WaxPeople person);
}
