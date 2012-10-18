package BaseProject;


import javax.inject.Inject;
public class Implementation13 implements Interface13 {

    private final Interface14 dependency;

    @Inject
    public Implementation13(Interface14 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "13..." + dependency.getString();
    }
}
