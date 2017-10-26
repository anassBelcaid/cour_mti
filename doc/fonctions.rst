.. _fonctions::

****************************************
Fonctions et Méthodes
****************************************

*  Dans cette partie du cours, on va présenter les notions qui vont nous aider à **organiser** notre code en le modélisant à l'aide de nos *propres* fonctions.

* Les **fonctions** font partie des aspects de traitement au même titre que les expressions et structures de contrôle.

.. note::

     Jusqu’à maintenant les programmes qu'on a développés sont constitués d'une séquence **linéaire** d'instructions, sans **organisation** globale, et sans **partage** des taches *répétées*.

===========================
Notion de Réutilisabilité
===========================

Supposons que le contrôle d'une entrée:

.. code-block:: java

    do
    {
        System.out.println("Donner une note: ");
        note=clavier.nextDouble();
    }while((note<0) || (note>20));


doit être **répétée** dans plusieurs parties du programme.


.. warning::

    **bonne pratique** : Ne jamais dupliquer un code en programmant, donc éviter le fameux *copier/coller*.

Généralement si vous voulez copier un code, c'est un indice que vous avez besoin d'une **fonction**.

Mauvaise répitition:
--------------------

.. literalinclude:: ../codes/chap05/Score1.java
    :language: java
    :linenos:

Malgré que ce code est lent , il ne contient que des taches simples. a titre d'exemple la **saisie** des données. et le calcul du **score**.


.. code-block:: java

    static int saisieEtCalcul()
    {
        int nbPoints;

        do
        {
            System.out.println("Donner votre nombre de points (1--100): ");
            nbPoints=clavier.nextInt();
        }while( nbPoints<0 ||  nbPoints>100 );


        //lire le temps du joueur
        double temps;
        do
        {
            System.out.println("donner votre temps (1--60)");
            temps=clavier.nextDouble();
        }while(temps<0 || temps>60);

        //Calculer le score du premier joueur
        int score=(int)(40*nbPoints/temps);

        //retourner la valeur de calcul
        return score;

    }

Aussi on pourra faire la même chose pour le calcul du score.


.. code-block:: java

    static int calculerScore(int  nbPoints,double temps)
    {
        if(temps!=0)
        {
           return (int)(40*nbPoints/temps)
        }
        else
        {
            return 0;
        }
    }

----------------

==========
Fonctions
==========


Une **fonction**: est une portion du programme réutilisable, ou importante en soi.


et qui est caractérisée par:

* **corps** : la portion du programme a réusitilisée, ou mettre en évidence.
* **Nom**   : par lequel on va désigner cette fonction.
* **arguments** : ensemble de variables extérieurs à la fonction, dont le *corps* dépend pour fonctionner.
* **Valeur de retour** : Ce que la fonction renvoie au reste du programme.


.. note::

    L'utilisation d'une fonction dans autre partie du programme, se nomme **appel** de la fonction.


Trois facettes d'une fonction
-----------------------------

Dans un programme on peut rencontrer une fonction sous l'une des formes suivantes:

.. figure:: pictures/diagram_fonctions.png
    :scale: 50%
    :alt:    diagram_fonctions
    :align: center

    Différents utilisation d'une fonction


* Utilisation(appel):

Action d'utiliser une fonction, en l'appelant dans un programme.

.. centered:: exemple

.. code-block:: java

    //fonction sans valeur de retour ni arguments
    saisieEtCalcul();

    //fonction sans valeur de retour, mais avec arguments
    triTableau(T);

    //fonction avec une valeur de retour, et arguments
    char c=getClass(ip);


* Création(définition):

Action de définir, et **implémenter** (préciser le corps) d'une fonction.

.. code-block:: java

    double min(double a,double b)
    {
        //calculer le min;
        double resultat=(a<b)?a:b;

        //retourner la valeur calculée
        return resultat;
    }


* Résumé (Contrat):

Action de préciser juste la **définition** ou le *prototype* d'une fonction, sans préciser sans corps.

.. code-block:: java

    //prototype des fonctions précédentes
    void saisieEtCalcul();

    //fonction pour trier un tableau
    void triTableau(double []);

    //fonction pour obtenir une classe d'un ip
    char getClass(Ip );


