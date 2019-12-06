package Miage_avie;

import com.oracle.tools.packager.Log;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux = new ArrayList<>();
    private Integer nbLancerBonus;

    public Partie(Jeu leJeu) {
        for(int i=0; i<10; i++){
            jeux.add(leJeu);
        }
    }
    public Partie(Jeu leJeu, Jeu jeuBonus1){
        for(int i=0; i<10; i++){
            jeux.add(leJeu);
        }
        jeux.add(jeuBonus1);
    }

    public Partie(Jeu leJeu, Jeu jeuBonus1, Jeu jeuBonus2){
        for(int i=0; i<10; i++){
            jeux.add(leJeu);
        }
        jeux.add(jeuBonus1);
        jeux.add(jeuBonus2);
    }

    public Integer calculerScore(){
        Integer score = 0;
        for (int i=0; i<10;i++) {
            System.out.println(i);
            score += jeux.get(i).getNombreDeQuilleTombees();
            if(jeux.get(i).scoreEstSpare()){
                score += jeux.get(i+1).getScore1();
            }
            /*if(jeux.get(i).scoreEstStrike() && i<9){
                int nbLancer = 0;
                int lancerSuivant = 1;
                while(nbLancer<3){
                    score += jeux.get(i+lancerSuivant).getScore1();
                    if(!jeux.get(i+lancerSuivant).scoreEstStrike() && nbLancer<3){
                        score += jeux.get(i+lancerSuivant).getScore2();
                        nbLancer ++;
                    }
                    nbLancer ++;
                }
            }*/
        }
        return score;
    }
}
