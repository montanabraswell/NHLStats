/*
 * Java Tutorial #13
 * MOOC NHL Stat 
 */
package main;

/**
 *
 * @author Montana
 */
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println(" Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
        
        
        System.out.println("Print the top ten players based on goals");
        NHLStatistics.sortByGoals(10);
        
        System.out.println();
        
        System.out.println("Print the top 25 players based on penalty amounts");
        NHLStatistics.sortByPentalties();
         NHLStatistics.top(25);
         
         System.out.println();
         
         
        System.out.println("Print the statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println();
        
        System.out.println("Print the statistics for Philadelphia Flyers: ");
        NHLStatistics.teamStatstics("PHI");

        System.out.println();
        
        System.out.println("Print the players in Anahiem Ducks: ");
        NHLStatistics.searchByPlayer("ANA");
        NHLStatistics.sortByPoints();
        
    }
}