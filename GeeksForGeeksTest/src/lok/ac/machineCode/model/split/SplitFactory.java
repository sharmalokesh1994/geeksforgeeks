package lok.ac.machineCode.model.split;

public class SplitFactory {

    private static SplitFactory instance;
    private SplitFactory(){};

    public Split getSplit( SplitType splitType){

        //Todo: We can use reflection api instead of if-else if the number of classes are very high
        if( splitType==SplitType.equal ){
            return new SplitEqual();
        }else{
            return new SplitUnequal();

        }
        //Todo: we should throw a custom Exception here
    }

    public static SplitFactory getInstance(){

        if( instance==null ){
            synchronized (SplitFactory.class)
            {
                if( instance==null ){
                    instance = new SplitFactory();
                }
            }
        }
        return instance;
    }

}
