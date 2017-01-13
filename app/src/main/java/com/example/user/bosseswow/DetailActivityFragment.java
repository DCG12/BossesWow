package com.example.user.bosseswow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.databinding.DataBindingUtil;
import com.example.user.bosseswow.databinding.FragmentDetailBinding;


public class DetailActivityFragment extends Fragment {

    private FragmentDetailBinding binding;
    public DetailActivityFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_detail, container, false);
        View view = binding.getRoot();

        Intent i = getActivity().getIntent();

        if (i != null) {
            WOW wow = (WOW) i.getSerializableExtra("wow");

            if (wow != null) {
                updateUi(wow);
            }
        }

        return view;
    }


    private void updateUi(WOW wow) {
        Log.d("WOW", wow.toString());

        binding.lvBossName.setText(wow.getName());
        binding.lvBossLevel.setText(Html.fromHtml("<b>Nivel:</b> " + wow.getLevel()));
        binding.lvBossHealth.setText(Html.fromHtml("<b>Vida:</b> " + wow.getHealth()));
        binding.lvHeroicLevel.setText(Html.fromHtml("<b>Nivel modo heroico:</b> " + wow.getHeroiclevel()));
        binding.lvHeroicHealth.setText(Html.fromHtml("<b>Vida modo heroico:</b> " + wow.getHeroichealth()));
        binding.lvBossDescription.setText(Html.fromHtml("<b>Descripción:</b> " + wow.getDescription()));

    }
}
