package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

        Blogg blogg = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(mappe + "/" + filnavn))) {
            int antall = Integer.parseInt(reader.readLine());
            blogg = new Blogg(antall);

            for (int i = 0; i < antall; i++) {
                String type = reader.readLine();
                int id = Integer.parseInt(reader.readLine());
                String bruker = reader.readLine();
                String dato = reader.readLine();
                int likes = Integer.parseInt(reader.readLine());

                if ("TEKST".equals(type)) {
                    String tekst = reader.readLine();
                    blogg.leggTil(new Tekst(id, bruker, dato, likes, tekst));
                } else if ("BILDE".equals(type)) {
                    String tekst = reader.readLine();
                    String url = reader.readLine();
                    blogg.leggTil(new Bilde(id, bruker, dato, likes, tekst, url));
                }
            }

        } catch (Exception e) {
            System.out.println("Feil ved lesing av fil: " + e.getMessage());
        }

        return blogg;

	}
}
