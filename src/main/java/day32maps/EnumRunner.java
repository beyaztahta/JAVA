package day32maps;

public class EnumRunner {
    public static void main(String[] args) {

        String capital=UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbv= UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbv);

        System.out.println(UsStates.getStateNameFromAbbreviation("FL"));

         String stateName=UsStates.getStateNameFromCapıtal("Denver");
         System.out.println(stateName);

         String abbre=UsStates.getAbbreviationFromCapital("Atlanta");
         System.out.println(abbre);
    }






























}
