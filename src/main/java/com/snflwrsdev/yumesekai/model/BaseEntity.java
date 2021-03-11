package com.snflwrsdev.yumesekai.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    public static final long serialVersionUID = 1L;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @Column(name = "version")
    private Long version;


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        if(version == null){
            this.version = 0L;
        }else {
            this.version = version;
        }
        this.version = version;
    }
}
