package Entities;

public class Port {
    public int getIdPort() {
        return idPort;
    }

    public String getNomPort() {
        return nomPort;
    }

    private int idPort;

    public Port(int idPort, String nomPort) {
        this.idPort = idPort;
        this.nomPort = nomPort;
    }

    private String nomPort;
}
