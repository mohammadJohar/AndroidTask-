package com.cloudconnectiv.androidtask.model;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by Mohammad Johar on 7/10/2018.
 */

public class ServerModel {

    @Json(name = "id")
    private Integer id;
    @Json(name = "name")
    private String name;
    @Json(name = "ipAddress")
    private String ipAddress;
    @Json(name = "ipSubnetMask")
    private String ipSubnetMask;
    @Json(name = "model")
    private DeviceModel model;
    @Json(name = "status")
    private DeviceStatus status;
    @Json(name = "type")
    private DeviceType type;
    @Json(name = "serialNum")
    private String serialNum;
    @Json(name = "communicationProtocols")
    private List<CommunicationProtocols> communicationProtocols = null;
    @Json(name = "targetMachines")
    private List<Object> targetMachines = null;
    @Json(name = "location")
    private Integer location;

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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpSubnetMask() {
        return ipSubnetMask;
    }

    public void setIpSubnetMask(String ipSubnetMask) {
        this.ipSubnetMask = ipSubnetMask;
    }

    public DeviceModel getModel() {
        return model;
    }

    public void setModel(DeviceModel model) {
        this.model = model;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public List<CommunicationProtocols> getCommunicationProtocols() {
        return communicationProtocols;
    }

    public void setCommunicationProtocols(List<CommunicationProtocols> communicationProtocols) {
        this.communicationProtocols = communicationProtocols;
    }

    public List<Object> getTargetMachines() {
        return targetMachines;
    }

    public void setTargetMachines(List<Object> targetMachines) {
        this.targetMachines = targetMachines;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }
}
