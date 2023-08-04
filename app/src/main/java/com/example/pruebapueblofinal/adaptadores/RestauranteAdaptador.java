package com.example.pruebapueblofinal.adaptadores;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebapueblofinal.R;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;
import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    public ArrayList<RestauranteMolde> listaRest;

    //CONSTRUCTOR
    public RestauranteAdaptador(ArrayList<RestauranteMolde> listaRest) {
        this.listaRest = listaRest;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.updateInfo(listaRest.get(i));
    }

    @Override
    public int getItemCount() {
        return  listaRest.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotorest;
        TextView nomrest;
        TextView pricerest;

        public viewHolder(View item) {
            super(item);
            fotorest=item.findViewById(R.id.fotorestaurante);
            nomrest=item.findViewById(R.id.nombrerestaurante);
            pricerest=item.findViewById(R.id.preciosr);
        }

        public void updateInfo(RestauranteMolde restauranteMolde) {
            fotorest.setImageResource(restauranteMolde.getFoto());
            nomrest.setText(restauranteMolde.getNombre());
            pricerest.setText(restauranteMolde.getPrecio());
        }
    }

}
