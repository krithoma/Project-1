package project1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project1.model.Album;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AlbumRepository extends JpaRepository<Album, Integer> {

    //Album queries
    List<Album> findAll();

    Album findByName(String name);
    Album findById(int id);

    Album save(Album waxalbum);

    int deleteByName(String name);
    int deleteById(int id);
}
