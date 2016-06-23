/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.model.Map;

/**
 *
 * @author Garen
 */
class MapControl {

    static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        //create a list of different scenes in the game
        Scenes[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
       
    }

    private static Scenes[] createScenes() {
        System.out.println("createScenes() called in MapControl class");
        return null;
    }

    private static void assignScenesToLocations(Map map, Scenes[] scenes) {
       System.out.println("assignScenesToLocations() called in MapControl class");
        
    }
    
}
