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
    private int trackID;
    @Column
    private int trackNum;
    @Column
    private String trackname;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="albumID")
    public Album waxalbum;
}
