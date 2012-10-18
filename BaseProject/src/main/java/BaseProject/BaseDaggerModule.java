package BaseProject;

import dagger.Module;
import dagger.Provides;

/**
 * Created with IntelliJ IDEA.
 * User: patrick
 * Date: 10/9/12
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Module( complete = false )
public class BaseDaggerModule {

    @Provides Interface0 getInterface0(Interface1 dep){
        return new Implementation0(dep);
    }
    @Provides Interface1 getInterface1(Interface2 dep){
        return new Implementation1(dep);
    }
    @Provides Interface2 getInterface2(Interface3 dep){
        return new Implementation2(dep);
    }
    @Provides Interface3 getInterface3(Interface4 dep){
        return new Implementation3(dep);
    }
    @Provides Interface4 getInterface4(Interface5 dep){
        return new Implementation4(dep);
    }
    @Provides Interface5 getInterface5(Interface6 dep){
        return new Implementation5(dep);
    }
    @Provides Interface6 getInterface6(Interface7 dep){
        return new Implementation6(dep);
    }
    @Provides Interface7 getInterface7(Interface8 dep){
        return new Implementation7(dep);
    }
    @Provides Interface8 getInterface8(Interface9 dep){
        return new Implementation8(dep);
    }
    @Provides Interface9 getInterface9(Interface10 dep){
        return new Implementation9(dep);
    }
    @Provides Interface10 getInterface10(Interface11 dep){
        return new Implementation10(dep);
    }
    @Provides Interface11 getInterface11(Interface12 dep){
        return new Implementation11(dep);
    }
    @Provides Interface12 getInterface12(Interface13 dep){
        return new Implementation12(dep);
    }
    @Provides Interface13 getInterface13(Interface14 dep){
        return new Implementation13(dep);
    }
    @Provides Interface14 getInterface14(Interface15 dep){
        return new Implementation14(dep);
    }
    @Provides Interface15 getInterface15(Interface16 dep){
        return new Implementation15(dep);
    }
    @Provides Interface16 getInterface16(Interface17 dep){
        return new Implementation16(dep);
    }
    @Provides Interface17 getInterface17(Interface18 dep){
        return new Implementation17(dep);
    }
    @Provides Interface18 getInterface18(Interface19 dep){
        return new Implementation18(dep);
    }
    @Provides Interface19 getInterface19(Interface20 dep){
        return new Implementation19(dep);
    }
    @Provides Interface20 getInterface20(Interface21 dep){
        return new Implementation20(dep);
    }
    @Provides Interface21 getInterface21(Interface22 dep){
        return new Implementation21(dep);
    }
    @Provides Interface22 getInterface22(Interface23 dep){
        return new Implementation22(dep);
    }
    @Provides Interface23 getInterface23(Interface24 dep){
        return new Implementation23(dep);
    }
    @Provides Interface24 getInterface24(Interface25 dep){
        return new Implementation24(dep);
    }
    @Provides Interface25 getInterface25(Interface26 dep){
        return new Implementation25(dep);
    }
    @Provides Interface26 getInterface26(Interface27 dep){
        return new Implementation26(dep);
    }
    @Provides Interface27 getInterface27(Interface28 dep){
        return new Implementation27(dep);
    }
    @Provides
    Interface28 getInterface28(Interface29 dep){
        return new Implementation28(dep);
    }
    @Provides
    Interface29 getInterface29(Interface30 dep){
        return new Implementation29(dep);
    }
}
