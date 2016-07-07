/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapehashashin;

import byui.cit260.escapeHashashin.model.Conversation;
import byui.cit260.escapeHashashin.model.Player;
import byui.cit260.escapeHashashin.model.Character;

import byui.cit260.escapeHashashin.model.DiscoveryType;
import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.Location;
import byui.cit260.escapeHashashin.model.LockType;
import byui.cit260.escapeHashashin.model.Map;
import byui.cit260.escapeHashashin.model.PuzzleType;
import byui.cit260.escapeHashashin.model.Scene;
import byui.cit260.escapeHashashin.view.GameMenuView;
import byui.cit260.escapeHashashin.view.GobletView;
import byui.cit260.escapeHashashin.view.HelpMenuView;
import byui.cit260.escapeHashashin.view.SearchRoomView;
import byui.cit260.escapeHashashin.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garen
 */
public class EscapeHashashin {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        EscapeHashashin.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        EscapeHashashin.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        EscapeHashashin.inFile = inFile;
    }
    private static BufferedReader inFile = null;

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        try {

            EscapeHashashin.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            EscapeHashashin.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            EscapeHashashin.logFile = new PrintWriter(filePath);
            
            
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        } finally {
            try {
                if (EscapeHashashin.inFile != null) {
                    EscapeHashashin.inFile.close();
                }
                if (EscapeHashashin.outFile != null) {
                    EscapeHashashin.outFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            EscapeHashashin.outFile.close();
        }

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();

        GobletView gobletView = new GobletView();
        gobletView.display();

        SearchRoomView searchRoomView = new SearchRoomView();
        searchRoomView.display();
    }

    public static void setPlayer(Player player) {
        EscapeHashashin.player = player;
    }

    public static Player getPlayer() {
        return player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EscapeHashashin.currentGame = currentGame;
    }

}