==========================
Passage d'arguments
==========================

Considérons la situation suivante:


.. code-block:: java

        static void methode(Type v)
        {
           // la fonction contient un traitement qui modifie v
        }

        //Ailleurs dans le programme principal
        Type v1=....;

        //appel de la fonction
        methode(v1);

        //Question qui se pose: est ce que v1 sera modifiée.


En **Programmation** de façon générale, on dira que:

* L'argument v est **passé par valeur**, si *méthode*  ne peut pas modifier v1, car v est une **copie** de v1.
* L'argument v est **passé par référence**, si *méthode* peut modifier v1.


.. warning::

    En Java, il n'existe que le passage par **valeur**, (ie) une méthode travaille toujours sur une **copie** de la valeur qui lui est passée en paramètre.

donc si **Type** est un type élémentaire. la valeur de **v1** ne sera pas changée.


.. centered:: Exemple

.. literalinclude:: ../codes/chap05/Passage1.java
    :language: java
    :linenos:
    :emphasize-lines: 14


Passage par valeur: Type évolué.
----------------------------------

* Pour le type évolué, c'est toujours un passage par valeur, mais cette fois ci c'est la **référence** qui est copiée.

et donc

.. note::

    Toute modification faite sur l'objet référence via **la copie** est visible via **l'origine**.


.. centered:: Exemple

.. literalinclude:: ../codes/chap05/Passage2.java
    :language: java
    :linenos:
    :emphasize-lines: 16


L'instruction return
====================

L'instruction **return** est utilisée pour indiquer la valeur de retour d'une fonction.

.. note::

    L'instruction *return* **termine** l'exécution d'une fonction.


Supposons qu'on as défini la fonction suivante.

.. code-block:: java

    boolean afficherInfo(int n)
    {
         int i=n;
         while(i>0)
         {
            if(i%3==0)
            {
               return true;
            }
            else
            {
                i--;
                System.out.println(i);
            }
         }
         return false;
    }


Quel sera l'affichage des instructions suivantes::

    afficherInfo(4);
    afficherInfo(2);

**Question**

Quel est le rôle de la fonction suivante:

.. code-block:: java

    boolean mystere(int p)
    {

        for(int i=2;i<p;i++ )
          if(p%i==0)
            return false;

        return true;

    }

Simulation aléatoire
====================

Dans cet exemple on se propose d'écrire un programme qui simule le lancé d'un **dé** à :math:`n` faces, et afficher les résultats de l'expérience.


1. proposer des fonctions pour simplifier l'exécution de ce programme.

2. on propose le programme suivant:

.. code-block:: java

    //codes/chap05/Simulation.java

    import java.util.Scanner;
    import java.util.Random;

    class Simulation {

    public static void main(String[] args) {

        //lecture de la taille des faces
        Scanner clavier=new Scanner(System.in);

        System.out.println("Donner le nombre de faces : ");
        int n=clavier.nextInt();


        //Lancer la simulation par une fonction
        int []resultats=simulation(n);


        //Afficher les resultats
        afficherResultats(resultats);

        }
    }

qui utilise les fonction d'aide suivants:

.. code-block:: java

    //fonction pour lancer l'expérience n fois
    //et sauvegarder les résultats dans un tableau
    int [] simulation(int);

    //fonction simple pour afficher les résultats
    void afficherResultats(int []);


Solution dans ::

    codes/chap05/Simulation.java

---------

Exercices
==========


1. Ecrire une fonction pour calculer le max de deux entiers::
    int maxEntre(int,int);

Ecrire un programme **java** qui utilise cette fonction pour le calculer du max de :math:`4` entiers saisis en clavier.


2. Ecrire une fonction pour afficher un Tableau des réels.

3. Ecrire une fonction pour chercher un élément dans un tableau::

    boolean existe(int [],int valeur);

4. Ecrire une fonction qui vérifie si un nombre est **parfait** ou non.

.. note::

    Un nombre est parfait, s'il est égal à la somme de ces *diviseurs* sauf lui même.


**Exemple**

.. math::

    6=1+2+3
