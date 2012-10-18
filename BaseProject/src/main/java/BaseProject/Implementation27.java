package BaseProject;


import javax.inject.Inject;
public class Implementation27 implements Interface27 {

    private final Interface28 dependency;

    @Inject
    public Implementation27(Interface28 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "27..." + dependency.getString();
    }
}
