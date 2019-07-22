package conditional_branch;

import java.util.Arrays;
import java.util.List;

public class Task4_4 {
    public static void main(String[] args) {
        // set initial today's temperature
        int temperature = 15;

        // weather is the weather until yesterday
        List<String> weather = Arrays.asList("rainy", "snowy", "cloudy", "sunny", "sunny");

        for (String wh : weather) {
            switch (wh) {
                case "sunny":
                    temperature += 3;
                    break;
                case "cloudy":
                    break;
                case "rainy":
                    temperature -= 2;
                    break;
                case "snowy":
                    temperature /= 2;
                    break;
            }
        }

        System.out.println(temperature);
    }
}
