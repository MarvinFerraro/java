package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int totalCarton = 34;
        int totalCamion = 9;
        int trajet = 0;


        while (totalCarton > totalCamion) {
            totalCarton -= totalCamion;
            if (totalCarton > totalCamion) {

                trajet++;

                System.out.println(trajet + " trajet le nombre de trajet avec " + totalCarton + " cartons restants");

            } else {
                trajet++;
                System.out.println("Le dernier trajet : " + trajet + " sera de " + totalCarton + " cartons ");
            }
        }
    }
}
