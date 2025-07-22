package com.packages.Decorator.enemies;

import com.packages.Decorator.Enemy;

public class BaseEnemy implements Enemy {

    public BaseEnemy(){}

    @Override
    public double takeDamage(){
        return 10;
    }
}
