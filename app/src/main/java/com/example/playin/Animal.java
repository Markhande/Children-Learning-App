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

import java.security.PrivateKey;

public class Animal extends AppCompatActivity {
    ImageView dog;
    private MediaPlayer mediaPlayer;
    ImageView cat;
    private MediaPlayer cat_sound;
    ImageView cow;
    private MediaPlayer cow_sound;
    ImageView tiger;
    private MediaPlayer tiger_sound;
    ImageView elephant;
    private MediaPlayer elephant_sound;
    ImageView monkey;
    private MediaPlayer mokey_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);

        dog= findViewById(R.id.dog);
        cat= findViewById(R.id.cat);
        cow=findViewById(R.id.cow);
        tiger=findViewById(R.id.tiger);
        elephant=findViewById(R.id.elephant);
        monkey =findViewById(R.id.monkey);

        mediaPlayer =  MediaPlayer.create(this, R.raw.dog);
        cat_sound   =  MediaPlayer.create(this,R.raw.cat);
        cow_sound   =  MediaPlayer.create(this, R.raw.cow);
        tiger_sound =  MediaPlayer.create(this,R.raw.tiger);
        elephant_sound = MediaPlayer.create(this, R.raw.elephant);
        mokey_sound = MediaPlayer.create(this, R.raw.monkey);

        dog.setOnClickListener(new View.OnClickListener() {
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
        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cow_sound != null){
                    cow_sound.start();
                }
            }
        });
        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiger_sound != null)
                {
                    tiger_sound.start();
                }
            }
        });
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(elephant_sound != null)
                elephant_sound.start();
            }
        });
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mokey_sound.start();
            }
        });
    }
}