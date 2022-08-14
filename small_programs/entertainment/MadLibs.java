package small_programs.entertainment;

/* This program generates a mad libbed story. */

public class MadLibs {
    public static void main(String[] args){
        String name1 = "Kennedy";
        String adjective1 = "fluffy";
        String adjective2 = "beautiful";
        String adjective3 = "purple";
        String verb1 = "punch";
        String noun1 = "onion";
        String noun2 = "Skeksis";
        String noun3 = "beetle";
        String noun4 = "rope";
        String noun5 = "car";
        String noun6 = "berry";
        String name2 = "Harper";
        int number = 6;
        String place1 = "Barbados";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }       
}
