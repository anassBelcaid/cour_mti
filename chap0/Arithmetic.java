import java.util.Scanner;

class Arithmetic
{
        public static int min(int a,int b)
        {
                /* Une simple fonction pour calculer le minimum de deux nombre
                 */
                return (a<b)?a:b;
        }

        public static void main(String args[])
        {
                //Declarer le Scanner
                Scanner in=new Scanner(System.in);

                //lire les quatre valeurs
                System.out.println("Donner 4 valeurs:");
                int a=in.nextInt();
                int b=in.nextInt();
                int c=in.nextInt();
                int d=in.nextInt();

                //Calculer le min des 4 nombres
                int M=min(min(a,b),min(c,d));

                System.out.println("Le minimum des 4 nombres est "+M);


        }
                        
}

