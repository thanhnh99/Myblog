package com.shippingsystem.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shippingsystem.Enum.EOrderStatus;
import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@JsonIgnoreProperties("order")
public class OrderStatus extends BaseModel {

    @Column
    private EOrderStatus value;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="stock_id", referencedColumnName = "id")
    private Stock stock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="shipper_id", referencedColumnName = "id")
    private User shipper;

}
