# challengeDevOps

1. Comment définiriez-vous le Devops ?
> Le Devops est une philosophie de développement et d'intégration continu qui permet de s'assurer de la qualité et du bon fonctionnement du code à chaque nouveau déploiement. Le Devops permet également de proposer des nouvelles versions plus régulièrement qu'avec d'autres méthodes de développement.

2. Qu’impose le Devops ?
> Le Devops impose de mettre en place des tests d'intégration (tests unitaires, fonctionnels...) ainsi que des tests de déploiement (non-régression...) au début du projet et de les exécuter à chaque mise en production.

3. Quels sont les inconvénients ou les faiblesses du Devops ?
> D'après moi, les inconvénients principaux du Devops sont qu'il est long à mettre en place au début d'un projet et qu'il est peu adapté aux "petits" projets sur lesquels une démarche Devops aurait un intérêt limité.

5. Quel est votre avis sur le Devops ?
> D'après moi, le Devops est une bonne philosophie qui permet de gagner du temps en automatisant les tests et d'éviter les mauvaises surprises lors de déploiements de code. En revanche, je pense qu'il est plus adapté aux "gros" projets réalisés en équipe plutôt qu'aux "petits" projets. 

6. Quels sont les tests primordiaux pour toute application ?
> Les tests primordiaux pour une application sont :
- les tests unitaires (tests de résultats de calculs en back)
- les tests fonctionnels (tests sur le parcours utilisateur dit end-to-end)
- les tests d'intégration (tests sur ce qui n'est pas dans le code, accès à la BDD par exemple)
- les tests de non-régression (le nouveau code ne casse pas l'ancien)
- les tests de sécurité (tests sur les injections SQL, le XSS, le brute force...)
