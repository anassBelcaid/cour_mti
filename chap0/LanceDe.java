import java.util.Scanner;
import java.util.Random;

class LanceDe {
  static int faces=6;
  public static void main(String[] args) {
    
    //Initialiser le Scanner
    Scanner in=new Scanner(System.in);
    Random gen=new Random();
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

    //Afficher la simulation
    for(int v:simul)
      System.out.print(v+" ");
    System.out.println("");
  }
}