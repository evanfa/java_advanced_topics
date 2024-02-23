package methodology.good.practice;

public class DryMain {


    public static void main(String[] args) {
        PrincipleDRY pDry = new PrincipleDRY();

        String strVal = "Lilia Ordoñez nacio el 17 de Octubre de 1984 y Fabio Alberto nacio el 10-Jul-1985";

        pDry.noDryPrinciple("10-Jul-85");
        pDry.dryPrinciple("10-Jul-1985");
    }


}
