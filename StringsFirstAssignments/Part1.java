
public class Part1
{
  
    public String findSimpleGene(String dna)
    {
       int startIndex = dna.indexOf("ATG");
       if(startIndex == -1)
       {
         
           return "";
        
       }
      int stopIndex = dna.indexOf("TAA",startIndex +3);
      
      while(stopIndex != -1){
           if((stopIndex - startIndex)%3  == 0){
               return dna.substring(startIndex , stopIndex +3);
            
            }
        else{
           stopIndex = dna.indexOf("TAA", stopIndex +1);
        }
        
        
        }
        return " ";
    }

 
    void testSimpleGene(){
  
        String dna = "ATAGTATCAACCTAAGCT";
        String gene = findSimpleGene(dna);
        System.out.println("DNA :" +dna+"\n" + "Gene :" +gene);
   
   
        dna = "AGTAGCCTATGAACTAC";
        gene = findSimpleGene(dna);
        System.out.println("DNA :" +dna+"\n" + "Gene :" +gene);
   
   
        dna = "ATGCATTACTGCCAATACGA";
        gene = findSimpleGene(dna);
        System.out.println("DNA :" +dna+"\n" + "Gene :" +gene);
   
   
        dna = "ATGTTACGATAA";
        gene = findSimpleGene(dna);
        System.out.println("DNA :" +dna+"\n" + "Gene :" +gene);
    
        dna = "ATGTTACGTAA";
        gene = findSimpleGene(dna);
        System.out.println("DNA :" +dna+"\n" + "Gene :" +gene);
        
        
 
   }
   
}