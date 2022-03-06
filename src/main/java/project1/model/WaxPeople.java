package project1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "People")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WaxPeople {
    //User accounts go here.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personID;

    @Column(unique= true)
    private String name;

    @OneToMany(mappedBy = "waxperson", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Album> albums;
}
