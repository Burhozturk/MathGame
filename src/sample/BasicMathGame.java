/*

 * FXGL - JavaFX Game Library. The MIT License (MIT).

 * Copyright (c) AlmasB (almaslvl@gmail.com).

 * See LICENSE for details.

 */

package demo;



import com.almasb.fxgl.app.GameApplication;

import com.almasb.fxgl.settings.GameSettings;



public class BasicMathGame extends GameApplication {



    @Override

    protected void initSettings(GameSettings settings) {

        settings.setWidth(800);

        settings.setHeight(600);

        settings.setTitle("Basic Math App");

        settings.setMenuEnabled(true);

        settings.setIntroEnabled(true);



    }



    public static void main(String[] args) {

        launch(args);

    }

}