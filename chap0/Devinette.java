import java.util.Scanner;
import java.util.Random;

class Devinette {
  static int seuil=100;    // valeur maximale pour le nombre
  static int maxTrials=3;  //nombre maximal d'essais

  public static void main(String[] args) {
    
    //Génére le lecteur
    Scanner in =new Scanner(System.in);

    //Générer le nombre aléaoite a deviner
    Random gen=new Random();
    int num=gen.nextInt(seuil+1);

    //int trials (nombre d'essais)
    int trials=0;

    //variable booléenne pour stocker la test
    boolean success=false;

    //boucle principale
    while(!success)
    {
      int val;
      do
      {
        System.out.println("Saisir un nombre: ");
        val=in.nextInt();
        
      }while((val<0)||(val>seuil));

      if(val==num)  //utilisateur a bien diviner le nombre
      {
          success=true;
      }
      else if(val<num)
      {
        System.out.println("Votre valeur est tres petite");
      }
      else
      {
        System.out.println("Votre valeur est trop grande");
      }
      //Augmenter le nombre d'essais
      trials++;


      //S'assurer que ne je depasse pas le nombre maximal d'essais
      if(trials>maxTrials)
      {
        break;
      }
    }

  }
}