package project1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "People")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WaxPeople {
    //User accounts go here.
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personID;

    @Column(unique= true)
    private String name;

    //@OneToMany(mappedBy = "waxlistener", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //public List<Album> albums;
}
