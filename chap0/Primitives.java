/* Une simple class pour illustrer la difference entre les variables primitives
 * et les types dérivés
 
 */

class Primitives
{

        public static void incrementer(int a)
        {
                //Incrementer la valeur de a
                a++;
        }

        public static void incrementer2(int a[])
        {
            //incrementer tous les elements de a
            for(int i=0;i<a.length;i++)
                            a[i]++;

        }

        public static void main(String args[])
        {
                //utiliser la fonction incrementer sur un type primitive
                int a=3;
                incrementer(a);       //Vu que ces types sont manipulés par valeurs la valeur de a ne sera pas incrementé
                                      // car la fonction simplement recoit une copie de la valeur de a
                System.out.println("a="+a);                      
                                      
                //Utiliser la fonction pour incrementer un type dérivé
                int A[]=new int[3];             //toutes les valeurs sont instanciés a 0
                incrementer2(A);

                for(int v:A)
                        System.out.print(v+" ");
                System.out.println("");

                //Afficher la valeur de A
        }
}
