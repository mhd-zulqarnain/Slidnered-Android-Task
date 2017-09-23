package com.testtode.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    private Button btnIns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        btnIns=(Button)findViewById(R.id.btnAdd);
        databaseHelper = new DatabaseHelper(this);

    }

    public void addNew(View v){
        Intent intent= new Intent(Contact.this,AddNewContact.class);
        startActivity(intent);
    }
}
