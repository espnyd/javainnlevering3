package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {
            PrintWriter pw = new PrintWriter(mappe + "/" + filnavn);
            pw.print(samling.toString());
            pw.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}
