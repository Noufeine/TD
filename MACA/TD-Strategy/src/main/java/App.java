import attaque.Canon;
import attaque.LanceFlamme;
import attaque.Missile;
import attaque.Mitraillette;
import deplacement.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        //initialisation des attaques :
        Mitraillette mitraillette = new Mitraillette();
        LanceFlamme lanceFlamme = new LanceFlamme();
        Canon canon = new Canon();
        Missile missile =  new Missile();

        //initialisation des déplacements :
        Courir courir = new Courir();
        Rouler rouler = new Rouler();
        Voler voler = new Voler();

        //initialisation des unités :
        Unite soldats = new Unite("Soldats");
        Unite chars = new Unite("Chars");
        Unite helicoptere = new Unite("helicoptere");
        Unite helicoptere2 = new Unite("helicoptere");

        //choix des stratégies de combats
        soldats.combattre(mitraillette);
        soldats.seDeplacer(courir);
        chars.combattre(canon);
        chars.seDeplacer(rouler);
        helicoptere.seDeplacer(voler);
        helicoptere.combattre(lanceFlamme);
        helicoptere2.seDeplacer(voler);
        helicoptere2.combattre(missile);

        ArrayList<Unite> uniteArrayList = new ArrayList<>();
        uniteArrayList.add(soldats);
        uniteArrayList.add(chars);
        uniteArrayList.add(helicoptere);
        uniteArrayList.add(helicoptere2);

        for(Unite unite: uniteArrayList){
            System.out.println("-----------------");
            System.out.println("Nom de l'unité : "+unite.getName());
            System.out.println("Mode de déplacement utilisé : "+unite.getModeDeplacement());
            System.out.println("Mode d'attaque utilisé : "+unite.getModeAttaque());
            System.out.println("-----------------");
        }
    }
}
