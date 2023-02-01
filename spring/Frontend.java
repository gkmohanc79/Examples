package spring;

public interface Frontend {

    public default String getFrontEndTraining()
            // in interface we need to create or declare a method but not implement or call this is fundamental rule of interface
    {


        return " Angular frame work done";
    }

    public default int getFrontEndTrain()
    // in interface we need to create or declare a method but not implement this is fundamental rule of interface
    {
  int a=10;

  return a;


    }

    String getFrontEnd();
}
