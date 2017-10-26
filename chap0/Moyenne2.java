import java.util.Scanner;

class Moyenne2 {
  public static void main(String[] args) {
    
    //préparer le lecteur
    Scanner in=new Scanner(System.in);

    int count=0;                  //count des notes saisies
    long M=0;                       //moyenne des notes;

    System.out.println("Enter une note: ");
    double note=in.nextDouble();

    while(note>=0)
    {
      M+=note;
      count++;

      //Reprendre la saisie
      System.out.println("Donner une note: ");
      note=in.nextDouble();
    }

    if(count>0)
    {
      M/=count;
      System.out.println("Votre note est "+M);
    }
    else
      System.out.println("Vous navez saisi aucune note");

  }
}