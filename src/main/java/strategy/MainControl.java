package strategy;

public class MainControl {
    public void action(String userInput){
        new Action("Water").callAction();

        new Action("Fire").callAction();
    }
}
