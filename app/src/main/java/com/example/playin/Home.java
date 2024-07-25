package com.example.playin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
    LinearLayout layout;
    LinearLayout table;
    LinearLayout story;
    LinearLayout  drawing;
    LinearLayout games;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        layout=findViewById(R.id.layout_1);
        table=findViewById(R.id.table_layout);
        story=findViewById(R.id.story_layout);
        drawing=findViewById(R.id.drawing_layout);
        games=findViewById(R.id.games_layout);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Animal.class);
                startActivity(intent);
            }
        });
//       second layout coding
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Table.class);
                startActivity(intent);
            }
        });
//      Story layout coding
        story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), story.class);
                startActivity(intent);
            }
        });
//      drawing layout coding
        drawing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), DrawingActivity.class);
                startActivity(intent);
            }
        });
//       games layout coding
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.example.playin.games.class);
                startActivity(intent);
            }
        });
    }
}