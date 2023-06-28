import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Dhmiourgia antikeimenwn ths klashs ErgasiaEpiskeuhs
		ErgasiaEpiskeuhs ergasiaEpiskeuhs1 = new ErgasiaEpiskeuhs("Allagh ladiwn",20.00);
		ErgasiaEpiskeuhs ergasiaEpiskeuhs2 = new ErgasiaEpiskeuhs("Allagh filtrou kampinas",5.00);
		ErgasiaEpiskeuhs ergasiaEpiskeuhs3 = new ErgasiaEpiskeuhs("Suntirhsh franwn",30.00);
		
		ArrayList<ErgasiaEpiskeuhs> ergasiesEpiskeuhs = new ArrayList<ErgasiaEpiskeuhs>();
		
		ergasiesEpiskeuhs.add(ergasiaEpiskeuhs1);
		ergasiesEpiskeuhs.add(ergasiaEpiskeuhs2);
		ergasiesEpiskeuhs.add(ergasiaEpiskeuhs3);
		
		//Dhmiourgia antikeimenwn ths klashs TuposAntallaktikou
		TuposAntallaktikou tuposAntallaktikou1 = new TuposAntallaktikou("Suskeuasia ladiwn 4lt",30.00);
		TuposAntallaktikou tuposAntallaktikou2 = new TuposAntallaktikou("Filtro ladiou",20.00);
		TuposAntallaktikou tuposAntallaktikou3 = new TuposAntallaktikou("Filtro kampinas",30.00);
		TuposAntallaktikou tuposAntallaktikou4 = new TuposAntallaktikou("Takaki frenwn empros troxou",5.00);
		TuposAntallaktikou tuposAntallaktikou5 = new TuposAntallaktikou("Takaki frenwn pisw troxou",5.00);
		TuposAntallaktikou tuposAntallaktikou6 = new TuposAntallaktikou("Ygro frenwn",10.00);
		
		ArrayList<TuposAntallaktikou> tuposAntallaktikwn = new ArrayList<TuposAntallaktikou>();
		
		tuposAntallaktikwn.add(tuposAntallaktikou1);
		tuposAntallaktikwn.add(tuposAntallaktikou2);
		tuposAntallaktikwn.add(tuposAntallaktikou3);
		tuposAntallaktikwn.add(tuposAntallaktikou4);
		tuposAntallaktikwn.add(tuposAntallaktikou5);
		tuposAntallaktikwn.add(tuposAntallaktikou6);
		
		
	}

	System.out.println("Ergasies episkeuhs:");
	for(ErgasiaEpiskeuhs ergasiesEpiskeuhs : ErgasiaEpiskeuhs){
		System.out.println(ergasiesEpiskeuhs.getName() + "Kostos: " + ergasiesEpiskeuhs.getCost());
	}

	System.out.println("\n Tupoi antallaktikwn: ");
	for(TuposAntallaktikou tuposAntallaktikwn : tuposAntallaktikwn){
		System.out.println(tuposAntallaktikwn.getName() + " Kostos ana temaxio: " + tuposAntallaktikwn.getCostPerPrice);

	}

	System.out.println("\n Episkues:");
        for (Episkues episkeuhs : episkeuhs) {
            System.out.println("Diarkeia Episkeuhs: " + episkeuhs.getDuration() + " hmeres - Sunoliko kostos episkeuhs : " + episkeuhs.getTotalCost());
        }

}
