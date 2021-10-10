package strategy;

public class WaterAttack implements IStrategy{
    @Override
    public void deploy() {
        System.out.println("Attack with Water");
    }
}
