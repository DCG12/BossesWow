package com.example.user.bosseswow;


import nl.littlerobots.cupboard.tools.provider.CupboardContentProvider;
import static nl.qbusict.cupboard.CupboardFactory.cupboard;

public class WOWContentProvider extends CupboardContentProvider{

    public static final String AUTHORITY = BuildConfig.APPLICATION_ID + ".provider";

    static {
        cupboard().register(WOW.class);
    }

    public WOWContentProvider() {
        super(AUTHORITY, 1);
    }

}
