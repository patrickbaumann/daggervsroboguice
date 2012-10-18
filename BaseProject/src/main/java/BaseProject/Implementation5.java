package BaseProject;


import javax.inject.Inject;
public class Implementation5 implements Interface5 {

    private final Interface6 dependency;

    @Inject
    public Implementation5(Interface6 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "5..." + dependency.getString();
    }
}
