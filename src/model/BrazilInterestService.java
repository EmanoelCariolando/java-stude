package model;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    double interstRate;

    public BrazilInterestService(double interstRate) {
        this.interstRate = interstRate;
    }

    @Override
    public double getInterstRate() {
        return interstRate;
    }


}
