package lse;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LSEDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		//Testing top5Search and using makeIndex with all the docs
		LittleSearchEngine thomas = new LittleSearchEngine();
		thomas.makeIndex("docs.txt", "noisewords.txt");
		System.out.println(thomas.top5search("delEp","wormlD"));
		
		//Testing getkeyword Method
//		String s = "";
//		while(!s.equals("q")) {
//			s = sc.nextLine();
//			System.out.println(thomas.getKeyword(s));
//		}
		
		//Testing Merge KeyWords and loadKeywordsFromDocument
//		HashMap<String,Occurrence> asdf = thomas.loadKeywordsFromDocument("AliceCh1.txt");
//		HashMap<String,Occurrence> qwer = thomas.loadKeywordsFromDocument("WowCh1.txt");
//		HashMap<String,Occurrence> asdf2 = thomas.loadKeywordsFromDocument("PercyJackson.txt");
//		HashMap<String,Occurrence> asdf3 = thomas.loadKeywordsFromDocument("test3.txt");
//		thomas.mergeKeywords(asdf3);
//		System.out.println(asdf3);
//		HashMap<String,Occurrence> asdf4 = thomas.loadKeywordsFromDocument("HarryPotterCh1.txt");
//		thomas.mergeKeywords(asdf4);
//		System.out.println(asdf4);
//		System.out.println(asdf3);
//		thomas.mergeKeywords(qwer);
//		thomas.mergeKeywords(asdf);
//		thomas.mergeKeywords(asdf2);
//		System.out.println(thomas.keywordsIndex);
		
		//Testing InsertLastOccurrence
		ArrayList<Occurrence> occs = new ArrayList<Occurrence>();
//		occs.add(new Occurrence("bleh",15));
//		occs.add(new Occurrence("bleh",12));
		occs.add(new Occurrence("bleh",8));
		occs.add(new Occurrence("bleh",7));
		occs.add(new Occurrence("bleh",5));
		occs.add(new Occurrence("bleh",3));
		occs.add(new Occurrence("awef",2));
		occs.add(new Occurrence("bleh",6));
		System.out.println(occs);
		ArrayList<Integer> ints = thomas.insertLastOccurrence(occs);
		System.out.println(occs);
		System.out.println(ints);
		
		sc.close();
	}
}
