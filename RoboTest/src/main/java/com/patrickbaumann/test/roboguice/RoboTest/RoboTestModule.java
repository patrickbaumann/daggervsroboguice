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
public class RoboTestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Interface30.class).to(Implementation30.class);
    }
}
