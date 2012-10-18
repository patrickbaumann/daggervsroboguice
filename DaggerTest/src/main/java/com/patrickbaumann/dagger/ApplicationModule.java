package com.patrickbaumann.dagger;

import dagger.Module;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@Module(
        entryPoints = {HelloAndroidActivity.class},
        includes = {TestModule.class}
)
public class ApplicationModule {

}
