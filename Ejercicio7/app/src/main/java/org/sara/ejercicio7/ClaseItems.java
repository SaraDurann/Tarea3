package org.sara.ejercicio7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ClaseItems extends AppCompatActivity {
    ListView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_items);
        listView = findViewById(R.id.ListView);
        ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItem());
    }

}
