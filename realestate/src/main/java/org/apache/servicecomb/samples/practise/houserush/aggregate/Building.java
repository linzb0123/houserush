package org.apache.servicecomb.samples.practise.houserush.aggregate;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "realestate_id")
    private Realestate realestate;

    @OneToMany(mappedBy = "building")
    private List<House> houses = new ArrayList<>();

    private String name;

    private Integer sequenceInRealestate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
