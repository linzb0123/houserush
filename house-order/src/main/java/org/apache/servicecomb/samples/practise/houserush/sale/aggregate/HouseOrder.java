package org.apache.servicecomb.samples.practise.houserush.sale.aggregate;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "house_orders")
public class HouseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    private Integer customerId;

    private String state;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderedAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date UpdatedAt;


}
