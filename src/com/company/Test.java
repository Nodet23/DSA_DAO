package com.company;

/**
 * Created by bsanche on 3/15/2017.
 */
public class Test
{
    public static void main(String[] args){
        Office o = new Office();
        o.insert();


        User u = new User();
        u.insert();
        u.update();
        u.select("palabra");
        u.delete();
        u.findAll();

        o.update();
        o.select("palabra");
        o.delete();
        o.findAll();

    }
}
