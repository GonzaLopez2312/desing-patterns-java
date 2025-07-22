package com.packages.Decorator.decorators;

import com.packages.Decorator.Enemy;

public abstract class EnemyDecorator implements Enemy {

    public Enemy enemy;

    public EnemyDecorator(Enemy enemy){
        this.enemy = enemy;
    }

    public double takeDamage() {
        return this.enemy.takeDamage();
    }
}
