package com.jadhavrupesh22.mediasession;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Printer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String CHANEL_1_ID="Chinnel_1";
    private static final String CHNNEL_NAME="simple_codding";
    private static final String CHNNEL_DESC="simple_codding";
    private static final int id=001;

    NotificationManagerCompat notificationManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context;
        notificationManager=NotificationManagerCompat.from(this);

    }




    private void displayNotificatoin(){

        Intent notify=new Intent(this,MainActivity.class);
        Context context;
        PendingIntent result=PendingIntent.getActivity(this, 1, notify, PendingIntent.FLAG_UPDATE_CURRENT);


        NotificationCompat.Builder mBuilder=new NotificationCompat.Builder(this, CHANEL_1_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("Whatsapp")
                .setContentText("This is my first Notification")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setContentIntent(result)

                ;

        notificationManager.notify(1,mBuilder.build());


    }


    public void NotifyMe(View view) {
        displayNotificatoin();
    }
}
