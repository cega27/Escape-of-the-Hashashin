/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.model.Location;
import byui.cit260.escapeHashashin.model.Map;
import byui.cit260.escapeHashashin.model.Scene;
import java.util.Arrays;

/**
 *
 * @author Garen
 */
public class MapControl {

   public static Map createMap() {
        //create the map
        Map map = new Map(5, 5);

        //create a list of different scenes in the game
        Scene[] scenes = createScenes();

        //assign the different scenes to locations in the map
        map.setLocations(assignScenesToLocations(map, scenes));

        return map;

    }                

    public enum SceneType {
        start,
        library,
        hallway,
        barracks,
        throneRoom,
        bathroom,
        wineCellar,
        kitchen,
        chefOffice,
        tunnel,
        outsideWall,
        balcony,
        mainHall,
        conversation1,
        conversation2,
        conversation3,
        conversation4,
        garden,
        maze,
        shore,
        boat;

    }
    

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("Congratulations. Your mission is complete,"
                + "You have killed the evil King."
                + "Hurry and escape before your murder is noticed.");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene libraryScene = new Scene();
        libraryScene.setDescription("Here is the Kings library. What knowledge is contained"
                + "here. You wonder if there could be any value placed upon certain books.");
        libraryScene.setMapSymbol("LB");
        libraryScene.setBlocked(false);
        scenes[SceneType.library.ordinal()] = libraryScene;

        Scene hallwayScene = new Scene();
        hallwayScene.setDescription("No one is here in the hallway. You do hear footsteps but"
                + "they seem very far off.");
        hallwayScene.setMapSymbol("HW");
        hallwayScene.setBlocked(false);
        scenes[SceneType.hallway.ordinal()] = hallwayScene;

        Scene barracksScene = new Scene();
        barracksScene.setDescription("You have stumbled into the guards quarters."
                + "Luckily, all guards are on duty for the gala event. There is nothing for you here."
                + "It is best for you to resume your escape.");
        barracksScene.setMapSymbol("BK");
        barracksScene.setBlocked(false);
        scenes[SceneType.barracks.ordinal()] = barracksScene;

        Scene throneRoomScene = new Scene();
        throneRoomScene.setDescription("The impressive hall of judgement. The evil king sat upon"
                + "his throne and set many good people to death. All the while drinking from his"
                + "priceless goblet-Wait, the goblet. You know from rumors that the security for"
                + "the goblet has always been duplicates placed with the real goblet. You however"
                + "have been told the secret to discovering the true one.");
        throneRoomScene.setMapSymbol("TR");
        throneRoomScene.setBlocked(false);
        scenes[SceneType.throneRoom.ordinal()] = throneRoomScene;

        Scene bathroomScene = new Scene();
        bathroomScene.setDescription("Inside the bathroom you find the traditional"
                + "party guest who can't hand their alcohol.");
        bathroomScene.setMapSymbol("BR");
        bathroomScene.setBlocked(false);
        scenes[SceneType.bathroom.ordinal()] = bathroomScene;

        Scene wineCellarScene = new Scene();
        wineCellarScene.setDescription("The wineceller underneath the kitchen. The cold dry temperatures"
                + "keep the wine and liquor perfectly perserved as they age. Quitely you slip behind all the"
                + "racks of liquor and find a stone held losely closed by a barrel. You move it to discover"
                + "the rumored excape passage. It has however an interesting lock.");
        wineCellarScene.setMapSymbol("WC");
        wineCellarScene.setBlocked(false);
        scenes[SceneType.wineCellar.ordinal()] = wineCellarScene;

        Scene kitchenScene = new Scene();
        kitchenScene.setDescription("You arrive in the busy kitchen. What did you expect from "
                + "the royal even going on. Lucky for you everyone is too busy to look at you twice."
                + " The master cook resides in his office and might be of good information.");
        kitchenScene.setMapSymbol("KT");
        kitchenScene.setBlocked(false);
        scenes[SceneType.kitchen.ordinal()] = kitchenScene;

        Scene chefOfficeScene = new Scene();
        chefOfficeScene.setDescription("The royal chef office. The high payed cook in all the kingdom."
                + "He is a master in cooking and makes a mean jumbillia.");
        chefOfficeScene.setMapSymbol("CO");
        chefOfficeScene.setBlocked(false);
        scenes[SceneType.chefOffice.ordinal()] = chefOfficeScene;

        Scene tunnelScene = new Scene();
        tunnelScene.setDescription("The famous escape tunnel. Large enought for you to stand in."
                + "Cobwebs are evidence that no one has used this tunnel for years.");
        tunnelScene.setMapSymbol("TN");
        tunnelScene.setBlocked(false);
        scenes[SceneType.tunnel.ordinal()] = tunnelScene;

