package project1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Tracks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Track {
    //Album tracks go here.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackID;

    @Column
    private int trackNum;
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="albumID")
    public Album waxalbum;
}
