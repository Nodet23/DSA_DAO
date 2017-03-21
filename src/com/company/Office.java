package com.company;

/**
 * Created by bsanche on 3/15/2017.
 */
public class Office extends AbstractDao {
    String name;
    String addresa;
    String dummyvaribale;

    public  Office(){}

    public Office(String name, String addresa) {
        this.name = name;
        this.addresa = addresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddresa() {
        return addresa;
    }

    public void setAddresa(String addresa) {
        this.addresa = addresa;
    }
}
