public class Gen {
    static String getGeneration(int year) {

        // initialize the generation variable
        String generation = "Invalid";

        // find the generation
        if (year <= 1945) {
            generation = "Silent Generation";
        } else {
            if (year <= 1964) {
                generation = "Baby Boomers";
            } else {
                if (year <= 1979) {
                    generation = "Generation X";
                } else {
                    if (year <= 1994) {
                        generation = "Millenials";
                    } else {
                        if (year <= 2009) {
                            generation = "Generation Z";
                        } else {
                            if (year <= 2024) {
                                generation = "Generation Alpha";
                            }
                        }
                    }
                }
            }
        }

        return generation;
    }
}
