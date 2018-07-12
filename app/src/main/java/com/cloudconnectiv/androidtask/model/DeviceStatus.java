package com.cloudconnectiv.androidtask.model;

import com.squareup.moshi.Json;

/**
 * Created by Mohammad Johar on 7/10/2018.
 */

public class DeviceStatus {
    @Json(name = "id")
    private Integer id;
    @Json(name = "legacyValue")
    private String legacyValue;
    @Json(name = "statusValue")
    private String statusValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLegacyValue() {
        return legacyValue;
    }

    public void setLegacyValue(String legacyValue) {
        this.legacyValue = legacyValue;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }
}
