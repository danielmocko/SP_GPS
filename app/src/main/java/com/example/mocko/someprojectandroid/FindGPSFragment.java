package com.example.mocko.someprojectandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mocko.someprojectandroid.sms_comunication.SmsSend;


public class FindGPSFragment extends Fragment implements View.OnClickListener{
    View view;
    Button btnActiveGPS;

    public FindGPSFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_find_g, container, false);
       btnActiveGPS = (Button)view.findViewById(R.id.find_gps);
       btnActiveGPS.setOnClickListener((View.OnClickListener)this);
       return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(),"Kliknuo",Toast.LENGTH_LONG).show();
    }

    public void findGPS(){
        SmsSend smsSend = new SmsSend();
        AddAdminFragment profileFragment = new AddAdminFragment();
       // smsSend.smsSendMessage(profileFragment.getPhoneNumber().getText().toString(),"ADMIN.");
    }
}
