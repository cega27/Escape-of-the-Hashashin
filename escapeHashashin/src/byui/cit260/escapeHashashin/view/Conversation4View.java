/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

/**
 *
 * @author Garen
 */
class Conversation4View extends View {
    
    public Conversation4View(){
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nLibrary"
            +"\n'Why must you bother me with your presense?! Can't you see I am busy?!"
                + "'Not only am I the Head Cook but this event is monumental for me.'"
                + "'So let me ask you one question... What do you need?'"
        + "\nthe hallway."
                + "\nA - 'Can I have the secret key to the secret escape route?'"
                + "\nB - 'Your second in command is requesting your eye for a certain"
                + "pastry'"
                + "\nC - 'I'm missing a key for the cellar do you have a spare?'"
                
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.C4responseA();
                break;
            case "B":
                this.C4responseB();
                break;
                case "C":
                this.C4responseC();
                break;
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    
    
    
    
}

    private void C4responseA() {
        C4ResponseA c4ResponseA = new C4ResponseA();
        c4ResponseA.display();
    }

    private void C4responseB() {
        C4ResponseB c4ResponseB = new C4ResponseB();
        c4ResponseB.display();
    }

    private void C4responseC() {
        C4ResponseC c4ResponseC = new C4ResponseC();
        c4ResponseC.display();
    }
}
