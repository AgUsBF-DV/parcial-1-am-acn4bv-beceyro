package com.example.viverodv;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Campos/Elementos
    private EditText editTextPlantName;
    private EditText editTextPlantType;
    private EditText editTextPlantPrice;
    private Button buttonAddProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular java con XML
        editTextPlantName = findViewById(R.id.editTextPlantName);
        editTextPlantType = findViewById(R.id.editTextPlantType);
        editTextPlantPrice = findViewById(R.id.editTextPlantPrice);
        buttonAddProduct = findViewById(R.id.buttonAddProduct);
    }
}