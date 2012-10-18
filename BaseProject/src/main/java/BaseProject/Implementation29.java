package BaseProject;


import javax.inject.Inject;
public class Implementation29 implements Interface29 {

    private final Interface30 dependency;

    @Inject
    public Implementation29(Interface30 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "29..." + dependency.getString();
    }
}
