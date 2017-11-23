.. hello_world_::

====================================================
Premier programme
====================================================

Dans cette partie nous illustrons le mécanisme, pour la création et l’exécution d'un simple programme en java.

#. Avec votre éditeur de choix, créer le fichier **source** dans ``codes/chap01/HelloWorld.java`` avec le contenu.

.. literalinclude:: ../codes/chap01/HelloWorld.java
    :language: java
    :linenos:

.. warning::

    Le nom de la classe doit être le même que le fichier.

#. pour la **compilation** du fichier, placer un terminal dans le même dossier puis::

    javac HelloWorld.java




ceci va créer le fichier *HelloWorld.class* dans le même dossier.

    ls
    HelloWorld.class  HelloWorld.java

#. pour exécuter le fichier **classe** avec *jkd* lancer ::

    java HelloWorld


.. warning::
    Il faut pas ajouter l'extension .class


Exercice 1
-----------

* Ajouter un autre message dans votre programme.
* changer la fonction **println** par **print**.
