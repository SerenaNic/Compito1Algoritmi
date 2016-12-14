# Compito1Algoritmi
In una cittadella universitaria vi sono n facoltà, ciascuna delle quali è individuata da un codice numerico ed ha associate alcune informazioni come il numero totale di iscritti, il costo di mantenimento della struttura, la possibile presenza di un dormitorio e l’elenco dei corsi di laurea. Ogni corso di laurea è, a sua volta, identificato da un codice numerico, da un livello di difficoltà, da un numero di materie e da una durata. Due facoltà possono essere collegate fra loro per mezzo di tratte stradali bidirezionali, ciascuna identificata da un codice intero e avente una certa lunghezza. 
Si rappresenti la situazione sopra descritta e si implementino le seguenti funzioni (il candidato non si deve occupare dell’inizializzazione del sistema, ma può ipotizzare un funzionamento a regime):

1.	metodo m1 che riceve due facoltà fa1 e fa2 ed un numero decimale l. La funzione inserisce nel sistema l’informazione che due facoltà sono collegate da una tratta di lunghezza l, a patto che fra fa1 e fa2 non esista già una tratta di collegamento.

2.	metodo m2 che accetta in ingresso una lista list di facoltà, un numero decimale k e un intero m. La funzione restituisce la lista delle facoltà tali che (1) non siano comprese in list, (2) il costo di mantenimento della facoltà sia minore di k e (3) il livello medio di difficoltà dei suoi corsi di laurea sia superiore o uguale a m.

3.	metodo m3 che accetta in ingresso un intero k e un decimale v. La funzione restituisce la lista delle facoltà collegate direttamente ad almeno altre due facoltà in cui (1) è presente un dormitorio, (2) vi sono più di k corsi di laurea e (3) la distanza minima fra di esse è minore di v.

4.	metodo m4 che riceve due facoltà fa1 e fa2, un decimale l, una lista di facoltà list in cui non è possibile accedere a causa di lavori in corso e un intero k. La funzione deve restituire la distanza minima esistente fra fa1 e fa2, a patto di transitare solo su tratte di lunghezza superiore o uguale a l e di passare per facoltà in cui (1) sia possibile accedere, (2) vi sono meno di k corsi la cui durata è minore di 5 anni.

Valutare la complessità delle funzioni proposte.
