package BaseProject;


import javax.inject.Inject;
public class Implementation23 implements Interface23 {

    private final Interface24 dependency;

    @Inject
    public Implementation23(Interface24 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "23..." + dependency.getString();
    }
}
