package com.alexzh.tutorial.multiplerowlayoutsrecyclerview.dummy.model;

public class CityEvent {

    public static final int CITY_TYPE = 0;
    public static final int EVENT_TYPE = 1;

    private String mName;

    private String mDescription;

    private int mType;

    public CityEvent(String name, String description, int type) {
        this.mName = name;
        this.mDescription = description;
        this.mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        this.mType = type;
    }
}
