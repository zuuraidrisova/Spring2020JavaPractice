package day09_NestedIfStatements_Ternary;

public class AgeGroupTernary {
    public static void main(String[] args) {
        byte age = 45;
        String output = (age < 3 && age > 0) ? "baby" : (age >= 3 && age <= 5) ? "toddler"
                : (age >= 6 && age <= 9) ? "kid" : (age >= 10 && age <= 12) ? "pre-teen"
                : (age >= 13 && age <= 17) ? "teenager" : (age >= 18 && age <= 20) ? "young adult"
                : (age >= 21 && age <= 39) ? "adult" : (age >= 40 && age <= 49) ? "young middle-aged adult"
                : (age >= 50 && age <= 54) ? "middle-aged adult" : (age >= 55 && age <= 64) ? "very young senior citizen"
                : (age >= 65 && age <= 74) ? "young senior citizen" : (age >= 75 && age <= 84) ? "senior citizen"
                : (age >= 85 && age <= 120) ? "old senior citizen" : "invalid entry";

        System.out.println(output);
    }

}

