package com.example.mocko.someprojectandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mocko.someprojectandroid.adapter_list_item.AdminListFragment;
import com.example.mocko.someprojectandroid.adapter_list_item.MenuAdapter;
import com.example.mocko.someprojectandroid.adapter_list_item.MenuItem;
import com.example.mocko.someprojectandroid.sms_comunication.SmsSend;

import org.w3c.dom.Text;

public class AddAdminFragment extends Fragment implements View.OnClickListener {

    private AdminListFragment adminListFragment;
    private ProfileFragment profileFragment;

    private Button btnCreateProfile;
    private EditText profileName;
    private EditText profilePhone;
    private Data data;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        view= inflater.inflate(R.layout.fragment_add_admin, container, false);
        btnCreateProfile=(Button) view.findViewById(R.id.btn_create_profile);
        btnCreateProfile.setOnClickListener((View.OnClickListener) this);

        profileFragment = new ProfileFragment();

        adminListFragment = new AdminListFragment();

        data = new Data();

        return view;
    }

    @Override
    public void onClick(View v)
    {
        profileName = (EditText)view.findViewById(R.id.profile_name);
        profilePhone = (EditText)view.findViewById(R.id.profile_phone);

        //Ovde treba malo da se povde racuna sta i gde
        if(data.getListOfAdmins().size()<3) {
            SmsSend smsSend = new SmsSend();

            int imageID = R.drawable.menu_3_point;
            String strProfileName = profileName.getText().toString();
            String strProfilePhone = profilePhone.getText().toString();

            MenuItem menuItem =new MenuItem(strProfileName,imageID,strProfilePhone);

            data.addElemnt(menuItem);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.detach(adminListFragment).attach(adminListFragment).commit();
            //getFragmentManager().beginTransaction().detach(adminListFragment).attach(adminListFragment).commit();


            //smsSend.smsSendMessage(profilePhone.getText().toString(),"ADMIN.");
            Toast.makeText(getContext(),"Model je inicjalizovan",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getContext(),"Mozes najvise 3 uredjaja da pratis iz aplikacije",Toast.LENGTH_SHORT).show();
        }
    }
}
