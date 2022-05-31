package com.meta.metashop.entity.Item;

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
public class ItemOption {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long option_id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="item_id")
    private Item item;
    private int quantity;
    private String name;


}
