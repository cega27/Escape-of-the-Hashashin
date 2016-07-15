/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

/**
 *
 * @author carlos
 */
public class LadyConversationView extends View{
 
     public LadyConversationView(){
        
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
                + "\n| As you invite a lady to dance you realize that she is not just any |"
                + "\n| guest in the banquet but she is Miss Ives. She is in charge of all |"
                + "\n| the keys in the castle including the key to the royal gardens.     |"
                + "\n --------------------------------------------------------------------"
                + "\n| 'It has surely been a pleasure dancing with you kind Sir'          |"
                + "\n| 'How are you enjoying the dance?'                                |"
                + "\n --------------------------------------------------------------------"
        + "\nDance Scene"
                + "\nA - 'I am just trying to scape from this place'"
                + "\nB - 'It is a nice dance, but I was hoping to see the Royal gardens'"
                + "\nC - 'It is quite the dance, but I think we should go somewhere more private'"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.ResponseA();
                break;
            case "B":
                this.ResponseB();
                break;
                case "C":
                this.ResponseC();
                break;
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    
    
    
    
}

    private void ResponseA() {
        LadyConv1View ladyConv1View = new LadyConv1View();
        ladyConv1View.display();
    }

    private void ResponseB() {
        LadyConv2View ladyConv2View = new LadyConv2View();
        ladyConv2View.display();
    }

    private void ResponseC() {
        LadyConv3View ladyConv3View = new LadyConv3View();
        ladyConv3View.display();
    }
}

