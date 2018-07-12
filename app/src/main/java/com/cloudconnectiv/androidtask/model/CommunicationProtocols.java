package com.cloudconnectiv.androidtask.model;

import com.squareup.moshi.Json;

/**
 * Created by Mohammad Johar on 7/10/2018.
 */

public class CommunicationProtocols {


    @Json(name = "id")
    private Integer id;
    @Json(name = "name")
    private String name;
    @Json(name = "defaultPort")
    private Integer defaultPort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefaultPort() {
        return defaultPort;
    }

    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }

}
