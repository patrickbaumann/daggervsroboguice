package BaseProject;


import javax.inject.Inject;
public class Implementation6 implements Interface6 {

    private final Interface7 dependency;

    @Inject
    public Implementation6(Interface7 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "6..." + dependency.getString();
    }
}
