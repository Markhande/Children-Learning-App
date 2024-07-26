package com.example.ShishuGyan;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingActivity extends AppCompatActivity {
    private DrawingView drawingView;
    private Button btnRed, btnGreen, btnBlue, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_view);

        drawingView = new DrawingView(this, null);
        FrameLayout drawingFrame = findViewById(R.id.drawing_frame);
        drawingFrame.addView(drawingView);

        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);
        btnClear = findViewById(R.id.btnClear);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.changeColor(Color.RED);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.changeColor(Color.GREEN);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.changeColor(Color.BLUE);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.clearDrawing();
            }
        });
    }
}
