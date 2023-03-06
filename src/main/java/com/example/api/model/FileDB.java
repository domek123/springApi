package com.example.api.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;


@Entity
@Table(name = "filesTBL")
public class FileDB {

    @javax.persistence.Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String Id; // pole ID, automatycznie generowany UUID
    private String name;
    private String type;
    private long time;

    @Type(type = "org.hibernate.type.ImageType")
    @Lob
    private byte[] data; // pole na large object data

    public FileDB(String name, String type, long time, byte[] data) {
        this.name = name;
        this.type = type;
        this.time = time;
        this.data = data;
    }

    public FileDB() {

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
