
/**
 * Beschreiben Sie hier die Klasse Apfelbaum.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class Apfelbaum {
    double hoehe;
    String ort;

    Apfelbaum(double eineHoehe, String einOrt){
        hoehe = eineHoehe;
        ort = einOrt;
    }

    void wachse(double einBetrag){
        if (einBetrag > 0) hoehe += einBetrag;
    }
}
