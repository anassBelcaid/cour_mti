import java.util.Scanner;

class ExempleWhile {
  public static void main(String[] args) {
    //Déclerer le scanner
    Scanner in=new Scanner(System.in);
    long A,P;
    int n;
    System.out.println("Donner le seuil=");
    A=in.nextLong();

    //boucle de calcul
    n=1;
    P=1;
    while(P<A)
    {
      n++;
      P*=n;
    }

    //dimuner n par 1
    P/=n;
    n--;
    System.out.printf("%d!=%d\t %d\n",n,P,A);
  }
}