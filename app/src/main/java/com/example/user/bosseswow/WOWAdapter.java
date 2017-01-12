package com.example.user.bosseswow;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;
import android.databinding.DataBindingUtil;

import com.example.user.bosseswow.databinding.LvWowRowBinding;

public class WOWAdapter extends ArrayAdapter<WOW> {


    public WOWAdapter(Context context, int resource, List<WOW> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        WOW wow = getItem(position);
        Log.w("XXXX", wow.toString());

        LvWowRowBinding binding = null;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            binding = DataBindingUtil.inflate(inflater, R.layout.lv_wow_row, parent, false);
        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }


        binding.lvBossName.setText(wow.getName());
        binding.lvBossHealth.setText("vida: " + wow.getHealth());


        return binding.getRoot();
    }
}