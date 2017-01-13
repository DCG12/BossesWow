package com.example.user.bosseswow;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import com.alexvasilkov.events.Events;
import java.util.ArrayList;

public class RefreshDataTask extends AsyncTask<Void, Void, Void>{

    private Context context;


    RefreshDataTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Events.post("start-downloading-data");
    }

    @Override
    protected Void doInBackground(Void... voids) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());

        ArrayList<WOW> result;

            result = APIWOW.getInfoBoss();

        Log.d("DEBUG", result != null ? result.toString() : null);


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        Dialog dialog = null;
        dialog.dismiss();
    }

    public Context getContext() {
        return context;
    }
}
