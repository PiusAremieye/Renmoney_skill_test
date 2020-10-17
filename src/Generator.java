import java.util.Arrays;
import java.util.List;

public class Generator {

  // generator
  public static int generator(long parameterA, long parameterB, long generatorAFactor, long generatorBFactor, long divisor, long numberOfComparison){
    List<Long> generators;
    long initialGeneratorA = parameterA;
    long initialGeneratorB = parameterB;

    int start = 1;
    int count = 0;

    while(start <= numberOfComparison){
      long multipliedFactorA = initialGeneratorA * generatorAFactor;
      long multipliedFactorB = initialGeneratorB * generatorBFactor;

      initialGeneratorA = multipliedFactorA % divisor;

      initialGeneratorB = multipliedFactorB % divisor;

      generators = Arrays.asList(initialGeneratorA, initialGeneratorB);

      if (binaryConverter(generators)) count++;
      start++;
    }
    return count;
  }

  // binary converter
  public static boolean binaryConverter(List<Long> generators){
    List<String> binary;

    String binaryGenAWithPadding = String.format("%32s", Long.toBinaryString(generators.get(0))).replaceAll(" ","0");
    String binaryGenBWithPadding = String.format("%32s", Long.toBinaryString(generators.get(1))).replaceAll(" ","0");
    binary = Arrays.asList(binaryGenAWithPadding, binaryGenBWithPadding);

    String genABinary = binary.get(0).substring(binary.get(0).length() - 8);
    String genBBinary = binary.get(1).substring(binary.get(1).length() - 8);

    return genABinary.equals(genBBinary);
  }
}
