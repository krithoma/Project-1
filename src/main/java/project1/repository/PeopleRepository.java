package project1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project1.model.Album;
import project1.model.WaxPeople;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PeopleRepository extends JpaRepository<WaxPeople, Integer> {

    List<WaxPeople> findAll();

    WaxPeople findByName(String name);

    WaxPeople save(WaxPeople waxperson);

    int deleteByName(String name);
}
