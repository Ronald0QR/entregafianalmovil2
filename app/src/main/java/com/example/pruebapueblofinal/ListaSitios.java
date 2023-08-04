package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.pruebapueblofinal.adaptadores.SitioAdaptador;
import com.example.pruebapueblofinal.moldes.SitioMolde;
import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    //
    ArrayList<SitioMolde> ListaSitios = new ArrayList<>();
    RecyclerView recyclerSitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerSitos = findViewById(R.id.listaHoteles);
        recyclerSitos.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        SitioAdaptador adaptador = new SitioAdaptador(ListaSitios);
        recyclerSitos.setAdapter(adaptador);
    }

    public void crearLista() {
        ListaSitios.add(new SitioMolde( R.drawable.sitio1 ,"Linda Calle", "as" ));
        ListaSitios.add(new SitioMolde( R.drawable.sitio4 ,"Diferente","Igual a todas"));
        ListaSitios.add(new SitioMolde( R.drawable.sitio3, "Marav","Elegate" ));
        ListaSitios.add(new SitioMolde( R.drawable.sitio4 ," Bribracatateo","Bonito" ));
        ListaSitios.add(new SitioMolde( R.drawable.sitio3, " Diamante","Hermos"));
    }

}