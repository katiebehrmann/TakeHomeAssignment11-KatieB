package com.example.android.takehomeassignment11_katieb;

import java.io.Serializable;

/**
 * Created by katie on 4/14/17.
 */

public class CarbonAction implements Serializable {

    public String name;
    public String info;
    public int photoID;

    public CarbonAction(String name, String info, int photoID) {
        this.name = name;
        this.info = info;
        this.photoID = photoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    @Override
    public String toString() {
        return name + "\n" + info + "\n" + photoID;
    }
}
