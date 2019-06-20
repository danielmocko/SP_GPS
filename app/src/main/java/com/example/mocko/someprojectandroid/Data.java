package com.example.mocko.someprojectandroid;

import com.example.mocko.someprojectandroid.adapter_list_item.MenuItem;

import java.util.ArrayList;

public class Data {

    private static ArrayList<MenuItem> listOfAdmins ;

    public Data(){
        listOfAdmins = new ArrayList<>();
    }


    public ArrayList<MenuItem> getListOfAdmins() {
        return listOfAdmins;
    }

    public void addElemnt(MenuItem menuItem){
        listOfAdmins.add(menuItem);
    }
}
