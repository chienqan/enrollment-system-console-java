package factory;

public class ProgramHelperFactory {
    public static ProgramHelper getHepler(String helperType) {
        if(helperType.equals("UserHelper")) {
            return new UserHelper();
        } else {
            return  null;
        }
    }
}
