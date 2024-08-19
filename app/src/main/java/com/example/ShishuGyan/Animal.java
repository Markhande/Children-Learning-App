package com.example.ShishuGyan;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Animal extends AppCompatActivity {

    ImageView
            dog,    cat,    cow,    tiger,  elephant,   monkey,
            lion,   bull,   Snake,  fox,    zebra,      goat,
            giraffe,donkey, eagle;

    private MediaPlayer currentMediaPlayer;
    Vibrator vibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);

        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        cow = findViewById(R.id.cow);
        tiger = findViewById(R.id.tiger);
        elephant = findViewById(R.id.elephant);
        monkey = findViewById(R.id.monkey);
        lion = findViewById(R.id.lion);
        bull = findViewById(R.id.bull);
        Snake = findViewById(R.id.snake);
        fox = findViewById(R.id.fox);
        zebra = findViewById(R.id.zebbra);
        goat = findViewById(R.id.goat);
        giraffe = findViewById(R.id.giraffe);
        donkey = findViewById(R.id.donkey);
        eagle = findViewById(R.id.eagle);

        vibrate = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.dog);
                performVibration();
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.cat);
                performVibration();
            }
        });

        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.cow);
                performVibration();
            }
        });

        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.tiger);
                performVibration();
            }
        });

        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.elephant);
                performVibration();
            }
        });

        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.monkey);
                performVibration();
            }
        });

        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.lion);
                performVibration();
            }
        });

        bull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.bull);
                performVibration();
            }
        });

        Snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.snake);
                performVibration();
            }
        });

        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.fox);
                performVibration();
            }
        });

        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.zebra);
                performVibration();
            }
        });

        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.goat);
                performVibration();
            }
        });

        giraffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.giraffe);
                performVibration();
            }
        });

        donkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.donkey);
                performVibration();
            }
        });

        eagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimalSound(R.raw.eagle);
                performVibration();
            }
        });
    }

    private void playAnimalSound(int soundResource) {
        // Stop and release the current MediaPlayer if it's playing
        if (currentMediaPlayer != null) {
            currentMediaPlayer.stop();
            currentMediaPlayer.release();
        }

        // Create and start a new MediaPlayer instance
        currentMediaPlayer = MediaPlayer.create(this, soundResource);
        currentMediaPlayer.start();
    }

    private void performVibration() {
        if (vibrate != null) {
            VibrationEffect vibrationEffect = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrate.vibrate(vibrationEffect);
        }
    }
}