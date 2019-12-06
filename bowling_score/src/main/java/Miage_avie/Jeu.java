package Miage_avie;

public class Jeu {
    private Integer score1;
    private Integer score2;

    public Jeu(Integer score1, Integer score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public Integer getScore1() {
        return score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public Integer getNombreDeQuilleTombees(){
            return score1 + score2;
    }

    public boolean scoreEstSpare(){
        return (score1+score2)==10 && score2!=0;
    }

    public boolean scoreEstStrike(){
        return (score1+score2)==10 && score2==0;
    }
}
