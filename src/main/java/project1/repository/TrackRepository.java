package project1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project1.model.Track;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface TrackRepository extends JpaRepository<Track, Integer> {

    List<Track> findAll();

    Track findByName(String trackname);

    Track save(Track songtracks);

    int deleteByName(String name);
}
