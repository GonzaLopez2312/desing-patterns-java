package com.packages.Decorator;

import com.packages.Decorator.decorators.ArmourDecorator;
import com.packages.Decorator.decorators.HelmetDecorator;
import com.packages.Decorator.enemies.BaseEnemy;
import com.packages.Decorator.enemies.DifficultEnemy;

public class DecoratorMain {
    public static void main(String[] args){

        System.out.println("\n ------ DECORATOR ------ \n");

        Enemy baseEnemy = new BaseEnemy();
        System.out.println("Damage received by base enemy: " + baseEnemy.takeDamage());
        ArmourDecorator baseEnemyWithArmour = new ArmourDecorator(baseEnemy);
        System.out.println("Damage received by base enemy with armour: " + baseEnemyWithArmour.takeDamage());
        HelmetDecorator baseEnemyWithArmourAndHelmet = new HelmetDecorator(baseEnemyWithArmour);
        System.out.println("Damage received by base enemy with armour and helmet: " + baseEnemyWithArmourAndHelmet.takeDamage());
        System.out.println();

        Enemy difficultEnemy = new DifficultEnemy();
        System.out.println("Damage received by difficult enemy: " + difficultEnemy.takeDamage());
        ArmourDecorator difficultEnemyWithArmour = new ArmourDecorator(difficultEnemy);
        System.out.println("Damage received by difficult enemy with armour: " + difficultEnemyWithArmour.takeDamage());
        HelmetDecorator difficultEnemyWithArmourAndHelmet = new HelmetDecorator(difficultEnemyWithArmour);
        System.out.println("Damage received by difficult enemy with armour and helmet: " + difficultEnemyWithArmourAndHelmet.takeDamage());


    }
}
