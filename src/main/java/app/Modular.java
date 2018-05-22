package app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Modular {
    
    public Modular(){
        
    }
    
    public static int[][] tabla(int x, String tipo){
        int[][] tab = new int[x][x];
        if (tipo.equals("+")){
            for (int i=0; i<x; i++){
                for (int j=0; j<x; j++){
                    tab[i][j]=(i+j)%x;
                }
            }
        }
        if (tipo.equals("*")){
            for (int i=0; i<x; i++){
                for (int j=0; j<x; j++){
                    tab[i][j]=(i*j)%x;
                }
            }
        }
        return tab;
    }
}
