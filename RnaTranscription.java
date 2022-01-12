/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class RnaTranscription {

    String sb="";
    String transcribe(String dnaStrand) {
		for(int i=0;i<dnaStrand.length();i++)
		{
			if(dnaStrand.charAt(i)=='G')
				sb=sb+'C';
			else if(dnaStrand.charAt(i)=='C')
				sb=sb+'G';
			else if(dnaStrand.charAt(i)=='T')
				sb=sb+'A';
			else if(dnaStrand.charAt(i)=='A')
				sb=sb+'U';
			else
				sb=sb+dnaStrand.charAt(i);
		}
		return sb;
    }
}

public class Main
{
	public static void main(String[] args) {
		RnaTranscription rna =new RnaTranscription();
		System.out.println(rna.transcribe("ACGTGGTCTTAA"));
	}
}
