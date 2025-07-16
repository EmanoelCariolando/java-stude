package model;

public class UsaInterestService implements InterestService{
        double interstRate;

        public UsaInterestService(){

        }
        public UsaInterestService(double interstRate) {
            this.interstRate = interstRate;
        }

        @Override
        public double getInterstRate() {
            return interstRate;
        }

    }
