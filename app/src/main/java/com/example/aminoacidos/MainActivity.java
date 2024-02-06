package com.example.aminoacidos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aminoacidos.Adapter.AdapterAminoacido;
import com.example.aminoacidos.Model.Aminoacido;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerViewAmino;
    private AdapterAminoacido adapterAminoacido;
    private List<Aminoacido> aminoacidoLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aminoacidoLista = new ArrayList<>();

        recyclerViewAmino = findViewById(R.id.recyclerView_Aminoacido);
        recyclerViewAmino.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerViewAmino.setHasFixedSize(true);
        adapterAminoacido = new AdapterAminoacido(aminoacidoLista);
        recyclerViewAmino.setAdapter(adapterAminoacido);

        Aminoacidos();
    }

    public void Aminoacidos(){

        Aminoacido Adrenaline = new Aminoacido(R.drawable.adrenaline, "Adrenaline", "Adr", "A");
        aminoacidoLista.add(Adrenaline);

        Aminoacido Arginine = new Aminoacido(R.drawable.arginine, "Arginine", "Ala", "A");
        aminoacidoLista.add(Arginine);

        Aminoacido AscorbicAcid = new Aminoacido(R.drawable.ascorbicacid, "Ascorbic Acid", "Arg", "A");
        aminoacidoLista.add(AscorbicAcid);

        Aminoacido Cysteine = new Aminoacido(R.drawable.cysteine, "Cysteine", "Cys", "C");
        aminoacidoLista.add(Cysteine);

        Aminoacido Dopamine = new Aminoacido(R.drawable.dopamine, "Dopamine", "Dop", "D");
        aminoacidoLista.add(Dopamine);

        Aminoacido Glutamine = new Aminoacido(R.drawable.glutamineacid, "Glutamine", "Glu", "G");
        aminoacidoLista.add(Glutamine);

        Aminoacido Glycine = new Aminoacido(R.drawable.glycine, "Histidine", "Gly", "G");
        aminoacidoLista.add(Glycine);

        Aminoacido Histidine = new Aminoacido(R.drawable.histidine, "Histidine", "His", "H");
        aminoacidoLista.add(Histidine);

        Aminoacido Isoleucine = new Aminoacido(R.drawable.isoleucine, "Isoleucine", "Ile", "I");
        aminoacidoLista.add(Isoleucine);

        Aminoacido Leucine = new Aminoacido(R.drawable.leucine, "Leucine", "Leu", "L");
        aminoacidoLista.add(Leucine);

        Aminoacido Lysine = new Aminoacido(R.drawable.lysine, "Lysine", "Lys", "L");
        aminoacidoLista.add(Lysine);

        Aminoacido Methionine = new Aminoacido(R.drawable.methionine, "Methionine", "Met", "M");
        aminoacidoLista.add(Methionine);

        Aminoacido Phenylalanin = new Aminoacido(R.drawable.phenylalanin, "Phenylalanin", "Phe", "P");
        aminoacidoLista.add(Phenylalanin);

        Aminoacido Proline = new Aminoacido(R.drawable.proline, "Proline", "Pro", "P");
        aminoacidoLista.add(Proline);

        Aminoacido Selenocysteine = new Aminoacido(R.drawable.selenocysteine, "Selenocysteine", "Sec", "S");
        aminoacidoLista.add(Selenocysteine);

        Aminoacido Selenomethionine = new Aminoacido(R.drawable.selenomethionine, "Selenomethionine", "SeMet", "S");
        aminoacidoLista.add(Selenomethionine);

        Aminoacido Serine = new Aminoacido(R.drawable.serine, "Serine", "Ser", "S");
        aminoacidoLista.add(Serine);

        Aminoacido Threonine = new Aminoacido(R.drawable.threonine, "Threonine", "Thr", "T");
        aminoacidoLista.add(Threonine);

        Aminoacido Tyrosine = new Aminoacido(R.drawable.tyrosine, "Tyrosine", "Tyr", "T");
        aminoacidoLista.add(Tyrosine);
    }
}