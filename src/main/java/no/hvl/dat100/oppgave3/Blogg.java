package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

    public Blogg() {
        this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;
	}

	public Blogg(int lengde) {
        this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
       for(int i = 0;i<nesteledig;i++){
            if(innleggtabell[i].erLik(innlegg)){
                return i;
            }
       }
       return -1;
	}

	public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return nesteledig<innleggtabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {
        if (!finnes(innlegg) && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        } else {
            return false;
        }
	}
	
	public String toString() {
        String resultat = nesteledig + "\n";
        for (int i = 0; i < nesteledig; i++) {
            resultat += innleggtabell[i].toString();
        }
        return resultat;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}