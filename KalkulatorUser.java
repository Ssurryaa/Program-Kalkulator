package Tugas;

public class KalkulatorUser {
    private Kalkulator math;

    public KalkulatorUser(Kalkulator math) {
        this.math = math;
    }

    void useKalkulatorSederhana(){
        this.math.kalkulatorSederhana();
    }

    void usebangunRuang(){
        this.math.bangunRuang();
    }

    void usebangunDatar(){
        this.math.bangunDatar();
    }

}
