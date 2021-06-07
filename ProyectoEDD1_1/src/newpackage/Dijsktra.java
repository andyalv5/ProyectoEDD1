/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
    
import javax.swing.JOptionPane;

/**
 *
 * @author andy
 */
public class Dijsktra {
    private int[] distancia;
    private int[][]d;
    private int n;
    private int[][]pesos;
    private int origen;
    private MatrixGraph matrix;
    
    
    
    public Dijsktra(MatrixGraph matrix,ListaVertex lisver,int origen){
        
        n= lisver.getSize();
        int[][]P =new int[n][n];
        String[][]F=new String[n][n];
        this.distancia = new int[n];
        for (int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                P[i][j]= matrix.adyacentebynum(i, j);
                F[i][j]=matrix.getVerbyint(i).getName();
            }
        }
        pesos=P;
        d=new int[n][n];
        this.matrix=matrix;
        this.origen=origen;
        
        int flag[] = new int[n];
        int i,m,k,c,minimo;
        int minpos=1;
        for(int r=0;r<n;r++){
            flag[r]=0;
            for(int j=0;j<n;j++){
                d[r][j]=pesos[r][j];
                if(d[r][j]==0){
                    d[r][j]=999999;
                    
                }
            }   
        }
        
        for(i=0;i<n;i++){
            flag[i]=0;
            this.distancia[i]=this.d[origen][i];
        }
        c=1;
        while(c<n){
            minimo=9999;
            for(k=0;k<n;k++){
                if(this.distancia[k]<minimo && flag[k] != 1){
                    if(k!=0){
                        minimo=this.distancia[k];
                    }
                    minpos=k;
                }
            }
            c++;
            flag[minpos]=0;
        }
        
        
        for(k=0;k<n;k++){
            if(this.distancia[minpos]+this.pesos[minpos][k]<this.distancia[k]&&flag[k]!=0){
                
                this.distancia[k]=this.distancia[minpos]+this.pesos[minpos][k];
            }
        }
   
       
    }
    public void print(){
        String s ="";
        
        for (int i=0;i<n;i++){
            if(i!=origen){
                s+= distancia[i]+ " ---> ";
            }
        }
        s+=origen;
        JOptionPane.showMessageDialog(null, s);
    }
   /* private int[][] pesos;
    private int[] ultimo;
    private int[] D;
    private boolean []F;
    private int s;
    private int n;
    
    public Dijsktra(MatrixGraph gp, int Origen){
        n=gp.realnumNodo;
        s=Origen;
        pesos=gp.adjacent;
        ultimo=new int[n];
        D =new int[n];
        F=new boolean[n];
    }
    public void caminosMin(){
        for(int i=0;i<n;i++){
            F[i]=false;
            D[i]=pesos[s][i];
            ultimo[i]=s;
        }
        F[s]=true;
        D[s]=0;
        for(int i=1;i<n;i++){
            int v=minimo();
            F[v]=true;
            for(int w=1;w<n;w++){
                if(!F[w]){
                    if((D[v]+pesos[v][w])<D[w]){
                        D[w]=D[v]+pesos[v][w];
                        ultimo[w]=v;
                    }
                }
            }
        }
    }
    public int minimo(){
        
        int v=1;
        for(int j=1;j<n;j++){
            if(!F[j]&&(D[j]<=mx)){
                mx=D[j];
                v=j;
            }
           
        }
        return v;
    }
    public String recuperaCamino(int v){
        String toSt= "";
        int anterior=ultimo[v];
        if(v!=s){
            toSt+="---> V" +v;
            recuperaCamino(anterior);
        }
        else{
            toSt+="V"+s;
        }
        return toSt;
    }
    */
}
