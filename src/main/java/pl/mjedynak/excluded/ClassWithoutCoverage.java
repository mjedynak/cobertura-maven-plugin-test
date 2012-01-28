package pl.mjedynak.excluded;

public class ClassWithoutCoverage {

    public boolean isGreaterOrEqualToTen(int number) {
        if (number >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
