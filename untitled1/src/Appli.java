/*
Exercice Prologin
Tout . dans le message doit être supprimé et lorsqu'un * est lu dans le texte,
tous les caractères qui suivent sont ignoré jusqu'à ce qu'on lise à nouveau un *

Exemple d'entrée : s.o*asdsad*..s.*sad*
Sortie attendue  : sos
*/

import java.util.Scanner;

public class Appli {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String encodedMessage = input.next();
        String decodedMessage = removeInterference(encodedMessage);
        System.out.println(decodedMessage);
    }
    public static String removeInterference(String message) {
        String decodedMessage = "";
        boolean interferingZone = false;
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == '*') {
                interferingZone = !interferingZone;
            }

            if(message.charAt(i) != '*' && message.charAt(i) != '.' && interferingZone == false) {
                decodedMessage+=message.charAt(i);
            }
        }

        return decodedMessage;
    }



}


