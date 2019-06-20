package com.example.mocko.someprojectandroid.adapter_list_item;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mocko.someprojectandroid.R;

import java.util.ArrayList;


public class MenuFragment extends Fragment {

    private ArrayList<MenuItem> menuItems;

    public MenuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root =inflater.inflate(R.layout.menu_list, container, false);

        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Lociraj uređaj",R.drawable.location));
        menuItems.add(new MenuItem("Stanje računa",R.drawable.bill));
        menuItems.add(new MenuItem("Stanje baterije",R.drawable.battery));
        menuItems.add(new MenuItem("Uspavaj uređaj",R.drawable.sleep));
        menuItems.add(new MenuItem("Spisak admina",R.drawable.admin_list));
        menuItems.add(new MenuItem("Dodaj admina",R.drawable.add_admin));
        menuItems.add(new MenuItem("Oduzmi admina",R.drawable.battery));



        MenuAdapter adapter = new MenuAdapter(getActivity(),menuItems);
        ListView listView =(ListView) root.findViewById(R.id.listID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               MenuItem menuItem = menuItems.get(position);

               if(menuItem.getImageResource()==R.drawable.location){
                   Toast.makeText(getContext(),"Location",Toast.LENGTH_SHORT).show();
               }
               else if(menuItem.getImageResource()==R.drawable.bill){
                   Toast.makeText(getContext(),"Bill",Toast.LENGTH_SHORT).show();
               }
               else if(menuItem.getImageResource()==R.drawable.battery){
                    Toast.makeText(getContext(),"Battery",Toast.LENGTH_SHORT).show();
               }
               else if(menuItem.getImageResource()==R.drawable.sleep){
                   Toast.makeText(getContext(),"Sleep",Toast.LENGTH_SHORT).show();
               }
               else if(menuItem.getImageResource()==R.drawable.admin_list){
                   Toast.makeText(getContext(),"Admin list",Toast.LENGTH_LONG).show();
               }
               else if(menuItem.getImageResource()==R.drawable.add_admin){
                   Toast.makeText(getContext(),"Add Admin",Toast.LENGTH_LONG).show();
               }
               else if(menuItem.getImageResource()==R.drawable.battery){
                   Toast.makeText(getContext(),"Remove Admin",Toast.LENGTH_LONG).show();
               }

            }
        });
        return root;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
