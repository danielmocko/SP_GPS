package com.example.mocko.someprojectandroid.adapter_list_item;

import android.widget.TextView;

public class MenuItem {
    private static final String NO_TEXT_VIEW_PROVIDED=null;

    private String firstTextItem;
    private String secondTextView=NO_TEXT_VIEW_PROVIDED;
    private int imageResource;


    public MenuItem(String firstTextItem,int imageResource){
        this.firstTextItem=firstTextItem;
        this.imageResource=imageResource;
    }

    public MenuItem(String firstTextItem,int imageResource,String secondTextView){
        this(firstTextItem,imageResource);
        this.secondTextView=secondTextView;
    }
    public boolean hasSecondTextView(){
        return secondTextView != NO_TEXT_VIEW_PROVIDED;
    }

    public String getItemName(){
        return firstTextItem;
    }

    public int getImageResource(){
        return imageResource;
    }

    public void setItemName(String itemName){
        this.firstTextItem=itemName;
    }

    public void setImageResource(int imageResource){
        this.imageResource=imageResource;
    }


    public String getSecondTextView() {
        return secondTextView;
    }

    public void setSecondTextView(String secondTextView) {
        this.secondTextView = secondTextView;
    }
}
