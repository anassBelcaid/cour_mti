import java.util.Scanner;

class Moyenne2 {
  public static void main(String[] args) {
    
    //préparer le lecteur
    Scanner in=new Scanner(System.in);

    int count=0;                  //count des notes saisies
    long M=0;                       //moyenne des notes;

    double note;
    do{
    System.out.println("Enter une note: ");
    note=in.nextDouble();
    }while(note<-1 || note>20);
    while(note>=0)
    {
      M+=note;
      count++;

      //Reprendre la saisie
      do
      {
      System.out.println("Donner une note: ");
      note=in.nextDouble();
    }while(note<-1 || note >20);
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