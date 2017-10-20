[![Build Status](https://travis-ci.org/paul604/LP_proj_po.svg?branch=master)](https://travis-ci.org/paul604/LP_proj_po)

# LP_proj_po

## Notice utilisateur

Lorsqu’on exécute le programme, une interface console et nous affiche les différentes options possibles, à savoir:
- Se déconnecter
- Liste des articles
- Status stocks
- Liste des locations pour un client
- Ajouter un client  
- Ajouter Location
- Montant des recettes sur une période
- Archiver les locations
- Sauvegarder

Chaque choix ont un numéro, ce numéro est à renseigner dans le terminal pour accéder à l’option désirée.

### Liste des articles
Si on choisit le numéro 1, on obtient la liste des articles qui peuvent être loués, le nouveau menu de choix nous permet de filtrer les articles :
- par type avec un ordre normal c’est-à-dire par le type de l’objet comme le fauteuil pour fauteuil roulant, Table pour la table d’alité et affiche par aordre alphabétique
- par type dans l’ordre inverse
- Référence avec un ordre normal : trie les articles par leur référence, comme la référence est un String, si un chiffre commence, alors il est trié comme une lettre.
- Référence dans l’ordre inverse : tri les articles par leur référence du plus grand au plus petit
- Marque avec un ordre normal : tri les articles par leur nom de marque par ordre alphabétique.
- Marque dans l’ordre inverse : tri les articles par leur nom de marque par ordre inverse de l’alphabet.
- Modèle avec un ordre normal : tri les articles par leur nom de modèle par ordre alphabétique.
- Modèle dans l’ordre inverse : tri les articles par leur nom de modèle par ordre inverse de l’alphabet.
- Prix croissant : tri les articles par leur prix du plus petit au plus grand.
- Prix décroissant : tri les articles par leur prix du plus grand au plus petit.

En choisissant l’option retour arrière, on retourne dans le menu principal.

### Statut Stocks

l’option status stocks, une fois choisi, affiche pour chaque article le stock disponible pour une location. avec à droite une représentation graphique du pourcentage sur 10 des articles qui reste

### Liste des locations pour un client

Cet option nous affiche les clients qui ont déjà fait une location ou que celle-ci est en cours, le numéro qui correspond  au client doit être saisi pour afficher l’ensemble des locations qui sont en cours ou fini. Si aucun client est enregistré dans l’application, alors celle-ci revient sur le menu principal en renvoyant un message.

Une fois le client choisi, on observe toutes les locations qui sont effectués ou qui sont en cours avec pour chaque,

### Ajouter un client

Lorsqu’on choisi cet option, l’application nous demande de saisir les coordonnées client, à savoir son nom, son prénom, son adresse, son numéro de téléphone et  son email.  On peut voir que le nom et prénom son obligatoire avec la présence du “\*” qui signale que ce champ doit être rempli pour créer le client.

### Ajouter une location

Cet option nous permet de créer une nouvelle location, l’application nous demande de choisir le client ou alors de le créer, si on choisi de le créer  l’application nous renverra vers le formulaire pour créer un client. Lorsqu’on a choisi le client, l’application nous demande de choisir l’article que l’on souhaiterait louer…

### Montant des recettes sur une période

Cette option une fois choisi, va nous demander la date du début de la période demandé exprimé en JJ/MM/AAAA, si vide, la date du jour est utilisé par défaut. Ensuite, l’application nous demande la date de fin en utilisant le même procédé que cité précédemment. Le logiciel nous renvoi le montant donné de la recette sur la période demandé.

### Archiver Location

Lorsqu’on choisit cette option, l’application nous demandera quel client pour archiver la location puis il faudra choisi la location parmi toute celle qui sont en cours pour le client choisi précédemment. Le fichier d’archive se trouve dans le dossier des exécutables et plus précisément dans le dossier archive.

### Sauvegarder

Cette option permet de sauvegarder les client ainsi que les locations dans l’application pour que celle-ci puis s’en souvenir si elle doit redémarrer.


## dependance

### Run

java 8

### Test

powermock 1.7.1:
- powermock-module-junit4
- powermock-api-mockito2
