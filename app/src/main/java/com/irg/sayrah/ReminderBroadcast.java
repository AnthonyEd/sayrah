package com.irg.sayrah;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class ReminderBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notify")
                .setSmallIcon(R.drawable.ic_notif_24dp)
                .setContentTitle("Reminder")
                .setContentText("Remember to wash your hands 2 - 3 times everyday")
                .setPriority(NotificationCompat.PRIORITY_HIGH);


        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
        notificationManagerCompat.notify(200, builder.build());

    }
}