        Scene outsideWallScene = new Scene();
        outsideWallScene.setDescription("Freedom. The smell of the dewy grass hits you "
                + "with triump. You have escaped to tell the tale of your accomplishments.");
        outsideWallScene.setMapSymbol("OW");
        outsideWallScene.setBlocked(false);
        scenes[SceneType.outsideWall.ordinal()] = outsideWallScene;

        Scene balconyScene = new Scene();
        balconyScene.setDescription("You lean over the balcony like a casual guest"
                + " observing the gala event. The only thing between you and escaping "
                + "are a bunch of noblemen and women.");
        balconyScene.setMapSymbol("BA");
        balconyScene.setBlocked(false);
        scenes[SceneType.balcony.ordinal()] = balconyScene;

        Scene mainHallScene = new Scene();
        mainHallScene.setDescription("The royal gala event. The perfect cover for your "
                + "murder. Not the perfect escape plan. You'll need to charm a few"
                + "nobility to eliminate suspicion.");
        mainHallScene.setMapSymbol("MH");
        mainHallScene.setBlocked(false);
        scenes[SceneType.mainHall.ordinal()] = mainHallScene;

        Scene conversation1Scene = new Scene();
        conversation1Scene.setDescription("You approach a woman who is beyound beauty "
                + "with the finest of jewelry. Her face looks concerned. You realize too "
                + "late this is the Queen. The woman who's husband you just killed.");
        conversation1Scene.setMapSymbol("C1");
        conversation1Scene.setBlocked(false);
        scenes[SceneType.conversation1.ordinal()] = conversation1Scene;

   
        Scene conversation2Scene = new Scene();
        conversation2Scene.setDescription("The gala was organized for one occasion and that "
                + "was for the celebration of the day before the wedding of the son of "
                + "the king and the daughter of Sir Edmand of the North. He has made it "
                + "his goal to converse with everyone at the event. Now its your turn.");
        conversation2Scene.setMapSymbol("C2");
        conversation2Scene.setBlocked(false);
        scenes[SceneType.mainHall.ordinal()] = conversation2Scene;

        Scene conversation3Scene = new Scene();
        conversation3Scene.setDescription("Head of the guard General Barathian approaches. You"
                + "better be convincing.");
        conversation3Scene.setMapSymbol("C3");
        conversation3Scene.setBlocked(false);
        scenes[SceneType.mainHall.ordinal()] = conversation3Scene;

        Scene conversation4Scene = new Scene();
        conversation4Scene.setDescription("The chef is very busy and very stressed "
                + "and kind of snaps at your wanting to talk to him. Yet he allows it "
                + "but only a little bit. Maybe you should see if he has anything of "
                + "value you could use.");
        conversation4Scene.setMapSymbol("C4");
        conversation4Scene.setBlocked(false);
        scenes[SceneType.mainHall.ordinal()] = conversation4Scene;

        Scene gardenScene = new Scene();
        gardenScene.setDescription("The moon is bright tonight. No sneaking around without "
                + "being scene. Everywhere is blocked for escape. You recognize tall "
                + "hedges and remember the garden has an eloborate maze and at the end the "
                + "shore.");
        gardenScene.setMapSymbol("GA");
        gardenScene.setBlocked(false);
        scenes[SceneType.garden.ordinal()] = gardenScene;

        Scene mazeScene = new Scene();
        mazeScene.setDescription("Left or right? Right or left? You must escape through the "
                + "maze.");
        mazeScene.setMapSymbol("MZ");
        mazeScene.setBlocked(false);
        scenes[SceneType.maze.ordinal()] = mazeScene;

        Scene shoreScene = new Scene();
        shoreScene.setDescription("The mist of the ocean hits your face in a warm embrace "
                + "as you pull a small raft into the water.");
        shoreScene.setMapSymbol("SH");
        shoreScene.setBlocked(false);
        scenes[SceneType.shore.ordinal()] = shoreScene;

        Scene boatScene = new Scene();
        boatScene.setDescription("You hit mainland and pull the boat onto shore. As you walk up "
                + "the path toward freedom you can hear the comotion from the castle."
                + "They have found the King's body but you are long gone.");
        boatScene.setMapSymbol("BT");
        boatScene.setBlocked(false);
        scenes[SceneType.boat.ordinal()] = boatScene;

        return scenes;
    }

    private static Location[][] assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.library.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.throneRoom.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.barracks.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.chefOffice.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.conversation4.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.wineCellar.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.tunnel.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.outsideWall.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.bathroom.ordinal()]);
       

        locations[0][3].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.balcony.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.mainHall.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.conversation1.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.conversation2.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.conversation3.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.barracks.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.maze.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.garden.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.shore.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.boat.ordinal()]);

        return locations;
    }
    
}
