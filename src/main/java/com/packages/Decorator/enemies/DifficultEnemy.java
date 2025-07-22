package com.packages.Decorator.enemies;

import com.packages.Decorator.Enemy;

public class DifficultEnemy implements Enemy {

    public DifficultEnemy(){}

    @Override
    public double takeDamage(){
        return 5;
    }
}
