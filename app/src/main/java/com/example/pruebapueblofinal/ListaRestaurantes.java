package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.adaptadores.RestauranteAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    //

    ArrayList<RestauranteMolde> listaRest = new ArrayList<>();
    RecyclerView recyclerRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listarestaurante);

        recyclerRest = findViewById(R.id.listarestaurante);
        recyclerRest.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRest);
        recyclerRest.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRest.add(new RestauranteMolde(R.drawable.comida1,"Restaurante","$ 12.900 COP"));
        listaRest.add(new RestauranteMolde(R.drawable.comida2,"Restaurante","$ 29.900 COP"));
        listaRest.add(new RestauranteMolde(R.drawable.comida3,"Restaurante","$ 79.900 COP"));
    }

}