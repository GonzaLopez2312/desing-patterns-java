package com.packages.Decorator.decorators;

import com.packages.Decorator.Enemy;

public class HelmetDecorator extends EnemyDecorator {

    public HelmetDecorator(Enemy enemy) {
        super(enemy);
    }

    public double takeDamage() {
        return this.enemy.takeDamage() / 2;
    }
}
