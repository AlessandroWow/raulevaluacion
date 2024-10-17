package com.example.example;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class VentanaCosmeticoAgregado extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_ventana_cosmetico_agregado);
    }
    public void onClickVentana(View view){
        Intent intent = new Intent(this, VentanaCosmeticoAgregado.class);
        startActivity(intent);
    }
}
