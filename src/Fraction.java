import java.util.Objects;

public class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int number) {
        this(number, 1);
    }

    public Fraction sum(int number) {
        return new Fraction(this.numerator + (number * this.denominator), this.denominator);
    }

    public Fraction minus(int number) {
        return new Fraction(this.numerator - (number * this.denominator), this.denominator);
    }

    public Fraction multiply(int number) {
        return new Fraction(this.numerator * number, this.denominator);
    }

    public Fraction div(int number) {
        if (number == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return new Fraction(this.numerator, this.denominator * number);
    }

    public Fraction sum(Fraction fraction) {
        int newNumerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(Fraction fraction) {
        int newNumerator = (this.numerator * fraction.denominator) - (fraction.numerator * this.denominator);
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction fraction) {
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction div(Fraction fraction) {
        if (fraction.numerator == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль.");
        }
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int intValue() {
        return (int) doubleValue();
    }

    public long longValue() {
        return (long) doubleValue();
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return numerator * other.denominator == other.numerator * denominator;
    }

    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}