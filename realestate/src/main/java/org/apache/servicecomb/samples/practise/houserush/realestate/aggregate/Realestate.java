package org.apache.servicecomb.samples.practise.houserush.realestate.aggregate;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "realestates")
public class Realestate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "realestate")
    private List<Building> buildings = new ArrayList<>();

    private String name;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
