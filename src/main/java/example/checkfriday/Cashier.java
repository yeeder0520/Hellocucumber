package example.checkfriday;

public class Cashier {

  private final Calculator calculator;

  public Cashier(Calculator calculator) {
    this.calculator = calculator;
  }

  public Integer useCalculate(String operation, int input1, int input2) {
    return switch (operation) {
      case "add" -> calculator.add(input1, input2);
      case "minus" -> calculator.minus(input1, input2);
      case "multiply" -> calculator.multiply(input1, input2);
      case "divide" -> Calculator.divide(input1, input2);
      default -> throw new IllegalArgumentException("請不要亂按 : " + operation);
    };
  }

}
