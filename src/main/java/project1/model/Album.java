package project1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Album")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Album<WaxListener> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int albumID;

    @Column(unique = true)
    private String name;
    @Column
    private int numberoftracks;
    @Column
    private int yearreleased;
    @Column
    private String genre;
    @Column
    private String format;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="personID")
    public WaxPeople waxperson;

}
