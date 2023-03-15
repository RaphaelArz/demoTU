package Tests;

import Entities.Liaison;
import Entities.Port;
import Entities.Secteur;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SecteurTest {
    private Secteur unSecteur;
    private Liaison liaison1;
    private Liaison liaison2;
    private Liaison liaison3;
    private Port portDepart1;
    private Port portDestination11;
    private Port portDepart2;
    private Port portDestination2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        unSecteur = new Secteur(1,"la Rochelle");
        portDepart1 = new Port(1,"Port Quiberon");
        portDestination11 = new Port(1,"Le palais");
        liaison1 = new Liaison(1,"liaison1","15/03/2023","9h30",portDestination11,portDepart1);
        portDestination2 = new Port(2,"Belle ile en mer");
        portDepart2 = new Port(2,"Molène");
        liaison2 =new Liaison(2,"Liaison2","15/03/2023","14h45",portDestination2,portDepart2);
        liaison3 = new Liaison(3,"Liaison3","01/01/2024","7h00",portDestination11,portDepart1);



    }

    @org.junit.jupiter.api.Test
    void lesLiaisonDunPortDeDepart() {
        unSecteur.AjoutezUneLiaison(liaison1);

       unSecteur.AjoutezUneLiaison(liaison2);

        unSecteur.AjoutezUneLiaison(liaison3);


        ArrayList<Liaison>expected = unSecteur.lesLiaisonDunPortDeDepart(portDepart1);
        ArrayList<Liaison> actual = new ArrayList<>();
        actual.add(liaison1);
        actual.add(liaison3);

        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void lesLiaisonDunPortDeDepartEtDuneDate() {
    }

    @org.junit.jupiter.api.Test
    void obtenirHeureDuneLiaison() {
        unSecteur.AjoutezUneLiaison(liaison1);
        unSecteur.AjoutezUneLiaison(liaison2);
        String expected = unSecteur.ObtenirHeureDuneLiaison(liaison1);
        String actual = "9h30";
        assertEquals(expected,actual);

        expected =unSecteur.ObtenirHeureDuneLiaison(liaison2);
        actual= "14h45";
        assertEquals(expected,actual);

        expected = unSecteur.ObtenirHeureDuneLiaison(liaison3);
        actual="";
        assertEquals(expected,actual);
    }
}