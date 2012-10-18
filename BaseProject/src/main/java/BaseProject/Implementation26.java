package BaseProject;


import javax.inject.Inject;
public class Implementation26 implements Interface26 {

    private final Interface27 dependency;

    @Inject
    public Implementation26(Interface27 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "26..." + dependency.getString();
    }
}
