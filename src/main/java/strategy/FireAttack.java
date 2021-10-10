package strategy;

public class FireAttack implements IStrategy{
    @Override
    public void deploy() {
        System.out.println("Attack with fire");
    }
}
