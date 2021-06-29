public class HelperFunctions {

    private static int idCounter = 0;
    public static synchronized int createCarID()  // generate unique id;
    {
        return idCounter++;
    }
}
