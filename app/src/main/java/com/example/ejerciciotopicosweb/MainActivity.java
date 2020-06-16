package com.example.ejerciciotopicosweb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ListView listview;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        names = new ArrayList<String>();
        names.add("Aguascalientes");
        names.add("Baja California");
        names.add("Baja California Sur");
        names.add("Campeche");
        names.add("Chiapas");
        names.add("Chihuahua");
        names.add("Coahuila");
        names.add("Colima");
        names.add("CDMX");
        names.add("Durango");
        names.add("Estado De México");
        names.add("Guanajuato");
        names.add("Guerrero");
        names.add("Hidalgo");
        names.add("Jalisco");
        names.add("Michoacán");
        names.add("Morelos");
        names.add("Nayarit");
        names.add("Nuevo León");
        names.add("Oaxaca");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Has pulsado "+names.get(position),Toast.LENGTH_LONG).show();
            }
        });
        MyAdapter myAdapter = new MyAdapter(this,R.layout.list_item,names);
        listview.setAdapter(myAdapter);
    }
}
