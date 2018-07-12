package com.cloudconnectiv.androidtask.model;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by Mohammad Johar on 7/10/2018.
 */

public class BaseModel {

    @Json(name = "content")
    private List<ServerModel> content = null;
    @Json(name = "last")
    private Boolean last;
    @Json(name = "totalPages")
    private Integer totalPages;
    @Json(name = "totalElements")
    private Integer totalElements;
    @Json(name = "sort")
    private Object sort;
    @Json(name = "first")
    private Boolean first;
    @Json(name = "numberOfElements")
    private Integer numberOfElements;
    @Json(name = "size")
    private Integer size;
    @Json(name = "number")
    private Integer number;

    public List<ServerModel> getContent() {
        return content;
    }

    public void setContent(List<ServerModel> content) {
        this.content = content;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
