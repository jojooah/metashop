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
public class ItemImg {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long item_img_id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="item_id")
    private Item item;

    private String original_file_name;
    private String img_name;
    private String img_url;


}
