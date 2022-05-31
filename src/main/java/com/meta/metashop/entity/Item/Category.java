package com.meta.metashop.entity.Item;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@DynamicInsert
@NoArgsConstructor
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long category_id;
    private String category_name;

}
