package com.example.yasaicard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCreateNewCard;
    private Button btnListCards;
    private Button btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Flash Card Create Button
        btnCreateNewCard = (Button) findViewById(R.id.btn_CreateFlashCard);
        btnCreateNewCard.setOnClickListener(MainActivity.this);

        // List Card Button
        btnListCards = (Button) findViewById(R.id.btn_ListCard);
        btnListCards.setOnClickListener(MainActivity.this);

        // Setting Button
        btnSetting = (Button) findViewById(R.id.btn_Setting);
        btnSetting.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {

        if (v == btnCreateNewCard) {
            // Goto Create New Card Screen
            Intent intent = new Intent(MainActivity.this, AddNewCardActivity.class);
            // start the activity
            startActivity(intent);

        } else if ( v == btnListCards) {
            // Goto ListCards Screen
            Intent intent = new Intent(MainActivity.this, ListCardsSetActivity.class);
            // start the activity
            startActivity(intent);

        } else if( v == btnSetting) {
            // Goto Setting Screen
            //Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            // start the activity
            startActivity(intent);
        }
    }

}
