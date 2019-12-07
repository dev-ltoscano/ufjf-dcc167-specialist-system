package com.ufjf.specialist.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ltosc
 */
public class Animal
{
    private static final List<Animal> ANIMAL_LIST = new ArrayList<>();
    
    public Animal() { }

    public Animal(    
		  String especie,
		  String raca,
		  int[] expVida,
		  Intensidade porte,
		  int[] altura,
		  int[] peso,
		  Moradia idealPara,
		  Temperamento temperamento,
		  Intensidade barulhento,
		  Amigavel amigavel,
		  Intensidade alergicos,
		  Intensidade cuidados,
		  Intensidade territorialista,
		  Intensidade treinamento,
		  Perfil perfil,
		  Doencas doencas,
		  double preco) { 
			this.especie = especie;
			this.raca = raca;
			this.expVida = expVida;
			this.porte = porte;
			this.altura = altura;
			this.peso = peso;
			this.idealPara = idealPara;
			this.temperamento = temperamento;
			this.barulhento = barulhento;
			this.amigavel = amigavel;
			this.alergicos = alergicos;
			this.cuidados = cuidados;
			this.territorialista = territorialista;
			this.treinamento = treinamento;
			this.perfil = perfil;
			this.doencas = doencas;
			this.preco = preco;
		}
    
    public Animal(String especie)
    {
        this.especie = especie;
    }
    
