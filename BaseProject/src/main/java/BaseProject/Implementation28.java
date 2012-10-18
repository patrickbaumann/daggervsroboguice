package BaseProject;


import javax.inject.Inject;
public class Implementation28 implements Interface28 {

    private final Interface29 dependency;

    @Inject
    public Implementation28(Interface29 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "28..." + dependency.getString();
    }
}
