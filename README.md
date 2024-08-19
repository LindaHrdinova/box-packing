  Úkolem je vytvořit program, který bude počítat velikost krabice potřebné pro zabalení výrobků.
  
  Předpokládáme, že vyrábíme různé výrobky. Každý výrobek může mít jinou velikost. ale všechny jsou ve tvaru kvádru. Tyto výrobky chceme balit do krabice. Požadavkem je, aby krabice měla tvar krychle a dále je požadavkem, aby krabice byla plně využita (bez mezer). Do krabice vždy umisťujeme pouze výrobky jednoho druhu. Ale krabice chceme mít pouze jednoho druhu, tedy musí být možné je použít pro náš libovolný výrobek. Počet výrobků v krabici není nijak omezen. Úkolem je určit nejmenší možnou velikost takové krabice pro zadané velikosti výrobků. Vstupem programu jsou velikosti vyráběných výrobků.
  
  Zadávána jsou vždy tři desetinná čísla udávající rozměry jednoho výrobku. Desetinné číslo je zadáno na dvě desetinná místa a je v rozsahu 0.01 až 10000000.00 včetně. Na vstupu jsou postupně zadány rozměry všech vyráběných výrobků. 
  
  Výstupem programu je vypočtená velikost krabice. Výstup je zobrazen na dvě desetinná místa ve formátu podle ukázky. Pokud rozměr krabice přesáhne hodnotu 10000000.00, program zobrazí informaci o příliš velké krabici (přesný formát je opět v ukázce). Pozor, za výpisem je odřádkování (\n).
  
  Pokud je vstup neplatný, program to musí detekovat a zobrazit chybové hlášení. Chybové hlášení zobrazujte na standardní výstup (ne na chybový výstup). Za chybu považujte:
  - nebyly zadané žádné výrobky,
  - pro výrobek nebyla zadaná tři čísla,
  - rozměr byl zadaný jako nečíselný,
  - rozměr nebyl z rozsahu 0.01 až 10000000.00.

___________________________________________________________________

  The task is to create a program that will calculate the size of the box needed to pack the products.

  We assume that we produce a variety of products. Each product may have a different size. but they're all in the shape of a block. We want to pack these products in a box. The requirement is that the box should be in the shape of a cube, and the requirement is that the box should be fully utilized (no gaps). We only ever place products of one type in the box. But we only want to have boxes of one kind, so it must be possible to use them for any of our products. There is no limit to the number of products in the box. The task is to determine the smallest possible size of such a box for the given product sizes. The input to the program is the sizes of the products to be manufactured.

  Three decimal numbers indicating the dimensions of one product are always entered. The decimal number is entered to two decimal places and is in the range 0.01 to 10000000.00 inclusive. The dimensions of all manufactured products are entered successively on the input. 

  The output of the program is the calculated box size. The output is displayed to two decimal places in the format shown in the example. If the size of the box exceeds the value 10000000.00, the program displays information about the box being too large (the exact format is again in the sample). Note that there is a line break (\n) after the listing.

  If the input is invalid, the program must detect this and display an error message. Display the error message on the standard output (not on the error output). Consider the following as an error:
  - No products have been entered,
  - three numbers were not entered for a product,
  - a dimension was entered as a non-numeric dimension,
  - the dimension was not from the range 0.01 to 10000000.00.

Translated with DeepL.com (free version)
