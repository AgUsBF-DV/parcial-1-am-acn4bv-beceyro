package com.example.viverodv;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
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

        // Listener del boton
        buttonAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct();
            }
        });
    }

    // Validar y cargar a la lista
    private void addProduct() {
        // Obtener data de los campos
        String name = editTextPlantName.getText().toString().trim();
        String type = editTextPlantType.getText().toString().trim();
        String price = editTextPlantPrice.getText().toString().trim();

        Log.e("MainActivity", "Nombre: " + name + ", Tipo: " + type + ", Precio: " + price);

        // Verificar si estan vacios
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(type) || TextUtils.isEmpty(price)) {
            //TODO: Generar advertencia al usuario
            return;
        }
        
        // TODO: Agrega la tarjeta del producto a la lista
        
        // Limpia los campos y enfoca el primero
        editTextPlantName.setText("");
        editTextPlantType.setText("");
        editTextPlantPrice.setText("");
        editTextPlantName.requestFocus();
    }
}