/*

 */
package calculator_2;

/**
 * Model is the model class used to retrieve arithmetic operation based on what
 * operator was selected. The Model class has switch statement to determine what
 * arithmetic operation is executed.
 */
public class Model {

    private double number1;
    private double number2;
    private String operator;

    /**
     * A model class constructor that accepts 2 doubles and a string.
     *
     * @param num1 sets the num1.
     * @param num2 sets the num2.
     * @param op sets the operator.
     */
    public Model(double num1, double num2, String op) {
        number1 = num1;
        number2 = num2;
        operator = op;
    }

    /**
     * @return the double number1.
     */
    public double getNumber1() {
        return number1;
    }

    /**
     * @param number1 to set the number1.
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * @return the double number2.
     */
    public double getNumber2() {
        return number2;
    }

    /**
     * @param number2 to set the number2.
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     * @return the string operator.
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator to set the operator.
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * calculate method has a switch case for each operator on the calculator
     * GUI such as "+", "-", "*", "/", and another method "eventC" to clear if
     * "C" is pressed.
     *
     * @param number1 a double value used in the constructor to the switch.
     * @param number2 a double value used in the constructor to the switch.
     * @param operator a String value used in the constructor to determine what
     * part of the switch is executed.
     * @return a double value from the calculate method.
     *
     */
    public double calculate() {
        double result = 0;
        switch (this.getOperator()) {
            case "+":

                result = this.getNumber1() + this.getNumber2();
                return result;

            case "-":
                result = this.getNumber1() - this.getNumber2();
                return result;

            case "*":

                result = this.getNumber1() * this.getNumber2();
                return result;

            case "/":

                if (this.getNumber2() == 0) {
                    return 0;
                }

                result = this.getNumber1() / this.getNumber2();
                return result;

            default:
                return this.number2;

        }

    }

}