    public static void makeListOfAnimals()
    {
        ANIMAL_LIST.clear();
        
        int auxVida[] = {13, 16};
        int auxAltura[] = {33, 39};
        int auxPeso[] = {9, 35};
        
        ANIMAL_LIST.add(new Animal(
                "Cão",
                "Beagle",
                auxVida,
                Intensidade.Medio,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Alto,
                Intensidade.Medio,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Perfil.Caca_Companheiro,
                Doencas.Oftalmicas_Coluna,
                2500
        ));

        auxVida = new int[]{8, 12};
        auxAltura = new int[]{53, 63};
        auxPeso = new int[]{25, 30};

        ANIMAL_LIST.add(new Animal(
                "Cão",
                "Boxer",
                auxVida,
                Intensidade.Medio,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Medio,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Perfil.Guarda_Companheiro,
                Doencas.Cardiacas_Respiratorias_Surdez,
                 8000
        ));

        auxVida = new int[]{12, 20};
        auxAltura = new int[]{16, 20};
        auxPeso = new int[]{1, 3};

        ANIMAL_LIST.add(new Animal(
                "Cão",
                "Chihuahua",
                auxVida,
                Intensidade.Medio,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Hostil,
                Intensidade.Medio,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Intensidade.Alto,
                Intensidade.Alto,
                Perfil.Companheiro,
                Doencas.Oftalmicas_Reumaticas,
                 2000
        ));

        auxVida = new int[]{10, 12};
        auxAltura = new int[]{51, 61};
        auxPeso = new int[]{25, 32};

        ANIMAL_LIST.add(new Animal(
                "Cão",
                "Golden Retriever",
                auxVida,
                Intensidade.Alto,
                auxAltura,
                auxPeso,
                Moradia.Casa,
                Temperamento.Docil,
                Intensidade.Medio,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Alto,
                Intensidade.Medio,
                Intensidade.Alto,
                Intensidade.Alto,
                Perfil.Guia_Companheiro,
                Doencas.Oftalmicas_Reumaticas,
                 4500
        ));

        auxVida = new int[]{8, 10};
        auxAltura = new int[]{56, 68};
        auxPeso = new int[]{46, 50};

        ANIMAL_LIST.add(new Animal(
                "Cão",
                "Rottweiler",
                auxVida,
                Intensidade.Alto,
                auxAltura,
                auxPeso,
                Moradia.Casa,
                Temperamento.Hostil,
                Intensidade.Alto,
                Amigavel.Nao,
                Intensidade.Baixo,
                Intensidade.Alto,
                Intensidade.Medio,
                Intensidade.Alto,
                Perfil.Guarda_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                6000
        ));

        auxVida = new int[]{8, 10};
        auxAltura = new int[]{20, 25};
        auxPeso = new int[]{4, 5};

        ANIMAL_LIST.add(new Animal(
                "Gato",
                "Angorá",
                auxVida,
                Intensidade.Baixo,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Alto,
                Intensidade.Alto,
                Intensidade.Baixo,
                Intensidade.Alto,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                800
        ));

        auxVida = new int[]{8, 9};
        auxAltura = new int[]{40, 52};
        auxPeso = new int[]{9, 11};

        ANIMAL_LIST.add(new Animal(
                "Gato",
                "Ragdoll",
                auxVida,
                Intensidade.Medio,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Alto,
                Intensidade.Baixo,
                Intensidade.Alto,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                700
        ));

        auxVida = new int[]{13, 15};
        auxAltura = new int[]{20, 22};
        auxPeso = new int[]{3, 5};

        ANIMAL_LIST.add(new Animal(
                "Gato",
                "Siamês",
                auxVida,
                Intensidade.Baixo,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Hostil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Alto,
                Intensidade.Baixo,
                Intensidade.Alto,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                800
        ));

        auxVida = new int[]{30, 70};
        auxAltura = new int[]{16, 22};
        auxPeso = new int[]{4, 7};

        ANIMAL_LIST.add(new Animal(
                "Ave",
                "Papagaio",
                auxVida,
                Intensidade.Baixo,
                auxAltura,
                auxPeso,
                Moradia.Apartamento_Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Alto,
                Intensidade.Baixo,
                Intensidade.Medio,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                800
        ));

        auxVida = new int[]{5, 10};
        auxAltura = new int[]{16, 22};
        auxPeso = new int[]{4, 7};

        ANIMAL_LIST.add(new Animal(
                "Ave",
                "Periquito Australiano",
                auxVida,
                Intensidade.Baixo,
                auxAltura,
                auxPeso,
                Moradia.Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Alto,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                25
        ));

        auxVida = new int[]{7, 9};
        auxAltura = new int[]{16, 22};
        auxPeso = new int[]{4, 7};

        ANIMAL_LIST.add(new Animal(
                "Coelho",
                null,
                auxVida,
                Intensidade.Medio,
                auxAltura,
                auxPeso,
                Moradia.Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Intensidade.Alto,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                100
        ));

        auxVida = new int[]{7, 9};
        auxAltura = new int[]{16, 22};
        auxPeso = new int[]{4, 7};

        ANIMAL_LIST.add(new Animal(
                "Peixe",
                null,
                auxVida,
                Intensidade.Baixo,
                auxAltura,
                auxPeso,
                Moradia.Casa,
                Temperamento.Docil,
                Intensidade.Alto,
                Amigavel.Criancas_OutrosPets_Estranhos,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Intensidade.Baixo,
                Intensidade.Alto,
                Perfil.Caca_Companheiro,
                Doencas.Cardiacas_Oftalmicas,
                20
        ));
    }
    
    public static List<Animal> getAnimalList()
    {
        return ANIMAL_LIST;
    }
    
    private String especie;
    private String raca;
    private int[] expVida;
    private Intensidade porte;
    private int[] altura;
    private int[] peso;
    private Moradia idealPara;
    private Temperamento temperamento;
    private Intensidade barulhento;
    private Amigavel amigavel;
    private Intensidade alergicos;
    private Intensidade cuidados;
    private Intensidade territorialista;
    private Intensidade treinamento;
    private Perfil perfil;
    private Doencas doencas;
    private double preco;
    
    private int score;

    public enum Intensidade
    {
        Nenhum, Baixo, Medio, Alto, Extremo
    };
    
    public enum Amigavel {
        Nao, Criancas, OutrosPets, Estranhos, Criancas_OutrosPets, 
        Criancas_OutrosPets_Estranhos, OutrosPets_Estranhos
    };
    
