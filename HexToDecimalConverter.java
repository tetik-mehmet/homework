public class HexToDecimalConverter {
    public static void main(String[] args) {
        // Example hex values to convert
        String[] hexValues = {"1A", "FF", "2B3", "CAFE", "DEADBEEF"};
        
        System.out.println("Hexadecimal to Decimal Conversion");
        System.out.println("--------------------------------");
        
        for (String hex : hexValues) {
            try {
                // Use Long instead of Integer for larger hex values
                long decimal = Long.parseLong(hex, 16);
                System.out.println(hex + " (hex) = " + decimal + " (decimal)");
            } catch (NumberFormatException e) {
                System.out.println(hex + " (hex) = Too large to convert");
            }
        }
    }
}