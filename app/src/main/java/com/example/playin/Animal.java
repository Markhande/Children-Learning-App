package com.example.playin;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animal extends AppCompatActivity {
    ImageView button;
    private MediaPlayer mediaPlayer;
    ImageView cat;
    private MediaPlayer cat_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);

        button= findViewById(R.id.playSoundButton);
        cat= findViewById(R.id.cat);

        mediaPlayer = MediaPlayer.create(this, R.raw.dog);
        cat_sound =   MediaPlayer.create(this,R.raw.cat);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
            }

        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cat_sound != null){
                    cat_sound.start();
                }
            }
        });
    }

}