package BaseProject;


import javax.inject.Inject;
public class Implementation19 implements Interface19 {

    private final Interface20 dependency;

    @Inject
    public Implementation19(Interface20 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "19..." + dependency.getString();
    }
}
