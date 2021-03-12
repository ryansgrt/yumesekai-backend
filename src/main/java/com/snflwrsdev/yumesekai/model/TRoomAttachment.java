package com.snflwrsdev.yumesekai.model;


import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "t_room_attachment")
public class TRoomAttachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_attachment_id")
    private int roomAttachmentId;

    @Column(name = "sequence")
    private int sequence;

    @Column (name = "file_name")
    private String fileName;

    @Column(name = "file")
    private byte[] file;


}
