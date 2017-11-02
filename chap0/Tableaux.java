import java.util.Scanner;
class Tableaux {
  public static void main(String[] args) {

    //Déclarer et initialiser le tableau
    int T[]={12,8,11,13,12,9,10,8,11,12,10,12};

    //Déclare le scanner
    Scanner in=new Scanner(System.in);
    //Question (*1) Afficher le tableau
    for(int a:T)
    {
      System.out.print(a+"  ");
    }
    System.out.println();
    
    //Qeustion (*1) Calculer le min,max,somme,moyenne
    int min,max,somme;
    double moyenne;
    int i;

    for(min=T[0],max=T[0],somme=T[0],i=1;i<T.length;i++)
    {
      //Traitment T[i]
      somme+=T[i];                  

      if(min>T[i])
        min=T[i];

      if(max<T[i])
        max=T[i];
    }
    //CAlculer la moyenne
    moyenne=(float)(somme)/T.length;
    System.out.printf("max=%d\t min=%d\t somme=%d\t moy=%.2f\n",
                      max,min,somme,moyenne);


    //Question 2 (Hard copy)
    int T2[]=new int[T.length];
    //copy
    for(i=0;i<T.length;i++)
      T2[i]=T[i];

    for(int a:T2)
      System.out.print(a+" ");
    System.out.println("");

    //Question (3**) (parcours linéaire + les drapeaux)
    System.out.println("Donner une valeur");
    int val=in.nextInt();
    int ind=0;                    //indix dans lequel se trouve l'element
    boolean trouve=false;       //Drapeau qui m'indique si j'ai bien trouvé la valeur
    for(i=0;i<T.length;i++)
    {
      if(T[i]==val)
      {
        trouve=true;
        ind=i;
        break;
      }
    }
    //Tester le drapeau
    if(trouve)
      System.out.println("Valeur trouve dans la position "+ind);
    else
      System.out.println("valeur non trouve");

    //Question 4 (Nombre d'occurence)
    int occ=0;                 //nombre occurence
    for(int a:T)
     occ+=(a==val)?1:0;
    System.out.println("Valeur de repetition de "+val+" est "+occ);
  }  
}