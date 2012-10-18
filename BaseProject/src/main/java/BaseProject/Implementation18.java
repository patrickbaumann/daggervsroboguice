package BaseProject;


import javax.inject.Inject;
public class Implementation18 implements Interface18 {

    private final Interface19 dependency;

    @Inject
    public Implementation18(Interface19 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "18..." + dependency.getString();
    }
}
