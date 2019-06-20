package com.example.mocko.someprojectandroid.adapter_list_item;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mocko.someprojectandroid.R;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter<MenuItem>
{
    public MenuAdapter(Context context){
        super(context,0);
    }

    public MenuAdapter(Context context, ArrayList<MenuItem> menuItems)
    {
        super(context,0,menuItems);
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_menu,parent,false);
        }


        MenuItem currentMenuItem = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageItem);
        imageView.setImageResource(currentMenuItem.getImageResource());

        TextView firstTextView = (TextView) listItemView.findViewById(R.id.firstTextItem);
        firstTextView.setText(currentMenuItem.getItemName());

        TextView secondTextView = (TextView) listItemView.findViewById(R.id.secondTextItem);
        if(currentMenuItem.hasSecondTextView())
        {
            secondTextView.setText(currentMenuItem.getSecondTextView());
            secondTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            secondTextView.setVisibility(View.GONE);
        }

        return  listItemView;
    }
}
