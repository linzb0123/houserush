package org.apache.servicecomb.samples.practise.houserush.aggregate;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="building_id")
    private Building building;

    private String name;

    private Integer layer;

    private String state;

    private Integer sequenceInLayer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