    public enum Moradia
    {
        Apartamento, Casa, Apartamento_Casa, Sitio
    };
    
    public enum Temperamento
    {
        Docil, Hostil, Em_Parte_Docil
    };
    
    public enum Perfil
    {
        Caca, Companheiro, Guarda, Guia, Competidor, Caca_Companheiro, Guarda_Companheiro,
        Competidor_Companheiro, Guia_Companheiro, Competidor_Guarda, Nenhum
    }
    
    public enum Doencas
    {
        Oftalmicas, Coluna, Cardiacas, Respiratorias, Surdez, Obesidade, Gastricas,
        Alergias, Reumaticas, Endocrinas, Saudaveis, Neurologicas, Urinarias,
        Oftalmicas_Coluna, Cardiacas_Respiratorias_Surdez, Cardiacas_Respiratorias_Obesidade,
        Gastricas_Alergias_Surdez, Oftalmicas_Reumaticas, Oftalmicas_Alergias,
        Cardiacas_Endocrinas_Reumaticas, Cardiacas_Oftalmicas, Neurologicas_Urinarias, Nenhum
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the expVida
     */
    public int[] getExpVida() {
        return expVida;
    }

    /**
     * @param expVida the expVida to set
     */
    public void setExpVida(int[] expVida) {
        this.expVida = expVida;
    }

    /**
     * @return the porte
     */
    public Intensidade getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(Intensidade porte) {
        this.porte = porte;
    }

    /**
     * @return the altura
     */
    public int[] getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int[] altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public int[] getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int[] peso) {
        this.peso = peso;
    }

    /**
     * @return the idealPara
     */
    public Moradia getIdealPara() {
        return idealPara;
    }

    /**
     * @param idealPara the idealPara to set
     */
    public void setIdealPara(Moradia idealPara) {
        this.idealPara = idealPara;
    }

    /**
     * @return the temperamento
     */
    public Temperamento getTemperamento() {
        return temperamento;
    }

    /**
     * @param temperamento the temperamento to set
     */
    public void setTemperamento(Temperamento temperamento) {
        this.temperamento = temperamento;
    }

    /**
     * @return the barulhento
     */
    public Intensidade getBarulhento() {
        return barulhento;
    }

    /**
     * @param barulhento the barulhento to set
     */
    public void setBarulhento(Intensidade barulhento) {
        this.barulhento = barulhento;
    }

    /**
     * @return the amigavel
     */
    public Amigavel getAmigavel() {
        return amigavel;
    }

    /**
     * @param amigavel the amigavel to set
     */
    public void setAmigavel(Amigavel amigavel) {
        this.amigavel = amigavel;
    }

    /**
     * @return the alergicos
     */
    public Intensidade getAlergicos() {
        return alergicos;
    }

    /**
     * @param alergicos the alergicos to set
     */
    public void setAlergicos(Intensidade alergicos) {
        this.alergicos = alergicos;
    }

    /**
     * @return the cuidados
     */
    public Intensidade getCuidados() {
        return cuidados;
    }

    /**
     * @param cuidados the cuidados to set
     */
    public void setCuidados(Intensidade cuidados) {
        this.cuidados = cuidados;
    }

    /**
     * @return the territorialista
     */
    public Intensidade getTerritorialista() {
        return territorialista;
    }

    /**
     * @param territorialista the territorialista to set
     */
    public void setTerritorialista(Intensidade territorialista) {
        this.territorialista = territorialista;
    }

    /**
     * @return the treinamento
     */
    public Intensidade getTreinamento() {
        return treinamento;
    }

    /**
     * @param treinamento the treinamento to set
     */
    public void setTreinamento(Intensidade treinamento) {
        this.treinamento = treinamento;
    }

    /**
     * @return the perfil
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the doencas
     */
    public Doencas getDoencas() {
        return doencas;
    }

    /**
     * @param doencas the doencas to set
     */
    public void setDoencas(Doencas doencas) {
        this.doencas = doencas;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
}
