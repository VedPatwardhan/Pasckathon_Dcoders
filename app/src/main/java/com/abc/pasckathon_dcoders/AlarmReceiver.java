package com.abc.pasckathon_dcoders;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent notificationIntent=new Intent(context, AcceptDeclineActivity.class);
        TaskStackBuilder stackBuilder=TaskStackBuilder.create(context);
        stackBuilder.addParentStack(NotificationActivity1.class);
        stackBuilder.addNextIntent(notificationIntent);

        PendingIntent pendingIntent=stackBuilder.getPendingIntent(100, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,"channel_id");

        NotificationCompat.Builder notification;
        notification = builder.setContentTitle("The Housepital Notification");
        notification.setContentText("Take your medicine");
        notification.setTicker("New message alert!");
        notification.setAutoCancel(true);
        notification.setSmallIcon(R.mipmap.ic_launcher);
        notification.setContentIntent(pendingIntent).build();

        NotificationManager notificationManager=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());


    }
}
