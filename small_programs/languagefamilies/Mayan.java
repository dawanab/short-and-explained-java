package small_programs.languagefamilies;
class Mayan extends Language {
    Mayan(String languageName, int speakers) {
      super(languageName, speakers, "Central America", "verb-object-subject");
    }
  
    @Override
    public void getInfo() {
        System.out.println("Ki'che' is spoken by 2330000 people mainly in Central America. The language follows the word order: verb-object-subject. Fun fact: Ki'che' is an ergative language.");
      
    
    }
}
