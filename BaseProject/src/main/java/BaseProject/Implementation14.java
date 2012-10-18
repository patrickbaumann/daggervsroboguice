package BaseProject;


import javax.inject.Inject;
public class Implementation14 implements Interface14 {

    private final Interface15 dependency;

    @Inject
    public Implementation14(Interface15 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "14..." + dependency.getString();
    }
}
