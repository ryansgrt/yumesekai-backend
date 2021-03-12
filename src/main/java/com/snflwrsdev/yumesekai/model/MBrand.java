package com.snflwrsdev.yumesekai.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "m_brand")
public class MBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "brand_id")
    private int brandId;

    @Column (name = "brand_name")
    private String brandName;

}
