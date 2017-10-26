
********************************************
Tableaux
********************************************


=====================
Introduction
=====================

La représentation des données se réduit aux types **élémentaires**

* int
* double
* boolean.

Ils permettent de représenter, dans des variables, des concepts **simples** du monde modélisé dans le programme :

* dimensions
* sommes
* tailles
* expressions logiques
* ...

.. note::

    Cependant, de nombreuses données plus **sophistiquées** ne se réduisent pas à un objet informatique élémentaire.


un langage de programmation évolué doit donc fournir le moyen de **composer** les types élémentaires pour construire des types plus complexes.


Exemples de données structurées
-------------------------------


.. table:: Tableaux Age

    +-------+------+------+-----+-----+------+-----+-----+-------+
    |  Age  |  34  |  12  |  32 | 25  |  18  | 19  |  26 | 34    |
    +-------+------+------+-----+-----+------+-----+-----+-------+


**structure complexe**


.. table:: Étudiants

    +----------+------+------+-------------+
    | Etudiant | Age  | CIN  | Moyenne     |
    +----------+------+------+-------------+
    | Eudiant1 | 24   | 3232 |   14.5      |
    +----------+------+------+-------------+
    | Eudiant2 | 19   | 3451 |   16        |
    +----------+------+------+-------------+
    | Eudiant3 | 25   | 6743 |   12.5      |
    +----------+------+------+-------------+
    | Eudiant4 | 28   | 8752 |   13        |
    +----------+------+------+-------------+


Type de base et types évolues
-----------------------------

il y a une différence importante pour le langage **Java** entre les variables de base et les types de **bases** et les types **évolués**.

* Toute variable de type de base stocke directement une **valeur**.

.. code-block:: java

    int a=3;              // la variable a stock la valeur 3

* Toute variable de type évolué, comme les **tableaux** ou les **chaînes de caractères** (String), stocke une référence(adresse) vers une valeur :

.. code-block:: java

    String ch="Message";        // la variable ch contient une référence vers message


.. note::

    Toute variable de type évolué stocke une **référence** vers une valeur

.. warning::

    ceci a une très grande incidence sur la sémantique des opérateurs **=** et **==** en Java !



voici un simple exemple illustratif:


.. literalinclude:: ../codes/chap04/SimpleVsEvolue.java
    :language: java
    :linenos:



Exemple Simple
--------------

On se propose d'écrire un programme qui demande la *saisi* d'un nombre d'employée, puis leur **nombre d'article vendu**, puis affiche leur **moyenne** mais surtout **l'écart** de chaque employée à la moyenne.


.. literalinclude:: ../codes/chap04/EmployeeEcart.javar
    :language: java
    :linenos:
    :emphasize-lines: 23

-------------


====================
Déclaration
====================

Il y as deux syntaxes générales pour déclarer un tableau en **java**::

    TypeElement [] nomTableau
    TypeElement  nomTableau[]


**Exemples**

.. code-block:: java

    float[] poids;
    int   IP[];


Initialisation
--------------

Si on connaît les **valeurs** du tableau lors de la déclaration on peut utiliser.

.. code-block:: java

    int De[6]={1,2,3,4,5,6};

    int Reponses[]={1,0,0,0,1} //java peut calculer la taille d'après les éléments

.. note::

    La variable De contient une adresse : **l’emplacement** du tableau en mémoire !


Si on connaît pas les valeurs du tableaux lors de la **déclaration**.

.. code-block:: java

    float notes[];  //déclaration
    notes=new float[taille]  // réserver la taille au tableau

Valeur par défaut
-----------------

Si les valeurs du tableaux ne sont pas fournis, le tableau reçoit une valeur par **défaut**

.. table:: Valeur par Defaut

    ===========  ===========
     type          valeur
    ===========  ===========
     int            0
    -----------  -----------
     float          0.0
    -----------  -----------
     bloolean      false
    -----------  -----------
     autre         null
    ===========  ===========

Accès aux élements
------------------

L'accès aux éléments se fait par l'opérateur **[]**.


