.. _java:

=================================================
Introduction au langage Java
=================================================

Historique
===========

Java est né dans les **laboratoires de Sun Microsystems** en 1990 avec le JDK 1.0 (Java Development Toolkit ).

C'est un langage propriétaire mais très ouvert car les sources du langage sont fournies par **SUN** et ont permis à d'autres sociétés comme **IBM** de fournir leurs propres kits de développement.

Ces kits de developpement contient

* Un **compilateur** : *javac*.
* Un **interpréteur**    : *java*.
* Un **visualiseur d'applets**.



Portabilité:
==============

Pour la plupart des langages **compilés**, on doit écrire un fichier source, et après le compiler pour obtenir un exécutable.

.. warning::

    Ce exécutable est valide juste pour le processeur qui l'as crée, et donc ne sera d'aucune utilité, pour une autre **architecture**. ce qui oblige une recomposition du code.


Pour résoudre ce problème de **Portabilité**, java offre son propre mécanisme de (compilation/exécution).

Quand un fichier source *(.java)* est compilé, le résultat n'est pas un **exécutable** pour le processeur, mais plutôt un fichier **(.class)**.

.. note::

    Le fichier *(.class)* n'est pas directement exécutable par le processeur. car cette classe est **identique** pour toutes les machines. et sera exécuté par la **machine virtuelle**.


