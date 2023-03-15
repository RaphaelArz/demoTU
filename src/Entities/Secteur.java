package Entities;

import java.util.ArrayList;

public class Secteur {
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Liaison> lesLiaisons;

    public Secteur(int idSecteur, String nomSecteur) {
        this.idSecteur = idSecteur;
        this.nomSecteur = nomSecteur;
        this.lesLiaisons = new ArrayList<>();
    }

    public int getIdSecteur() {
        return idSecteur;
    }

    public String getNomSecteur() {
        return nomSecteur;
    }

    public ArrayList<Liaison> getLesLiaisons() {
        return lesLiaisons;
    }

    public void AjoutezUneLiaison(Liaison uneLiaison){

        lesLiaisons.add(uneLiaison);
    }

    public  ArrayList<Liaison> lesLiaisonDunPortDeDepart(Port portDepart){
        ArrayList<Liaison> desLiaison = new ArrayList<>();
        for (Liaison uneLiaison : lesLiaisons){
            if (uneLiaison.getPortDepart().getIdPort() ==portDepart.getIdPort()){
                desLiaison.add(uneLiaison);
            }
        }
        return desLiaison;
    }

    public ArrayList<Liaison> lesLiaisonDunPortDeDepartEtDuneDate(Port portDepart,String uneDate){
        ArrayList<Liaison> desLiaison = new ArrayList<>();
        for (Liaison uneLiaison: lesLiaisons){
            if (uneLiaison.getPortDepart().getIdPort()== portDepart.getIdPort() && uneLiaison.getDateLiaison().compareTo(uneDate)==0){
                desLiaison.add(uneLiaison);
            }
        }
        return desLiaison;
    }
    public String ObtenirHeureDuneLiaison(Liaison uneLiaison){
        String heure="";
        for (Liaison liaison : lesLiaisons){
            if (liaison.getHeureLaison().equals(uneLiaison.getHeureLaison())){
                heure = liaison.getHeureLaison();
            }
        }
        return heure;
    }
}
