package com.example.tp2exo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;



import android.app.NotificationManager;

import android.content.Context;

import android.os.Bundle;

import android.view.View;

import android.widget.EditText;



import com.google.android.material.floatingactionbutton.FloatingActionButton;



public class SendMailActivity  extends AppCompatActivity  {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);

        Toolbar toolbar = findViewById(R.id.toolbar);


    }
       public void sendMail(String mail1,String message1 , String subject1) {

        String mail = mail1;
        String message = message1;
        String subject = subject1;

        //Send Mail
        JavaMailAPI javaMailAPI = new JavaMailAPI(this,mail,subject,message);

        javaMailAPI.execute();

    }

        public void sendNotification() {
        //Get an instance of NotificationManager//
        NotificationCompat.Builder mBuilder  = new NotificationCompat.Builder(this,"10");
        mBuilder.setSmallIcon(R.drawable.ic_stat_name);
        mBuilder.setContentTitle("My notification");
        mBuilder.setContentText("Hello World!");
        // Gets an instance of the NotificationManager service//
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(001, mBuilder.build());
    }








}
