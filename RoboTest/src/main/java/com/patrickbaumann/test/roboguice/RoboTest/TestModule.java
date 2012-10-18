package com.patrickbaumann.test.roboguice.RoboTest;

import BaseProject.*;
import com.google.inject.AbstractModule;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/17/12
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Interface0.class).to(Implementation0.class);
        bind(Interface0.class).to(Implementation0.class);
        bind(Interface1.class).to(Implementation1.class);
        bind(Interface2.class).to(Implementation2.class);
        bind(Interface3.class).to(Implementation3.class);
        bind(Interface4.class).to(Implementation4.class);
        bind(Interface5.class).to(Implementation5.class);
        bind(Interface6.class).to(Implementation6.class);
        bind(Interface7.class).to(Implementation7.class);
        bind(Interface8.class).to(Implementation8.class);
        bind(Interface9.class).to(Implementation9.class);
        bind(Interface10.class).to(Implementation10.class);
        bind(Interface11.class).to(Implementation11.class);
        bind(Interface12.class).to(Implementation12.class);
        bind(Interface13.class).to(Implementation13.class);
        bind(Interface14.class).to(Implementation14.class);
        bind(Interface15.class).to(Implementation15.class);
        bind(Interface16.class).to(Implementation16.class);
        bind(Interface17.class).to(Implementation17.class);
        bind(Interface18.class).to(Implementation18.class);
        bind(Interface19.class).to(Implementation19.class);
        bind(Interface20.class).to(Implementation20.class);
        bind(Interface21.class).to(Implementation21.class);
        bind(Interface22.class).to(Implementation22.class);
        bind(Interface23.class).to(Implementation23.class);
        bind(Interface24.class).to(Implementation24.class);
        bind(Interface25.class).to(Implementation25.class);
        bind(Interface26.class).to(Implementation26.class);
        bind(Interface27.class).to(Implementation27.class);
        bind(Interface28.class).to(Implementation28.class);
        bind(Interface29.class).to(Implementation29.class);
        bind(Interface30.class).to(Implementation30.class);
    }
}
