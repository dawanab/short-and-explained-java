public class StaticVariable {

    // Instance variable 
    public String name;

    // Class Variable 
    public static String belongsTo = "Homo-Sapiens";

    
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        // Accessing the class variable by class name
        System.out.println(StaticVariable.belongsTo);

        StaticVariable male = new StaticVariable();
        male.name = "Hallen";

        StaticVariable female = new StaticVariable();
        female.name = "Darla";

        // Instance variable 
        System.out.println("Name of male = " + male);
        System.out.println("Name of female = " + female);

        // Class Variable accessed in a static way 
        System.out.println(male + " belongs to " + StaticVariable.belongsTo);
        // Class varibale not accessed in a static way
        System.out.println(female + " belongs to " + female.belongsTo);
        
    }

    /* From the above code, we can see that the instance variables male and 
     * female, share the static/class varibale 'belongsTo'. */
    
}
