package com.stringsimilarity.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.stringsimilarity.DiceCoefficient;
import com.stringsimilarity.LevenshteinDistance;

class StringSimilarityApplicationTest {

    DiceCoefficient diceCoef=new DiceCoefficient();
    LevenshteinDistance levDis=new LevenshteinDistance();

    @Test
    void testLevDis() {

        String s1="hello";
        String s2="bello";

        assertEquals(0.8, levDis.findSimilarity(s1,s2));
    }

    @Test
    void testLevDisSec() {

        String s1="paper";
        String s2="payer";

        assertEquals(0.8, levDis.findSimilarity(s1,s2));
    }

    @Test
    void testDiceCoef() {

        String s1="hello";
        String s2="bello";
        assertEquals(0.75, diceCoef.calculateDiceCoef(s1, s2));
    }

    @Test
    void testDiceCoefSec() {

        String s1="paper";
        String s2="payer";
        assertEquals(0.5, diceCoef.calculateDiceCoef(s1, s2));
    }

}
