package BaseProject;


import javax.inject.Inject;
public class Implementation2 implements Interface2 {

    private final Interface3 dependency;

    @Inject
    public Implementation2(Interface3 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "2..." + dependency.getString();
    }
}
