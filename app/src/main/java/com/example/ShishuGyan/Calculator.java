package com.example.ShishuGyan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {

    TextView tvDisplay;

    Button btnSeven, btnEight, btnNine, btnDivide, btnFour, btnFive, btnSix,
            btnMultiply, btnOne, btnTwo, btnThree, btnSubtract, btnZero, btnDecimal,
            btnEquals, btnAdd, btnClear;

    private String input = "";
    private String operator = "";
    private double firstNumber = 0;
    private double secondNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);

        tvDisplay = findViewById(R.id.tvDisplay);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDivide = findViewById(R.id.btnDivide);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnZero = findViewById(R.id.btnZero);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnEquals = findViewById(R.id.btnEquals);
        btnAdd = findViewById(R.id.btnAdd);
        btnClear = findViewById(R.id.btnClear);

        setNumberClickListeners();
        setOperatorClickListeners();
        setClearClickListener();
        setEqualsClickListener();
    }

    // Set number button click listeners
    private void setNumberClickListeners() {
        View.OnClickListener numberClickListener = view -> {
            Button button = (Button) view;
            input += button.getText().toString();
            tvDisplay.setText(input);
        };

        btnZero.setOnClickListener(numberClickListener);
        btnOne.setOnClickListener(numberClickListener);
        btnTwo.setOnClickListener(numberClickListener);
        btnThree.setOnClickListener(numberClickListener);
        btnFour.setOnClickListener(numberClickListener);
        btnFive.setOnClickListener(numberClickListener);
        btnSix.setOnClickListener(numberClickListener);
        btnSeven.setOnClickListener(numberClickListener);
        btnEight.setOnClickListener(numberClickListener);
        btnNine.setOnClickListener(numberClickListener);
        btnDecimal.setOnClickListener(numberClickListener);
    }

    // Set operator button click listeners
    private void setOperatorClickListeners() {
        View.OnClickListener operatorClickListener = view -> {
            if (!input.isEmpty()) {
                firstNumber = Double.parseDouble(input);
                input = "";
                Button button = (Button) view;
                operator = button.getText().toString();
                tvDisplay.setText(operator);
            }
        };

        btnAdd.setOnClickListener(operatorClickListener);
        btnSubtract.setOnClickListener(operatorClickListener);
        btnMultiply.setOnClickListener(operatorClickListener);
        btnDivide.setOnClickListener(operatorClickListener);
    }

    // Clear button logic
    private void setClearClickListener() {
        btnClear.setOnClickListener(view -> {
            input = "";
            operator = "";
            firstNumber = 0;
            secondNumber = 0;
            tvDisplay.setText("0");
        });
    }

    // Equals button logic
    private void setEqualsClickListener() {
        btnEquals.setOnClickListener(view -> {
            if (!input.isEmpty() && !operator.isEmpty()) {
                secondNumber = Double.parseDouble(input);
                double result = calculate(firstNumber, secondNumber, operator);
                tvDisplay.setText(String.valueOf(result));
                input = String.valueOf(result);
                operator = "";
            }
        });
    }

    // Calculation logic based on operator
    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    tvDisplay.setText("Error");
                    return 0;
                }
            default:
                return 0;
        }
    }
}
