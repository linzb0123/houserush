package org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String phone;

    private String realName;

    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Qualification> qualifications = new ArrayList<>();


    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;


}
