package com.example.user.bosseswow;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import java.util.ArrayList;
import nl.littlerobots.cupboard.tools.provider.UriHelper;
import static nl.qbusict.cupboard.CupboardFactory.cupboard;

public class DataManager {

    private static UriHelper URI_HELPER = UriHelper.with(WOWContentProvider.AUTHORITY);
    private static Uri CARD_URI = URI_HELPER.getUri(WOW.class);

    static void saveCards(ArrayList<WOW> cards, Context context) {
        cupboard().withContext(context).put(CARD_URI, WOW.class, cards);
    }

    static void deleteCards(Context context) {
        cupboard().withContext(context).delete(CARD_URI, "_id > ?", "0");
    }

    static CursorLoader getCursorLoader(Context context) {
        return new CursorLoader(context, CARD_URI, null, null, null, null);
    }

}
