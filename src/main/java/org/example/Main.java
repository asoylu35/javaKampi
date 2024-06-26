package org.example;

import java.util.ArrayList;
import java.util.Collections;

class Main {

    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();

        ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
        credits.add(new MortgageManager());
        credits.add(new VehicleManager());
        credits.add(new OfficerManager());

        for (CreditManager credit : credits) {
            credit.calculate();
        }

    }
}
