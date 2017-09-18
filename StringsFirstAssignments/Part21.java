
public class Part21
{
    public String findSimpleGene(String dna , String startCoden , String stopCoden)
    {
        int k = 1 ;
        
        String ckString = dna.toUpperCase();
        
        if(ckString != dna)
             k = 0;
             
        
       int startIndex = ckString.indexOf(startCoden);
       if(startIndex == -1)
       {
     
           return "";
        
       }
      int currIndex = ckString.indexOf(stopCoden,startIndex +3);
      
      while(currIndex != -1){
           if((currIndex - startIndex)%3  == 0){
               
               String storeString = ckString.substring(startIndex,currIndex+3);
               if(k==0)
                  return  storeString.toLowerCase();
                else
                   return storeString;
              // dna.substring(startIndex , stopIndex +3);
            
            }
        else
           currIndex = ckString.indexOf(stopCoden, currIndex +1);
        
        
        
        }
        return " ";
    }

 
    void testSimpleGene(){
        
        String startCoden = "ATG";
        String stopCoden = "TAA";
        
  
        String dna = "atgatgtagtaa";
        System.out.println("DNA sequence is :" +dna);
        String gene = findSimpleGene(dna,startCoden,stopCoden);
        System.out.println("Gene is :" +gene);
   
   
        dna = "ATATTATATATTA";
        System.out.println("DNA sequence is:" +dna);
        gene = findSimpleGene(dna,startCoden,stopCoden);
        System.out.println("Gene is:" +gene);
   
   
        dna = "ATGATTAAATGATAA";
        System.out.println("DNA sequence is:" +dna);
        gene = findSimpleGene(dna,startCoden,stopCoden);
        System.out.println("Gene is :" +gene);
    
        dna = "ATGATTAAATTAA";
        System.out.println("DNA sequence is:" +dna);
        gene = findSimpleGene(dna,startCoden,stopCoden);
        System.out.println("Gene is :" +gene);
    
        
 
   }
   
       
   
}
