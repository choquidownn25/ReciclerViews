package com.sipingenieria.prueba.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sipingenieria.prueba.MainActivity;
import com.sipingenieria.prueba.R;
import com.sipingenieria.prueba.modelo.SipIngenierium;

import java.util.ArrayList;
import java.util.List;


public class DataAdapter extends RecyclerView.Adapter <DataAdapter.ViewHolder>{

    private List<SipIngenierium> sipIngenieriums;
    private Context context;

    public DataAdapter(Context context, List<SipIngenierium> sipIngenieriums) {
        this.context = context;
        this.sipIngenieriums=sipIngenieriums;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int i) {

        holder.tv_oee.setText(sipIngenieriums.get(i).getOee());
        holder.tv_capacidad.setText(sipIngenieriums.get(i).getCapacidad());

        holder.tv_oee.setText(sipIngenieriums.get(i).getOee());
        holder.tv_capacidad.setText(sipIngenieriums.get(i).getCapacidad());

        holder.tv_fecha.setText(sipIngenieriums.get(i).getFecha());
        holder.tv_maquina.setText(sipIngenieriums.get(i).getMaquina());

        holder.tv_oee.setText(sipIngenieriums.get(i).getOee());
        holder.tv_rendimiento.setText(sipIngenieriums.get(i).getRendimiento());
        holder.tv_calidad.setText(sipIngenieriums.get(i).getCalidad());
    }



    @Override
    public int getItemCount() {
        return sipIngenieriums.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_oee;
        TextView tv_capacidad;
        TextView tv_fecha;
        TextView tv_maquina;
        TextView tv_rendimiento;
        TextView tv_calidad;


        public ViewHolder(@NonNull View view) {
            super(view);
            tv_oee = (TextView) view.findViewById(R.id.tv_oee);
            tv_capacidad = (TextView) view.findViewById(R.id.tv_capacidad);
            tv_fecha = (TextView) view.findViewById(R.id.tv_fecha);

            tv_maquina = (TextView) view.findViewById(R.id.tv_maquina);
            tv_rendimiento = (TextView) view.findViewById(R.id.tv_rendimiento);
            tv_calidad = (TextView) view.findViewById(R.id.tv_calidad);


        }
    }
}
