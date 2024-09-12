package sistem_gestiune_angajati;

public abstract class TechnicalEmployee extends Employee implements ProgramingSkills {

    public TechnicalEmployee(String name, int id, double salary){
        super(name,id,salary);
    }


    @Override
    public void debugCode(){
        System.out.println(super.getName() + "debugs code with advance techniques!");

    }
    public void learnNewTechnology(){

    }
}
