package com.ews.demoretrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ews.demoretrofit.R;
import com.ews.demoretrofit.model.Carro;

import java.util.List;

/**
 * Created by wallace on 21/06/17.
 */
public class CarroAdapter extends Adapter<CarroAdapter.CarrroViewHolder> {

    private List<Carro> carros;

    public CarroAdapter(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public CarrroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_carros, parent, false);
        return new CarrroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrroViewHolder holder, int position) {
        Carro carro = this.carros.get(position);
        holder.marca.setText(carro.getMarca());
        holder.modelo.setText(carro.getModelo());
        holder.ano.setText(String.valueOf(carro.getAno()));
    }

    @Override
    public int getItemCount() {
        return this.carros.size();
    }

    public static class CarrroViewHolder extends RecyclerView.ViewHolder {

        final TextView marca;
        final TextView modelo;
        final TextView ano;

        public CarrroViewHolder(View itemView) {
            super(itemView);
            marca = (TextView) itemView.findViewById(R.id.marca);
            modelo = (TextView) itemView.findViewById(R.id.modelo);
            ano = (TextView) itemView.findViewById(R.id.ano);
        }
    }

}
