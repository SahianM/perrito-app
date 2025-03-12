package cl.desafiolatam.perritoapp.model;

import java.util.ArrayList;

public class Raza {
    private String status;
    private ArrayList<String> message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<String> message) {
        this.message = message;
    }

    public Raza(String status, ArrayList<String> message) {
        this.status = status;
        this.message = message;

    }
}
