package com.quinto.pe3quintojustinramille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText company, country, industry, ceo;
    DBHelper helper;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DBHelper(this);

        company = findViewById(R.id.companyText);
        country = findViewById(R.id.countryText);
        industry = findViewById(R.id.industryText);
        ceo = findViewById(R.id.ceoText);
    }

    public void addRecord(View view){
        String companyString = company.getText().toString();
        String countryString = country.getText().toString();
        String industryString = industry.getText().toString();
        String ceoString = ceo.getText().toString();

        long isInserted = helper.insert(companyString, countryString, industryString, ceoString);

        if(isInserted == 1) {
            Toast.makeText(this, "Inserted", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Not Inserted", Toast.LENGTH_LONG).show();
        }
    }

    public void updateRecord(View view){
        String companyString = company.getText().toString();
        String countryString = country.getText().toString();
        String industryString = industry.getText().toString();
        String ceoString = ceo.getText().toString();

        long isInserted = helper.insert(companyString, countryString, industryString, ceoString);

        if(isInserted == 1) {
            Toast.makeText(this, "Inserted", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Not Inserted", Toast.LENGTH_LONG).show();
        }
    }

    public void deleteRecord(View view){
        String companyString = company.getText().toString();
        String countryString = country.getText().toString();
        String industryString = industry.getText().toString();
        String ceoString = ceo.getText().toString();

        long isInserted = helper.insert(companyString, countryString, industryString, ceoString);

        if(isInserted == 1) {
            Toast.makeText(this, "Inserted", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Not Inserted", Toast.LENGTH_LONG).show();
        }
    }

    public void moveFirst(View view){
        cursor = helper.getRecord();
        cursor.moveToFirst();

        company.setText(cursor.getString(1));
        country.setText(cursor.getString(2));
        industry.setText(cursor.getString(3));
        ceo.setText(cursor.getString(4));
    }

    public void moveLast(View view){
        cursor = helper.getRecord();
        cursor.moveToLast();

        company.setText(cursor.getString(1));
        country.setText(cursor.getString(2));
        industry.setText(cursor.getString(3));
        ceo.setText(cursor.getString(4));
    }

    public void moveNext(View view){
        cursor = helper.getRecord();
        cursor.moveToNext();

        company.setText(cursor.getString(1));
        country.setText(cursor.getString(2));
        industry.setText(cursor.getString(3));
        ceo.setText(cursor.getString(4));
    }

    public void movePrevious(View view){
        cursor = helper.getRecord();
        cursor.moveToPrevious();

        company.setText(cursor.getString(1));
        country.setText(cursor.getString(2));
        industry.setText(cursor.getString(3));
        ceo.setText(cursor.getString(4));
    }

    public void clear(View view) {
        company.setText(" ");
        country.setText(" ");
        industry.setText(" ");
        ceo.setText(" ");
    }

    public void nextPage(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
