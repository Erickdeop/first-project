package tabia.app;

public class Validator {
    public boolean isNumeric(String string){
        int intValue;

        if (string == null || string.equals("")){
            return false;
        };
        try {
            intValue = Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException e){
            System.out.print("Input is not a number. ");
        }
        return false;
    }
}
