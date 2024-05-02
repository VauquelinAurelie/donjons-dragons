classDiagram
direction BT
class Arme
class Bouclier
class Dragon
class Ennemi
class EquipementDefensif
class EquipementOffensif
class Game
class Gobelin
class Guerrier
class Magicien
class Main
class Menu
class Metier
class Personnage
class Philtre
class Plateau
class Sorcier
class Sort

Arme  -->  EquipementOffensif 
Bouclier  -->  EquipementDefensif 
Dragon  -->  Ennemi 
Gobelin  -->  Ennemi 
Guerrier  -->  Personnage 
Magicien  -->  Personnage 
Philtre  -->  EquipementDefensif 
Sorcier  -->  Ennemi 
Sort  -->  EquipementOffensif 
