package com.example.user.bosseswow;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;

public class WOWAdapter extends ArrayAdapter<WOW> {

    public WOWAdapter(Context context, int resource, List<WOW> objects) {
        super(context, resource, objects);
    }

}
