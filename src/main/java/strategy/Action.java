package strategy;

public class Action {
    IStrategy strategy;

    public Action(String strategy) {
        switch (strategy) {
            case "Fire":
                this.strategy = new FireAttack();
                break;
            case "Water":
                this.strategy = new WaterAttack();
                break;
            default:
                break;
        }
    }

    public void callAction() {
        this.strategy.deploy();
    }
}
