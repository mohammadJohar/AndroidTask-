package com.cloudconnectiv.androidtask.model;

import com.squareup.moshi.Json;

/**
 * Created by Mohammad Johar on 7/10/2018.
 */

public class DeviceModel {

        @Json(name = "id")
        private Integer id;
        @Json(name = "name")
        private String name;
        @Json(name = "creationDate")
        private Object creationDate;
        @Json(name = "expiryDate")
        private Object expiryDate;

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

        public Object getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Object creationDate) {
            this.creationDate = creationDate;
        }

        public Object getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(Object expiryDate) {
            this.expiryDate = expiryDate;
        }

    }
