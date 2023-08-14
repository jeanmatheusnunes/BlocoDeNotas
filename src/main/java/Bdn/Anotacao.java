package Bdn;

import java.time.LocalDate;
import java.util.Date
public class Anotacao {
    String texto;
    LocalDate data;
    int id;
    boolean removido = false;

    public Anotacao(String texto, int id) {
        this.texto = texto;
        this.id = id;
        this.data = LocalDate.now();
    }
    public String getTexto() {
        return texto;
    }

    public int getId() {
        return id;
    }
}
