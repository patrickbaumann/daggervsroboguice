package com.patrickbaumann.dagger;

import BaseProject.Interface0;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import dagger.ObjectGraph;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaggerActivity extends Activity {

    @Inject
    Interface0 dep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.

        ObjectGraph graph = ObjectGraph.get(new ApplicationModule());
        graph.inject(this);

    }


}
