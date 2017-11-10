import java.util.Scanner;
import java.util.Random;

class LanceDe {
  static int faces=6;
  public static void main(String[] args) {
    
    //Initialiser le Scanner
    Scanner in=new Scanner(System.in);
    Random gen=new Random();

    //reserver le tableau des probabilités
    float prob[]=new float[faces];

    //lire la taille de la simulation
    int taille;
    do
    {
      System.out.println("Donner la taille de la simulation:");
      taille=in.nextInt();
    } while(taille<0);


    //Reserver le tableau pour stocker les resultats de la simulation
    int simul[]=new int[taille];

    //Lancer la simulation
    int i;
    for(i=0;i<taille;i++)
    {
      //Réaliser une experience
      simul[i]=1+gen.nextInt(faces);
    } 

    //Afficher la simulation    Enlever le commentaire si vous voulez voir les resultats
    //for(int v:simul)
      //System.out.print(v+" ");
    //System.out.println("");

    //Calculer les probabilités
    for(int v:simul)
    {
      int idx=v-1;            //indice de sauvegarde dans prob      
      prob[idx]=prob[idx]+1;
    }

    //Diviser sur le nombre de répétition
    for(i=0;i<faces;i++)
      prob[i]/=taille;

    for( i=0;i<faces;i++)
      System.out.printf("P(%d)=%f\n",i,prob[i]);
  }
}
