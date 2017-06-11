package com.tomorrowpvp.plugin;

public class TeleportLocation {

    private String name;
    private Integer x;
    private Integer y;
    private Integer z;

    private Integer teleportX;
    private Integer teleportY;
    private Integer teleportZ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getTeleportX() {
        return teleportX;
    }

    public void setTeleportX(Integer teleportX) {
        this.teleportX = teleportX;
    }

    public Integer getTeleportY() {
        return teleportY;
    }

    public void setTeleportY(Integer teleportY) {
        this.teleportY = teleportY;
    }

    public Integer getTeleportZ() {
        return teleportZ;
    }

    public void setTeleportZ(Integer teleportZ) {
        this.teleportZ = teleportZ;
    }

    public TeleportLocation(String name, Integer x, Integer y, Integer z, Integer teleportX, Integer teleportY, Integer teleportZ) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.teleportX = teleportX;
        this.teleportY = teleportY;
        this.teleportZ = teleportZ;
    }
}

