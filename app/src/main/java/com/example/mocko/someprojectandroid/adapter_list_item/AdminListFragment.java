package com.example.mocko.someprojectandroid.adapter_list_item;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.mocko.someprojectandroid.Data;
import com.example.mocko.someprojectandroid.R;

import java.util.ArrayList;

public class AdminListFragment extends Fragment
{
    private Data data;
    private MenuAdapter adapter;
    private ListView listView;

    View root;


    public AdminListFragment(){
        data = new Data();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new MenuAdapter(getActivity(),data.getListOfAdmins());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        root = inflater.inflate(R.layout.menu_list, container, false);

        adapter = new MenuAdapter(getActivity(),data.getListOfAdmins());
        listView = (ListView)root.findViewById(R.id.listID);
        listView.setAdapter(adapter);

        return root;
    }


    public void addItem(String strProfileName,int imageID,String strProfilePhone){
        data.getListOfAdmins().add(new MenuItem(strProfileName,imageID,strProfilePhone));
        onDestroyView();
    }


    @Override
    public void onDestroyView(){
        super.onDestroyView();
    }


    @Override
    public void onResume(){
        super.onResume();
    }


    public View getRoot() {
        return root;
    }


    public void setRoot(View root) {
        this.root = root;
    }


    public ListView getListView() {
        return listView;
    }
}
