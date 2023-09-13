package aula8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Frequencia {

    Boolean presenca;
    LocalDate dataAula;

    @Override
    public String toString() {
        return "Frequencia{" +
                "presenca=" + presenca +
                ", dataAula=" + dataAula +
                '}';
    }
}