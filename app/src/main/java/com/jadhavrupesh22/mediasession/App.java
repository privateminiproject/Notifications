package com.jadhavrupesh22.mediasession;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    public static final String CHANEL_1_ID="Chinnel_1";


    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChinel();
    }

    public void createNotificationChinel(){

        if (Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
            NotificationChannel channel1=new NotificationChannel(CHANEL_1_ID,"Channel1" , NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("This is 1st Channel");
        }


    }

}
