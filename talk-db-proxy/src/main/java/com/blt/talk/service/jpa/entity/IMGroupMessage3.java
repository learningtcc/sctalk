package com.blt.talk.service.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the im_group_message_3 database table.
 * 
 */
@Entity
@Table(name = "im_group_message_3")
@NamedQuery(name = "IMGroupMessage3.findAll", query = "SELECT i FROM IMGroupMessage3 i")
public class IMGroupMessage3 extends IMGroupMessageEntity {
    private static final long serialVersionUID = 1L;

}
