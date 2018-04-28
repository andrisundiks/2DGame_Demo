package entities.creatures;

import entities.Entity;

import java.awt.*;

public abstract class Creature extends Entity {

    protected int health;

    public Creature(float x, float y) {
        super(x, y);
        health = 10;
    }

    @Override
    public abstract void tick();

    @Override
    public abstract void render(Graphics g);
}