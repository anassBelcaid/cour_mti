/* Classe pour calculer la decomposition d'un nombre a en facteurs premiers
 */

class Decomposition
{
        public static boolean estPremier(int a)
        {
                //Fonction pour vérifier si un  nombre a est premier
                
                for(int i=2;i<(a/2);i++)
                        if((a%i)==0)
                                return false;

                //aucun divisueur n'as été detecté donc le nombre est premier
                return true;
        }

        public static int ordre(int n,int p)
        {
                //Fonction pour calculer l'ordre du diviseur p par rapport a n
                
                int count=0;         
                
                while((n%p)==0)
                {

                        count++;
                        n/=p;
                }
                return count;
        }

        public static void decompose(int n)
        {
                //Fonction pour afficher la decomposition
                System.out.print(n+"= ");
                
                int i=2;                //premier diviseur
                while(n>1)
                {
                    if((n%i)==0)
                    {
                            if(estPremier(i))
                            {
                                    //calculer l'ordre
                                    int o=ordre(n,i);

                                    //Afficher le facteur
                                    System.out.print(i+"**"+o+" ");

                                    //Diviser sur le facteur
                                    n/=Math.pow(i,o);
                            }
                    }
                    //passer au diviseur suivant
                    i++;
                }
                System.out.println("");
        }

        public static void main(String args[])
        {
                decompose(96);
                decompose(456);
                decompose(1332);
                decompose(44311383);
                        
        }

}
