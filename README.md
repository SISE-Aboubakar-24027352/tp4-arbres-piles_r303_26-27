# TP 4 : Arbres et piles 

## 1 Arbres

1. La structure d’arbre permet de modéliser toutes sortes de situations, tant strictement techniques que fonctionnelles. Lister plusieurs exemples de telles situations, tant techniques que fonctionnelles, o`u un arbre est utile ou nécessaire. 

- Nous allons simuler un DOM ( _Document Object Model_ ), qui décrit un document XML/HTML. 

2. Implémenter une structure d’arbre d’éléments génériques. 

3. Avant de pouvoir afficher les données contenues dans un arbre, il est nécessaire de pouvoir le parcourir. Combien de fa¸cons différentes de pourcourir un arbre connaissez-vous ? Toutes sont-elles applicables à un arbre n-aire ? 

4. Quelle est le nom de la méthode de parcours qui commence par la racine ? 

5. Écrire une méthode de parcours préfixé. 

6. Écrire une méthode toString() qui retourne une chaˆıne de caract`eres représentant le contenu d’un arbre parcouru en préfixé. 

7. Tester votre structure d’arbre en simulant, par exemple, le DOM du code HTML suivant (ou tout autre code html) :
```html
<html>
   <head>
      <title>Page test </title>ù
   </head>
   <body>
      <h1>Titre niveau 1</h1>
      <p >Ceci est un paragraphe </p>
   </body>
</html>
```

## 2 Application des arbres

1. Votre code pour la structure d’arbre est-il réutilisable pour travailler avec du JSON ? Pour décrire un arbre de solutions pour un jeu d’échecs, ou un arbre de décision ? Si oui, testez-le avec l’expression arithmétique (2 + 3) _∗_ 5 _−_ (9 _−_ (1 + (3 + 4)) _∗_ 3) constituée uniquement d’entiers positifs compris entre 0 et 9. 

   - Si non, écrire à la main l’arbre correspondant à l’expression ci-dessus, puis écrire le résultat d’un parcours **postfixé** de cet arbre. 

   - Ensuite, modifiez votre code pour pouvoir livrer une bibliothèque (API). Tester avec l’expression arithmétique ci-dessus. 

2. Parcourir, manuellement ou par programme, l’arbre de l’expression précédente de fa¸con **postfixée** . 

## 3 Piles 

1. S’inspirer (i.e., _consulter la javdoc_ de la classe java `Stack<T>` pour écrire votre propre classe `MaPile<T>` . Utiliser comme base l’une des structures chaˆınées que vous avez déjà développées. 

2. La **notation postfixée** , ou _Notation Polonaise Inversée_ (NPI), est une fa¸con non-ambig¨ue d’écrire une expression arithmétique _sans parenth`eses_ (cf. exercice précédent). Par exemple, la NPI de l’expression “((5+2) _∗_ (8 _−_ 3)) _/_ 4” est “52+83 _−∗_ 4 _/_ ”. Vous pouvez le vérifier en créant l’arbre correspondant, et en le parcourant de fa¸con postfixée. 

   - Une expression NPI _e_ peut ˆetre évaluée en utilisant une pile, avec l’algorithme suivant (on rappelle qu’une _opération_ , ici binaire, consiste à appliquer un _opérateur_ entre deux _opérandes_ , dan l’ordre de lecture) : 

```md
**while** il reste des op ́erandes à lire dans e **do**
   lire terme suivant t de e
   **if** t est un opérande then
      empiler(t)
   **end if**
   **if** t est un opérateur **then**
      y ← d ́epiler()
      x ← d ́epiler()
      on appelle op l’opérateur correspondant à t
      r ← calculer x op y
      empiler r
   **end if**
**end while**
```

Dans cet algorithme, on suppose que l’expression est _bien formée_ , i.e. qu’elle ne contient aucune erreur de syntaxe. 

programmer cet algorithme, et le tester. Pour simplifier, on ne traitera que des expressions avec les 3 opérations +, - et *, sur des entiers compris entre 0 et 9. 

