class Tableaux {
  public static void main(String[] args) {

    //Déclarer et initialiser le tableau
    int T[]={12,8,11,13,12,9,10,8,11,12,10,12};

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
  }  
}