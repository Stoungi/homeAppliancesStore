import java.lang.String;
public class homeAppliancesStore {
    static String corpName, corpAddress;
    static int workers;
    public static String getCorpName() {
        return corpName;
    }

    public static void setCorpName(String corpName) {
        homeAppliancesStore.corpName = corpName;
    }

    public static String getCorpAddress() {
        return corpAddress;
    }

    public static void setCorpAddress(String corpAddress) {
        homeAppliancesStore.corpAddress = corpAddress;
    }

    public static int getWorkers() {
        return workers;
    }

    public static void setWorkers(int workers) {
        homeAppliancesStore.workers = workers;
    }


    public static void main(String[] args) {
        try {
            //corpName = args[0];
            homeAppliancesStore.setCorpName(args[0]);
            //corpAddress = args[1];
            homeAppliancesStore.setCorpAddress(args[1]);

            try {
                Double.parseDouble(corpName);


                System.out.println("error, did not give a PROPER company name [MUST BE AN ALPHANUMERICAL VALUE]");

            } catch (NumberFormatException o) {
                try{
                  Double.parseDouble(corpAddress);

                  System.out.println("error, did not give a PROPER company address [MUST BE AN ALPHANUMERICAL VALUE]");

                }catch(NumberFormatException t){
                    try {
                        //workers = Integer.parseInt(args[2]);
                        homeAppliancesStore.setWorkers(Integer.parseInt(args[2]));

                        System.out.println("name of company: " + homeAppliancesStore.getCorpName() + "\ncompany address: " + homeAppliancesStore.getCorpAddress() + "\namount of workers: " + homeAppliancesStore.getWorkers());


                    } catch (NumberFormatException e) {
                        System.out.println("error, cannot have a floating point number nor an alphanumerical value as a representation for the amount of workers");
                    }
                }

                }
            } catch (IndexOutOfBoundsException e) {
            System.out.println("error, didn't give enough arguments [3 arguments needed]");
        }

    }
}




