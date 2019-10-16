package com.fcpc.traysi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class UserSelectionActivity extends AppCompatActivity {

    private ListView lvUserTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selection);

        initListView();
    }

    private void initListView(){

        lvUserTypes = findViewById(R.id.lvListType);

        String[] items = {"Driver","Passenger"};

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        lvUserTypes.setAdapter(itemsAdapter);

        lvUserTypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent().setClass(getApplicationContext(),DriverActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent().setClass(getApplicationContext(),PassengerActivity.class));
                        break;
                }
            }
        });



    }
}
