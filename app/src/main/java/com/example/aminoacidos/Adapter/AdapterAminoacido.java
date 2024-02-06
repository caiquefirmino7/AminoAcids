package com.example.aminoacidos.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aminoacidos.Model.Aminoacido;
import com.example.aminoacidos.R;

import java.util.List;

public class AdapterAminoacido extends RecyclerView.Adapter<AdapterAminoacido.AminoacidoViewHolder>{

    public AdapterAminoacido(List<Aminoacido> aminoacidoLista) {
        this.aminoacidoLista = aminoacidoLista;
    }

    private List<Aminoacido> aminoacidoLista;

    public void setAminoacidoLista(List<Aminoacido> aminoacidoLista) {
        this.aminoacidoLista = aminoacidoLista;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AminoacidoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View aminoView = LayoutInflater.from(parent.getContext()).inflate(R.layout.aminoacido_item, parent, false);

        return  new AminoacidoViewHolder(aminoView);
    }

    @Override
    public void onBindViewHolder(@NonNull AminoacidoViewHolder holder, int position) {

       Aminoacido aminoacido = aminoacidoLista.get(position);

        holder.imagem.setImageResource(aminoacido.getImagem());
        holder.nome.setText(aminoacido.getNome());
        holder.abr3Letras.setText(aminoacido.getAbr3Letras());
        holder.abr1Letra.setText(aminoacido.getAbr1Letra());
    }

    @Override
    public int getItemCount() {
        return aminoacidoLista.size();
    }

    public static class AminoacidoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagem;
        private TextView nome;
        private TextView abr3Letras;
        private TextView abr1Letra;

        public AminoacidoViewHolder(@NonNull View itemView) {
            super(itemView);

            imagem = itemView.findViewById(R.id.imageView);
            nome = itemView.findViewById(R.id.textName);
            abr3Letras = itemView.findViewById(R.id.textAbr3Letras);
            abr1Letra = itemView.findViewById(R.id.textAbr1letra);
        }
    }



}
