package small_programs.languagefamilies;

public class SinoTibetan extends Language {
    public SinoTibetan(String languageName, int speakers) {
       super(languageName, speakers, "Asia", "subject-object-verb");

       if (this.name.contains("Chinese")) {
            wordOrder = "subject-verb-object";
        }

    }
    
}
