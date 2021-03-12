package com.snflwrsdev.yumesekai.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "m_group")
public class MGroup {

    @Id
    @Column (name = "group_id")
    private int groupId;

    @Column (name = "group_name")
    private String groupName;



}
