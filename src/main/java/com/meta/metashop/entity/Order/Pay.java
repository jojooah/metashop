package com.meta.metashop.entity.Order;


import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@DynamicInsert
@NoArgsConstructor
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long pay_id;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Orders order;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    private int imp_uid;//pg결제번호


}
