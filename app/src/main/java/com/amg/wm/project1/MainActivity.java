package com.amg.wm.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.amg.wm.project1.utils.ArrayAdapterobj;
import com.amg.wm.project1.utils.LVObjects;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<LVObjects> objetos;
    private ListView lvCont;
    private ArrayAdapterobj adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCont = (ListView) findViewById(R.id.lvgeneral);

        objetos = new ArrayList<LVObjects>();
        insertValues(objetos);
        adapter = new ArrayAdapterobj(MainActivity.this, objetos);
        lvCont.setAdapter(adapter);
        lvCont.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Click on " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void insertValues(ArrayList<LVObjects> objetos) {
        objetos.add(new LVObjects("Item 0", R.drawable.boton));
        objetos.add(new LVObjects("Item 1", R.drawable.boton));
        objetos.add(new LVObjects("Item 2", R.drawable.boton));
        objetos.add(new LVObjects("Item 3", R.drawable.boton));
        objetos.add(new LVObjects("Item 4", R.drawable.boton));
        objetos.add(new LVObjects("Item 5", R.drawable.boton));
        objetos.add(new LVObjects("Item 6", R.drawable.boton));
        objetos.add(new LVObjects("Item 7", R.drawable.boton));
        objetos.add(new LVObjects("Item 8", R.drawable.boton));
        objetos.add(new LVObjects("Item 9", R.drawable.boton));
        objetos.add(new LVObjects("Item 10", R.drawable.boton));
    }
}
