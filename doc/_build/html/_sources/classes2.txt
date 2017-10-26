.. classes2_::

**************************************************
Relations entre classes
**************************************************

On peut construire des classes complexes, qui peuvent contenir d'autre classes, ou améliore  ou modifie le comportement des classes existantes.


============
Composition
============

Un lien de **composition** (fait partie) symbolise l'existence d'une relation particulière, dite 'forte', entre deux entités (classes). par exemple:

* Un **Segment** contient deux *points*.
* Une **Voiture** doit contenir un *Carburateur*.
* Une **Ordinateur** ne peut pas fonctionner sans une *carte mère*.

Donc une **composition** est définie par les points suivants:

.. note::

    Par exemple dans le premier exemple, on dit que la classe *Point* est **agrégée** à la classe *Segment*.

* Durée de vie:
    Toute classe agrégée est détruite quand sa classe *composite*  est détruite.
* Exclusivité:
    Une classe agrégée ne peut exister que pour une seule classe composite.


exemples:
---------

.. code-block:: java

    public class Voiture
    {
        //Voiture est responsable de l'objet carb.
        private Carburateur carb;

        public Voiture(...)
        {
           //le constructeur Voiture doit aussi construire carb
           carb=new Carburateur(...)
        }

    }

---------
Exercice:
---------

1. Créer une classe **Segment** en utilisant la classe prédéfinie **Point**.






===============
Agrégation
===============

l'agrégation permet de définir une entité comme étant liée à **plusieurs** entités de classe différentes. C'est une généralisation de la composition, qui **n'entraîne** pas l'appartenance par exemple:


* Une faculté utilise un ensemble de **Professeurs**.
* Un aéroport agrège plusieurs **avions**.


-------------
Exemple:
-------------

.. code-block:: java

    public class Faculte
    {
       // liste des professeurs
       private Professeur[] profs;

       public Faculte(...)
       {
              //la classe faculté n'est pas responsable
              //pour la création des professeurs. il les ajoutes
       }
    }


---------
Exercice
---------
1. Ecrire un code en java pour le modèle suivant:

.. figure:: pictures/agregation.png
    :scale: 60%
    :alt:    text if image isn't found
    :align: center

    Diagramme d'agrégation.


================
Héritage
================

Le concept d'héritage est un des concepts les plus important dans la programmation orienté objet. C'est un mécanisme permettant de créer une nouvelle classe **à partir** d'une classe existante en lui proférant ses propriétés et ses méthodes.

Ainsi, pour définir une nouvelle classe, il suffit de la faire hériter d'une classe existante et de lui ajouter de nouvelles propriétés/méthodes.


Par un exemple un *Lion* peut être modélisé comme un **carnivore** en lui ajoutant les d'autre propriétés.




.. note::

    Dans l'exemple précédant on dit que la classe **Lion** est dit classe *mère* de la classe **Lion**.


.. figure:: pictures/heritage.png
    :scale: 70%
    :alt:    text if image isn't found
    :align: center

    Diagramme d'héritage

En java pour indiquer qu'une classe B hérite d'une classe A, on utilise le mot clé **extends** dans la déclaration de la classe.


.. code-block:: java

    public class B extends A
    {
          ...
    }


------------
Exemple
------------
Dans cette section on propose un exemple simple pour bien assimiler syntaxe concernant l'héritage. Le but de l'exemple est de créer une classe **Point Coloré** en héritant de la classe **Point** et en utilisant une composition avec la classe **Color**.

.. literalinclude:: ../codes/chap07/Point.java
    :language: java
    :linenos:


.. literalinclude:: ../codes/chap07/PointColor.java
    :language: java
    :linenos:


=============
Surcharge
=============

La **surcharge** est une possibilité offerte par certains langages de programmation comme *JAVA* qui permet de choisir entre différentes implémentations d'une même fonction.

.. centered::
    Exemple

.. code-block:: java

    public class A
    {
        //première définition d'une méthode
        public void method1(double x)


        //Surcharger la fonction,
        public void method1(double x, double y)

    }



===================
Le mot clé final
===================

Le mot clé **final** doit être utilisé pour fixer l'état soit:

* Variable
* Méthode
* Classe

Variables
----------

Ajouté à une variable, ne permet plus de changer sa valeur.

.. literalinclude:: ../codes/chap07/FinalVariable.java
    :language: java
    :linenos:
    :emphasize-lines: 4


Méthodes
--------

Pour une fonction, le mot *final* indique qu'on peut plus la **surcharger**.


.. literalinclude:: ../codes/chap07/A.java
    :language: java
    :linenos:
    :emphasize-lines: 19


.. literalinclude:: ../codes/chap07/B.java
    :language: java
    :linenos:
    :emphasize-lines: 8



Classes
--------

.. note::

    Ajouter l'attribut *final* à une classe, indiquera que cette classe ne peut plus servir comme classe **mère** à une autre classe. (ie) **hériter** de cette classe est impossible.

