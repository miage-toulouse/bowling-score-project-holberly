package Miage_avie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
    @Test
    public void testCalculScoreSansStrikeNiSpare(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaques jeux
        Jeu leJeu = new Jeu(6, 0);
        Partie laPartie = new Partie(leJeu);
        //when : on calcul le score
        Integer score = laPartie.calculerScore();
        //then : on obtient un score de 60
        assertEquals(new Integer(60), score);
    }

    @Test
    public void testCalculScoreAvecQueDesSpares(){
        //given : une partie de 10 jeux avec que des spares
        Jeu leJeu = new Jeu(5,5);
        Jeu jeuBonus1 = new Jeu(5, null);
        Partie laPartie = new Partie(leJeu, jeuBonus1);
        //when : on calcul le score
        Integer score = laPartie.calculerScore();
        //then : on obtient un score de 150
        assertEquals(new Integer(150), score);
    }

    @Test
    public void testCalculScoreAvecQueDesStrikes(){
        //given : une partie de 10 jeux avec que des strikes
        Jeu leJeu = new Jeu(10, 0);
        Partie laPartie = new Partie(leJeu, leJeu, leJeu);
        //when : on calcul le score
        Integer score = laPartie.calculerScore();
        //then : on obtient un score de 150
        assertEquals(new Integer(300), score);
    }
}