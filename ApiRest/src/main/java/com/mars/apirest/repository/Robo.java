package com.mars.apirest.repository;

import com.mars.apirest.repository.orientacao.Orientacao;
import com.mars.apirest.repository.orientacao.OrientacaoNorte;

public class Robo {
    
    private Terreno terreno;

    public void ValidarLocalizacao() throws Exception {
        this.terreno.MovimentoPermitido(this.x, this.y);
    }
    
    private Orientacao orientacao_atual;
    private int x;
    private int y;
    
    
    public Robo(Terreno terreno, int x, int y){
        
        this.orientacao_atual = new OrientacaoNorte();
        this.terreno = terreno;
        this.x = x;
        this.y = y;
    }
    
    public String getLocalizacao(){
        System.out.println("Coordenadas Atuais:");
        System.out.printf("Eixo x = %d \n", this.x);
        System.out.printf("Eixo y = %d \n \n", this.y);

    	return String.format("(%d, %d, %s)", this.x, this.y, this.getOrientacao_atual().GetSigla());
    }

    public Orientacao getOrientacao_atual() {
        return orientacao_atual;
    }
     
    public void DiminuirOrdenada(){
       this.y -= 1;
    }
    
    public void AumentarOrdenada(){
        this.y += 1;
    }
    
    public void DiminuirAbcissa(){
         this.x -= 1;
    }
    
    public void AumentarAbcissa(){
        this.x += 1;
    }
    
    public void AlterarDirecao(Orientacao orientacao){
        this.orientacao_atual = orientacao;
    }   
        
}
