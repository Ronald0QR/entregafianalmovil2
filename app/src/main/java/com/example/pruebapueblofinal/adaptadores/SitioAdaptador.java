package com.example.pruebapueblofinal.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.pruebapueblofinal.R;
import com.example.pruebapueblofinal.moldes.SitioMolde;

import java.util.ArrayList;


public class SitioAdaptador extends RecyclerView.Adapter<SitioAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<SitioMolde> ListaSitios;

    //CONSTRUCTOR
    public SitioAdaptador(ArrayList<SitioMolde> ListSitio) {
        this.ListaSitios = ListSitio;
    }

    @NonNull
    @Override
    public SitioAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_molde_sitios,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.updateInfo(ListaSitios.get(i));
    }

    @Override
    public int getItemCount() {
        return  ListaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotositio;
        TextView nombresitio;
        TextView descsitio;

        public viewHolder(View item) {
            super(item);
            fotositio=item.findViewById(R.id.fotositio);
            nombresitio=item.findViewById(R.id.nombresitio);
            descsitio=item.findViewById(R.id.descsitio);
        }


        public void updateInfo(SitioMolde sitioMolde) {
            fotositio.setImageResource(sitioMolde.getFoto());
            nombresitio.setText(sitioMolde.getNombre());
            descsitio.setText(sitioMolde.getDesc());
        }
    }
}
