package BaseProject;


import javax.inject.Inject;
public class Implementation10 implements Interface10 {

    private final Interface11 dependency;

    @Inject
    public Implementation10(Interface11 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "10..." + dependency.getString();
    }
}
