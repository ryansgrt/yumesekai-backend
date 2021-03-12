package com.snflwrsdev.yumesekai.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "m_user")
public class MUser extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int idUser;

    @Column (name = "username")
    private String username;

    @Column (name = "password")
    private String password;

    @Column (name = "address")
    private String address;

    @Column (name = "fullname")
    private String fullname;

    @Column (name = "is_active")
    private Boolean isActive;

    @Column (name = "account_expired")
    private Boolean accountExpired;

}
