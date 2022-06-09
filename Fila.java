package Fila;
public class Fila{
   
   private int[]vetor = new int[10];
   private int fim = -1;
   private int inicio = 0;
   private int qtd=0;
   
   public void adiciona(int item){
       this.fim++;
       if(item > 50){
           for(int i = this.fim-1; i >= this.inicio; i-=1){
               this.vetor[i+1] = this.vetor[i];
           }
           this.vetor[this.inicio] = item;
           this.inicio++;  
           this.qtd++;
       }else{
           this.vetor[this.fim] = item;
           this.qtd++;
       }
    }
   
   public void remove(){
       for(int i=0; i<this.fim; i++){
           this.vetor[i] = this.vetor[i+1];
       }
       this.vetor[this.fim] = 0;
       if(this.vetor[0] > 50){
            this.inicio--;
       }
       this.fim--;
       this.qtd--;
   }
   
   public int tamanho(){
       return this.qtd;
   }
   
   public void imprime(){
       for(int i=0; i<this.vetor.length;i++){
           System.out.println((i+1) + " da fila: " + this.vetor[i]);
       }
   }
}
