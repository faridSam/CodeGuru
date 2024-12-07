Simple Factory est un idiom de programmation et non un patron de conception.

# Création d'un fichier README.md avec le contenu explicatif sur le pattern Simple Factory

# Simple Factory Pattern

## Description

Le patron de conception **Simple Factory** est un modèle de création qui consiste à encapsuler l'instanciation des objets dans une seule classe appelée "factory" (usine/fabrique) qui prend en parametre le type de l'objet a creer.
C'est une version simplifiee de Factory Method
qui consiste a encapsuler la creation des types 
d'objets en passant le type a la fabrique.

## Structure
1. **Factory Class** : Contient une méthode qui retourne une instance d'une classe spécifique.
2. **Produits** : Les classes que la factory crée.
3. **Client** : L'entité qui demande des objets à la factory.

## Avantages
- **Encapsulation de la création** : Simplifie le code client en déléguant la logique de création à la factory.
- **Réduction de la duplication** : Le processus de création est centralisé, évitant la répétition de code.
- **Facilité d'évolution** : Ajouter un nouveau type d'objet n'impacte pas directement le code client.

## Inconvénients
- **Dépendance accrue à la factory** : Toute modification dans la factory peut avoir un impact sur l'ensemble du système.
- **Difficile à maintenir avec de nombreux types** : Si de nombreux types d'objets sont créés, la classe factory peut devenir difficile à gérer.
- **Pas de polymorphisme naturel** : Comparé à d'autres patterns comme **Factory Method** ou **Abstract Factory**, Simple Factory ne permet pas d'utiliser des sous-classes pour modifier la création de manière polymorphe.

## Cas d'Utilisation
- **Initialisation Simplifiée** : Lorsque vous avez des objets avec des configurations complexes, la factory encapsule cette logique.
- **Prototypage rapide** : Utilisé dans les phases de développement précoce pour réduire la complexité.
- **Applications web** : Lors de la création d'instances basées sur des requêtes (par exemple : différentes réponses JSON).

## Quand l'utiliser
- Lorsque la logique de création est simple mais répétitive.
- Lorsque vous souhaitez centraliser la logique de création.
- Lorsque vous avez peu de types à gérer.



## Limites du Simple Factory

1. **Manque de flexibilité pour l'extensibilité :**
    - Si vous devez ajouter un nouveau type de produit, il faut modifier directement la classe factory. Cela viole le principe *Open/Closed Principle* (les classes doivent être ouvertes à l'extension mais fermées à la modification).

2. **Centralisation excessive :**
    - Toute la logique de création est concentrée dans une seule classe. Cela peut rendre la maintenance difficile si la factory doit gérer de nombreux types de produits.

3. **Couplage fort avec la factory :**
    - Les clients dépendent de la factory pour instancier des objets, ce qui peut poser problème si la factory change ou si vous voulez passer à un autre mode de création.

4. **Absence de polymorphisme :**
    - Comparé à des patterns plus avancés comme **Factory Method** ou **Abstract Factory**, Simple Factory ne permet pas de tirer parti du polymorphisme, ce qui limite la réutilisation et la flexibilité du code.

5. **Complexité croissante avec le nombre de types :**
    - À mesure que de nouveaux types d'objets sont ajoutés, la méthode de création dans la factory peut devenir un *switch-case* ou une série de *if-else* difficile à gérer.

6. **Difficile à tester :**
    - Tester une factory complexe peut nécessiter la création de nombreux scénarios pour chaque type d'objet géré, augmentant ainsi la charge de tests.

7. **Non adapté pour des hiérarchies complexes :**
    - Le Simple Factory ne gère pas bien les situations où les produits ont des relations complexes ou des hiérarchies (comme des objets imbriqués).

### Quand éviter d'utiliser Simple Factory :
- Lorsque les types d'objets à créer sont nombreux ou changent fréquemment.
- Si vous avez besoin de flexibilité et d’extensibilité dans votre système.
- Si vous voulez respecter pleinement les principes SOLID (notamment Open/Closed Principle).

---

### Alternatives :
Pour pallier ces limites, vous pourriez envisager des alternatives comme :
- **Factory Method** pour introduire du polymorphisme.
- **Abstract Factory** pour créer des familles d'objets liés.
- **Builder Pattern** pour gérer des objets complexes nécessitant de nombreuses étapes de construction.

Si votre projet devient plus complexe avec de nombreuses variantes, envisagez des modèles plus avancés comme **Factory Method** ou **Abstract Factory** pour une meilleure extensibilité.
"""
