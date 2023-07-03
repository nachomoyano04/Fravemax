package fravemax;

import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * @author nacho
 */
public class Fravemax {

    public static void main(String[] args) {
        BigDecimal bg = new BigDecimal("43434.123123");
        System.out.println(bg.setScale(2, RoundingMode.HALF_DOWN));
    }
    
}
