.. lecture_::

==================================
Lecture
==================================


pour la **lecture** d'une variable a partir du **clavier** on utilise un Objet de la classe **Scanner**, qu'on relie à l'entrée principale du programme.

.. code-block:: java

    Scanner input=new Scanner(System.in);


.. note::

    Pour pouvoir utiliser cet objet, il faut importer la classe scanner par::

        import java.util.Scanner


Exemple:
========

Voici un exemple pour lire deux entiers et afficher leur somme:


.. literalinclude:: ../codes/chap01/Lecture.java
    :language: java
    :linenos:


Exercice 3:
-----------

1. Modifier le programme pour lire deux réels, puis afficher leur:

* somme
* moyenne arithmétique
* moyenne géométrique.

2.Ecrire un programme qui demande la saisie d'une température en **Celcius** et la convertit en **Fahrenheit**

.. math::

    F= \dfrac{9}{5}*C + 32
