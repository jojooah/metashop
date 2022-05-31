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
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long review_id;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_item_id")
    private OrderItem orderItem;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    double rate;

    @Lob
    String content;

    String img;



}
