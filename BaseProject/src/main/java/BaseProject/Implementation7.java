package BaseProject;


import javax.inject.Inject;
public class Implementation7 implements Interface7 {

    private final Interface8 dependency;

    @Inject
    public Implementation7(Interface8 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "7..." + dependency.getString();
    }
}
