package com.example.listadoccaaprovincias.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listadoccaaprovincias.R;
import com.example.listadoccaaprovincias.controlador.CCAAProvinciasController;
import com.example.listadoccaaprovincias.modelo.ComunidadAutonoma;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String PROVINCIAS_TEXTO = "Provincias de ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        ListView lvCCAA = findViewById(R.id.lvCCAA);
        CCAAProvinciasController.cargarDatos();
        List<ComunidadAutonoma> ccaa = CCAAProvinciasController.getCcaa();
        ArrayAdapter<String> adapterCCAA = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, CCAAProvinciasController.getCcaaString());
        lvCCAA.setAdapter(adapterCCAA);
        lvCCAA.setOnItemClickListener((parent, view, position, id) -> clickComunidadAutonoma(ccaa.get(position)));
    }

    private void clickComunidadAutonoma(ComunidadAutonoma ca) {
        ListView lvProvincias = findViewById(R.id.lvProvincias);
        TextView lblProvincias = findViewById(R.id.lblProvincias);
        String[] provincias = ca.getPrivincias();
        ArrayAdapter<String> adapterProvincias = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, provincias);
        lvProvincias.setAdapter(adapterProvincias);
        lblProvincias.setText(PROVINCIAS_TEXTO + ca + ":");
        lvProvincias.setOnItemClickListener((parent, view, position, id) -> clickProvincia(provincias[position]));
    }

    private void clickProvincia(String provincia) {
        Intent i = new Intent(this, WebViewActivity.class);
        i.putExtra("provincia", provincia);
        startActivity(i);
    }
}