.. code-block:: java

    int D[]={1,2,3,4,5,6};

    //Afficher la deuxième composante de D
    System.out.println(D[1]);

    //Affichera le dernier élément
    System.out.println(D[5]);


.. warning::

    Pour un tableau de taille **T** les indices varient de **0** à **T-1**.

=====================
Traitement
=====================


Affichage d'un tableau
-----------------------

Dans cette partie on présentera des méthodes pour afficher un Tableau


* Le code suivant:


.. code-block:: java

    double[] T={1.2,3.4,-5,9};

    System.out.println(T);

Affichera la **référence** du tableau **T**, donc une adresse.

* Donc si on veut afficher les éléments du tableau, il faudra appeler une boucle **for**.


Accès aux éléments
------------------

Très souvent on voudrais accéder aux éléments d'un tableau, en effectuant une itérations sur ce tableau.

* Il existe au moins trois façons pour d'itérer sur un tableau.

1. Avec une *itération* classique **for**.

.. code-block:: java

    for(int i=0;i<T.length;i++)

**Exemple**

.. code-block:: java

    for(int i=0;i<T.length; i++)
        System.out.println(T[i]);      //Afficher les éléments du tableau

-------

2. Avec des itérations sur un **ensemble de valeurs**.

.. code-block:: java

    for(Type element: Tableau)

        //instructions

**Exemple**

.. code-block:: java

    //Déclarer le tableau
    double T[]={3.4,-2,23,12.3};

    //boucle sur le tableau
    for(double val: T)
        System.out.println(T);


.. note::

    Cette forme de boucle (**for**) contient certains **limites** comparée à la version classique.


* Ne permet pas **modifier** le contenu du tableau.
* Ne permet d’itérer que sur un **seul tableau** à la fois.
* Ne permet l’accès qu’à un **seul élément** : on ne peut pas par exemple comparer un élément du tableau et son suivant.
* Itere d'un pas en **avant** seulement.
-----------

3. En utilisant les **itérateurs**, sera traité dans les derniers chapitres



Copie d'un Tableau
-------------------

Qule sera le résultat du programme suivant:

.. literalinclude:: ../codes/chap04/TestCopie.java
    :language: java
    :linenos:
    :emphasize-lines: 13



.. warning::

    l'instruction t1=t2 n'affecte pas les éléments de t1 dans t2, mais juste affecte **l'adresse** de t1 à t2.

donc pour copier le tableaux :math:`T_1` dans :math:`T_2`, on écrit:

.. code-block:: java

    for(int i=0;i<t1.length;i++)
    {
        t2[i]=t1[i];
    }

Comparaison entre deux tableaux
-------------------------------

idem à l'opérateur **=** l'opérateur **==** va comparer les adresses des tableaux et non leurs valeurs.

.. code-block:: java

    t1==t2;        // sera vrai, si t1 et t2 ont la même adresse.

.. note::

    Donc pour **comparer** les valeurs d'un tableau, il faudra utiliser une boucle **for** voir (exercices)


=====================
Exercices
=====================

1. Un coureur enregistre la distance qu'il a parcouru chaque jours dans son entraînement. il a obtenu les valeurs suivants:

.. table:: Distances

    +----+----+----+----+----+---+-----+----+-----+-----+-----+-----+
    | 12 |  8 | 11 | 13 | 12 | 9 |  10 | 8  | 11  |  12 | 10  | 12  |
    +----+----+----+----+----+---+-----+----+-----+-----+-----+-----+

écrire un programme java **Distances.java** pour enregistrer ces distances, et puis:

* affiche les résultats
* calcule somme totale qu'il a parcouru.
* estime une moyenne par jour.

2. Ajouter le calcul de l'élément **minimal** et **maximal** dans le tableau.

3.(+++) Ecrire un programme qui
  *  demande à l'utilisateur d'entrer une valeur positive :math:`n_1`, qui représente la taille de votre tableau.
  *  Déclare un tableau de taille :math:`n_1`.
  *  Remplir le tableau par des valeurs **aléatoires** entre 1 et 6; (voir chapitre précédant)
  *  Afficher le nombre de **3** que vous avez obtenu.
