diagnostique('Baisse de vision brutal', 'OEil rouge', 'OEil qui pleur', 'Avoir limpression davoir du sable dans les yeux', 'Baisse de vision legere','Vide', 'Vide', 'La keratite').
diagnostique('Baisse de vision brutal', 'Non oeil rouge', 'Temperature<38', 'Baisse de vision legere', 'Mal au yeux','Douleur oculaire modere', 'Douleur lorsque loeil bouge', 'La neuropathie optique ischemique anterieure ou NOIA').
diagnostique('Baisse de vision brutal', 'Non oeil rouge', 'Temperature<38', 'Baisse de vision legere', 'Mal au yeux','Douleur oculaire modere', 'Douleur lorsque loeil bouge', 'La neuropathie optique ischemique anterieure ou NOIA').
diagnostique('Mal de tete', 'Non fievre', 'Maux de tete apparus brutaiement', 'Maux de tete dun seul cote', 'Vomissement','Vide','Vide', 'Migraine').
diagnostique('Ecoulement au niveau de loreille', 'Demangeeaison au niveau de loreille', 'Vide', 'Vide', 'Vide', 'Vide', 'Vide',"L'eczema").
diagnostique('Fievre', 'Mal dans poitrine', 'Mal a la gorge', 'Mal de tete', 'Toux', 'Fatigue','Vide', 'La grippe ou influenza').
diagnostique('Fievre', 'Mal dans poitrine', 'Mal a la gorge', 'Mal de tete', 'Toux', 'Fatigue','Vide', 'La grippe ou influenza').
diagnostique_de(A,B,C,D,E,F,G,Y):-diagnostique(A,B,C,D,E,F,G,Y).