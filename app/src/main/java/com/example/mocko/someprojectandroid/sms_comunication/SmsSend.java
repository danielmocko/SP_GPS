package com.example.mocko.someprojectandroid.sms_comunication;

import android.app.PendingIntent;
import android.telephony.SmsManager;

import com.example.mocko.someprojectandroid.AddAdminFragment;
import com.example.mocko.someprojectandroid.MainActivity;

public class SmsSend {

    public void smsSendMessage(String phoneNumber, String smsBody) {

        AddAdminFragment fragment = new AddAdminFragment();
        MainActivity mainActivity = new MainActivity();

        //Kreira se referenca na editText_main u activity_main za unos telefonskog broja
        //EditText phoneNumber = (EditText) findViewById(R.id.editText_main);
        //U string destinationAddress se pokupi uneti broj iz phoneNumber
        String destinationAddress = phoneNumber.toString();
        //Kreira se smsBody koji refencira sms_message za unos koordinata
       // EditText smsBody = (EditText) findViewById(R.id.sms_message);
        //U string smsMessage se sadrzaj iz smsBody
        String smsMessage = smsBody;

        String scAddress = null;

        PendingIntent sentIntent = null, deliveryIntent = null;
        //Poziv metoda za proveru permisije

        //************************
        //Ovde bi trebao neki checkPermision da se pozove
        //************************


        //Kreiranje smsManager objekta za slanje poruke na drugi broj(u ovom slucaju na broj koji je u GPS lokatoru)
        SmsManager smsManager = SmsManager.getDefault();
       /*
        Poziv metode za slanje SMS poruke na GPS lokator
        @param destinationAddress :Boj telefona koji je pokupljen iz phoneNumber
        @param scAddress :Prosledjuje se null vrednost da bi se koristila default vrednost SMSC
                    SMSC vrednost je default vrednost u sistemskoj aplikaciji SMS-a
        @param smsMesssage :Za slanje sadrzaja poruke
        @param sentIntent :Objekat PendingIntent koji se koristi za proveru da li je poruka uspesno poslata
        @param deliveryIntent :Objekat PendingIntent koji se koristi za proveru da li je poruka uspesno isporucena
        */
        smsManager.sendTextMessage(destinationAddress, scAddress, smsMessage, sentIntent, deliveryIntent);
    }



}
