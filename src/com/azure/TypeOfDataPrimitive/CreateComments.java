package com.azure.TypeOfDataPrimitive;

public class CreateComments {
    public static void main(String[] args) {
        String playingSport = "Cricket";    // sports name is cricket
        String name = "Virat Kohli";       // player name given
        String oppositeTeam= "England";   // Virat Kohli playing against england
        int run = 60;  // Virat Kohli batting

        /* Information about Virat. Virat Kohli is one of the best Indian cricketer.
        He is a batsman. At present he is playing against England
         */

        System.out.println(name);
        System.out.println("He is playing "  +  playingSport);
        System.out.println("He is playing against " + oppositeTeam);
        System.out.println("he made " + run + " runs. ");
    }
}
