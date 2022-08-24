package small_programs.languagefamilies;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    public Language(String name1, int speakers, String regions, String order) {
      this.name = name1;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = order;
    }
  
    public static void main(String[] args) {
      // Spanish
      Language spanish = new Language("Spanish", 206051293, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
      System.out.println("\nspanish = ");
      spanish.getInfo();
     
      // Mayan
      Mayan kiche = new Mayan("Ki'che'", 2330000);
      System.out.println("\nkiche = ");
      kiche.getInfo();

      // Mandarin & Burmese
      SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
      System.out.println("\nmandarin = ");
      mandarin.getInfo();
      SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
      System.out.println("\nburmese = ");
      burmese.getInfo();
  
    }
  
    public void getInfo() {
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + wordOrder + ".");
      
    }
  
  }
  
  
  
  
  