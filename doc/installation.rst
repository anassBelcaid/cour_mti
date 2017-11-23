.. _installation:

==========================================================
Installation de l’environnement de développement pour Java
==========================================================

Pour pouvoir suive le cours, et développer vos programmes, il est conseillé d'installer les *logiciels* suivants.


Java jdk
=========

le kit de développement java **jdk** *(java developement kit)*.


Linux (open jdk)
----------------

Pour installer **openJDK7**, taper la commande suivante dans un terminal::

    sudo apt-get install open-jdk-7-jdk


.. _mac:

Mac
-----
Installer **Oracle JDK 8**.


1. Se rendre dans la page `Oracle Download <http://www.oracle.com/us/downloads/index.html>`_.
2. Suivre le lien *java* puis *java SE*
3. Télécharger le kit de développement  (JDK).
4. Ouvrir le fichier **jdk-XXXX.dmg**  et lancer le programme d'installation.

Windows
--------

1. Même étape que :ref:`mac`
2. Maintenant il faut ajouter le répertoire **\bin** de JDK dans la variable *d’environnement* **PATH**
3. Détecter l'emplacement du dossier **bin** généralement dans::

    C:\Program Files\Java\jdk1.7.0_xx\bin

4. Ajouter ce chemin dans la variable système **PATH**::

    Paramètres systèmes avancées>Variable d’environnement

Chercher la variable **PATH** et cliquer sur modifier.

5. Ajouter un **;** puis ajouter l'emplacement du dossier **bin**.


Eclipse
=======

Pour le développement des projets en java, on utilisa `Eclipse <http://www.eclipse.org>`_ , qui un excellent environnment de developpement intégré **(IDE)**.


Sublime
========

Pour mieux apprendre la syntaxe des programmes **java**, et le processus de *compilation* et *d’exécution*, il est recommandé d’utiliser un éditeur de texte la **console** pour les premiers programmes.

`Sublime Text <http://www.sublimetext.com/>`_ reconnaît la  syntaxe de la plupart des langages de programmation, ainsi que des outils pour aider à la conception et l'analyse rapide du code.

Git
====

`git <http://fr.wikipedia.org/wiki/Git>`_  est un **logiciel de gestion de version décentralisé**, que vous pouvoir utiliser pour la gestion de votre projets **java** et aussi pour garder les dernières versions du **cours**. et **d'exercices**.

Installation
-------------

1. Installer `git <http://git-scm.com/>`_.
2. une maîtrise des commandes par la console est recommandée, mais on peut aussi utiliser une interface graphique::

    https://windows.github.com/

Premiers pas avec git
----------------------

voici quelque liens pour l'apprentissage de git( *à terminer avant la semaine 5 du cours*)

1. liste des commandes `commandes utiles <https://training.github.com/kit/downloads/github-git-cheat-sheet.pdf>`_.
2. Tutoriel en ligne `tutorial simple <https://try.github.io/>`_ .
3. Un jeu simple `Jeu <http://pcottle.github.io/learnGitBranching/>`_.
4. `tutorial sur votre ordinateur <http://gitimmersion.com/>`_ .
5. Vidéos officielles de git `Vidéos <http://git-scm.com/videos/>`_ .
