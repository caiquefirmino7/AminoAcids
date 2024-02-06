package com.example.aminoacidos.Model;

public class Aminoacido {

    private int imagem;
    private String nome;
    private String abr3Letras;
    private String Abr1Letra;

    public Aminoacido(int imagem, String nome, String abr3Letras, String abr1Letra) {
        this.imagem = imagem;
        this.nome = nome;
        this.abr3Letras = abr3Letras;
        Abr1Letra = abr1Letra;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbr3Letras() {
        return abr3Letras;
    }

    public void setAbr3Letras(String abr3Letras) {
        this.abr3Letras = abr3Letras;
    }

    public String getAbr1Letra() {
        return Abr1Letra;
    }

    public void setAbr1Letra(String abr1Letra) {
        Abr1Letra = abr1Letra;
    }
}
