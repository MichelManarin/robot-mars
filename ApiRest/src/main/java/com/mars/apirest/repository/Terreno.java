package com.mars.apirest.repository;

public class Terreno {
    
    String nome_terreno = "";
    int max_ordenada = 0;
    int min_ordenada = 0;
    int max_abcissa = 0;
    int min_abcissa = 0;
        
        
    public Terreno(int min_o, int max_o, int min_a, int max_a){
        this.max_ordenada = max_o;
        this.min_ordenada = min_o;
        this.max_abcissa = max_a;
        this.min_abcissa = min_a;
    }
    
    public void MovimentoPermitido(int x, int y) throws Exception{
        
        if (y < this.min_ordenada)
            throw new Exception("Ordenada minima ultrapassada.");
            
        if (y > this.max_ordenada)
            throw new Exception("Ordenada maxima ultrapassada.");
            
        if (x < this.min_abcissa)
            throw new Exception("Abcissa minima ultrapassada.");
            
        if (x > this.max_abcissa)
            throw new Exception("Abcissa maxima ultrapassada.");
        
    }
    
    
}
