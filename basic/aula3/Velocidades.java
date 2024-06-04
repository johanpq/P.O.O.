package basic.aula3;

import java.text.DecimalFormat;

public class Velocidades {
    public static void main(String[] args) {
        double kph, mps, mph, pps;

        kph = 0.0;

        DecimalFormat df = new DecimalFormat(); //Aprender mais

        df.applyPattern("00");

        System.err.println("kph\tmps\tmph\tpps");

        while (kph <= 50.0) {
            mps = 0.2678 * kph;
            mph = 0.6214 * kph;
            pps = 0.9113 * kph;
            System.out.println(df.format(kph) + "\t" + df.format(mps) + "\t" + df.format(mph) + "\t" + df.format(pps));
            //System.out.printf("%.2g\t%.2g\t%.2g\t%.2g\n", kph, mps, mph, pps);
            kph+= 0.5;
        }
    }
}
