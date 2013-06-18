package com.patrickbaumann.transfuse;

import BaseProject.Interface0;
import android.app.Activity;
import android.os.Bundle;
import org.androidtransfuse.Factories;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransfuseActivity extends Activity {

    Interface0 dep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.

        dep = Factories.get(Injector.class).getInterface0();
    }


}
