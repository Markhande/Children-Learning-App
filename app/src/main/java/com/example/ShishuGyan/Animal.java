package com.example.ShishuGyan;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

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
    ImageView lion;
    private  MediaPlayer lion_sound;
    ImageView bull;
    private  MediaPlayer bull_sound;
    ImageView Snake;
    private MediaPlayer snake_sound;
    ImageView fox;
    private MediaPlayer fox_sound;
    ImageView zebra;
    private MediaPlayer zebra_sound;
    ImageView goat;
    private MediaPlayer goat_sound;
    ImageView giraffe;
    private MediaPlayer giraffe_sound;
    ImageView donkey;
    private MediaPlayer donkey_sound;
    ImageView eagle;
    private MediaPlayer eagle_sound;
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
        lion=findViewById(R.id.lion);
        bull=findViewById(R.id.bull);
        Snake=findViewById(R.id.snake);
        fox=findViewById(R.id.fox);
        zebra = findViewById(R.id.zebbra);
        goat= findViewById(R.id.goat);
        giraffe=findViewById(R.id.giraffe);
        donkey=findViewById(R.id.donkey);
        eagle=findViewById(R.id.eagle);

        mediaPlayer =  MediaPlayer.create(this, R.raw.dog);
        cat_sound   =  MediaPlayer.create(this,R.raw.cat);
        cow_sound   =  MediaPlayer.create(this, R.raw.cow);
        tiger_sound =  MediaPlayer.create(this,R.raw.tiger);
        elephant_sound = MediaPlayer.create(this, R.raw.elephant);
        mokey_sound = MediaPlayer.create(this, R.raw.monkey);
        lion_sound = MediaPlayer.create(this,R.raw.lion);
        bull_sound = MediaPlayer.create(this,R.raw.bull);
        snake_sound = MediaPlayer.create(this,R.raw.snake);
        fox_sound = MediaPlayer.create(this,R.raw.fox);
        zebra_sound = MediaPlayer.create(this,R.raw.zebra);
        goat_sound= MediaPlayer.create(this,R.raw.goat);
        giraffe_sound= MediaPlayer.create(this,R.raw.giraffe);
        donkey_sound=MediaPlayer.create(this,R.raw.donkey);
        eagle_sound=MediaPlayer.create(this,R.raw.eagle);

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
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lion_sound != null)
                lion_sound.start();
            }
        });
        bull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bull_sound != null)
                bull_sound.start();
            }
        });
        Snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bull_sound != null)
                snake_sound.start();
            }
        });
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fox != null)
                    fox_sound.start();
            }
        });
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zebra_sound.start();
            }
        });
        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goat_sound != null)
                    goat_sound.start();
            }
        });
        giraffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(giraffe_sound != null)
                giraffe_sound.start();
            }
        });
        donkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(donkey_sound != null)
                    donkey_sound.start();
            }
        });
        eagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eagle_sound != null)
                    eagle_sound.start();
            }
        });
    }
}