package com.patrickbaumann.dagger;

import BaseProject.BaseDaggerModule;
import dagger.Module;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@Module(
        injects = {HelloAndroidActivity.class},
        includes = {BaseDaggerModule.class, DaggerTestModule.class}
)
public class ApplicationModule {

}
