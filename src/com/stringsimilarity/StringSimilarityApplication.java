package com.stringsimilarity;

import com.stringsimilarity.utils.Constants;

public class StringSimilarityApplication {

    public static void main(String[] args) {


        LevenshteinDistance levenshteinDistance= new LevenshteinDistance();
        DiceCoefficient diceCoefficient=new DiceCoefficient();
        double levDis=LevenshteinDistance.findSimilarity(Constants.STRING1,Constants.STRING2);
        System.out.println("The LevenshteinDistance for the given strings is "+levDis+"\n");

        double dicCoef=diceCoefficient.calculateDiceCoef(Constants.STRING1,Constants.STRING2);
        System.out.println("The diceCoefficient for the given strings is "+dicCoef+"\n");

    }

}

