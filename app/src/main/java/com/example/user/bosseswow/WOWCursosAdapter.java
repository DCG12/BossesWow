package com.example.user.bosseswow;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.bosseswow.databinding.LvWowRowBinding;


public class WOWCursosAdapter extends CupboardCursorAdapter<WOW>{

    private LvWowRowBinding binding;

    public WOWCursosAdapter(Context context, Class<WOW> entityClass) {
        super(context, entityClass);
    }

    @Override
    public View newView(Context context, WOW model, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
         binding = DataBindingUtil.inflate(
                inflater, R.layout.lv_wow_row, parent, false);

        return binding.getRoot();
    }

    @Override
    public void bindView(View view, Context context, WOW model) {
        binding = DataBindingUtil.getBinding(view);
        binding.lvBossName.setText(model.getName());
        binding.lvBossHealth.setText("Vida:  " + model.getHealth());

    }
}
