package project1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
