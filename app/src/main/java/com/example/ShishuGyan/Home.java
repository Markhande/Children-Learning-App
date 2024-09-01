package com.example.ShishuGyan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    LinearLayout layout,table,story,drawing,games,wiki,calci;
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
        wiki =findViewById(R.id.wiki_layout);
        calci = findViewById(R.id.calci_layout);

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
//       Games layout coding
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Games.class);
                startActivity(intent);
            }
        });
        wiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),com.example.ShishuGyan.wiki.class);
                startActivity(intent);
            }
        });
        calci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),com.example.ShishuGyan.Calculator.class);
                startActivity(intent);
            }
        });

    }
}