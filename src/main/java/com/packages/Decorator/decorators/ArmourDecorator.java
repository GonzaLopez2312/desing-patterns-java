package com.packages.Decorator.decorators;

import com.packages.Decorator.Enemy;

public class ArmourDecorator extends EnemyDecorator {

    public ArmourDecorator(Enemy enemy){
        super(enemy);
    }

    public double takeDamage(){
        return this.enemy.takeDamage() / 1.5;
    }

}
