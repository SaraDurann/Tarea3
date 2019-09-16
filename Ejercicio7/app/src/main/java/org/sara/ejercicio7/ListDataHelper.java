package org.sara.ejercicio7;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewitem> provideItem(){
        ArrayList<ListViewitem> list = new ArrayList<>();
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "android"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "child care"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "directions"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "directions subway"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "local aireport"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "notifications active"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "pan tool"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "record voice"));
        list.add(new ListViewitem(R.drawable.ic_ac_unit_black_24dp, "wb incandescent"));
        return list;

    }
}
