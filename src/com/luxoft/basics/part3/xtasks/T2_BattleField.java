package com.luxoft.basics.part3.xtasks;

import java.util.Arrays;

public class T2_BattleField
{

    /**
     * TODO PUT YOUR DESIGN HERE
     */
    String[][] battleField = {
            {"C", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"F", " ", " ", " ", " ", " ", " ", " ", " "},
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"B", " ", " ", "B", " ", " ", " ", " ", "B"},
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"B", "B", "B", "B", " ", "B", " ", " ", "B"},
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"B", "B", " ", "T", "E", " ", " ", "B", " "}
    };

    void runTheGame() throws Exception
    {
        printCurrentBattleField();
    }

    /**
     * Should print battle field to console output.
     */
    private void printCurrentBattleField()
    {
        // TODO YOUR CODE HERE
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j+=9) {
                int k = j;
                String rowValue = "";
                while (k <=8) {
                    System.out.println(battleField[i][k]);
                    rowValue = rowValue + battleField[i][k];
                    k++;
                }
                System.out.println(rowValue);
            }
//            System.out.println(Arrays.toString(battleField[i]));
//        String [] battleField = {" |", "A ", "B ", "-|", "--", "--", "1|", "B ", "B "};
//        for (int i = 0; i < battleField.length; i= i + 3) {
//            System.out.println(battleField[i] + battleField[i + 1] + battleField[i + 2]);

        }

    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.


    public static void main(String[] args) throws Exception
    {
        T2_BattleField bf = new T2_BattleField();
        bf.runTheGame();
    }

    public T2_BattleField() throws Exception
    {
    }
}