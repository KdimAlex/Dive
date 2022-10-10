import java.util.Scanner;
//
public class ScubaDive {
//-----------------------------------------------------------------------------
        public static final Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
        public static void main(String[] args) {
//Variables
            final double FEET_IN_ATMOSPHERE = 33;
            double depth, percentageO2, ambientPressure, o2Pressure, partialO2Pressure;
            char o2Group;

//Inputs from user
            System.out.println("What is the depth?");
            depth = keyboard.nextDouble();
            System.out.println("What is the oxygen percentage of O2?");
            percentageO2 = keyboard.nextDouble();

//Calculations used by every method
            ambientPressure = (depth / FEET_IN_ATMOSPHERE) + 1;

            o2Pressure = computeO2Pressure(percentageO2);
            partialO2Pressure = computePartialO2Pressure(percentageO2, ambientPressure);

//Final display for user
            System.out.println("Ambient pressure:                " + ambientPressure);
            System.out.println("O2 pressure:                     " + partialO2Pressure);


//O2 Group calculator
           // o2Group = (char)((int)(partialO2Pressure * 10) + 'A')

            char o2GroupLetter =  (char)((int)(partialO2Pressure*10) + 'A');

            System.out.println("The O2 Group is:                 " + o2GroupLetter);
            System.out.print('\n');
// Boolean statements
            if (partialO2Pressure > 1.4) {
                System.out.println("Exceeds maximal O2 pressure:     True");
            } else {
                System.out.println("Exceeds maximal O2 pressure:     False");
            }

            if (partialO2Pressure > 1.6) {
                System.out.println("Exceeds contingency O2 pressure: True");
            } else {
                System.out.println("Exceeds contingency O2 pressure: False");
            }

        }
//O2 Pressure calculator
        public static double computeO2Pressure(double percentageO2) {

            double o2Pressure;

            o2Pressure = percentageO2 / 100;

            return(o2Pressure);
        }
//Partial o2 Pressure calculator
        public static double computePartialO2Pressure(double percentageO2, double ambientPressure) {

            double o2Pressure, partialO2Pressure;

            o2Pressure = percentageO2 / 100;
            partialO2Pressure = o2Pressure * ambientPressure;

            return(partialO2Pressure);

            }

        }





