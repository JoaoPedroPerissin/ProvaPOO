package br.com.starlog.model;

public class Carga {
    private String codigoRastreio;
    private String categoria;
    private double pesoKg;
    private double valorSeguro;

    public Carga(String codigoRastreio, String categoria, double pesoKg, double valorSeguro) {
        if(codigoRastreio == null || codigoRastreio.trim().isEmpty())
            throw new IllegalArgumentException("Codigo de rastreio da carga nao pode ser nulo ou vazio.");
        this.codigoRastreio = codigoRastreio;
        this.categoria = categoria;
        this.pesoKg = pesoKg;
        this.valorSeguro = valorSeguro;
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }


    public String getCategoria() {
        return categoria;
    }


    public double getPesoKg() {
        return pesoKg;
    }


    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public String toString() {
        return "Carga [codigoRastreio=" + codigoRastreio + ", categoria=" + categoria + ", pesoKg=" + pesoKg
                + ", valorSeguro=" + valorSeguro + "]";
    }
}
