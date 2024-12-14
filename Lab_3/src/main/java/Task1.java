public class Task1{
    public String convertTo16(int number){
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % 16;
            if (remainder >= 10) {
                // Convert 10-15 to 'A'-'F'
                result.append((char) ('A' + (remainder - 10)));
            } else {
                // Convert 0-9 to '0'-'9'
                result.append((char) ('0' + remainder));
            }
            number /= 16;
        }
        return result.reverse().toString(); // Reverse the string to get the correct order
    }

    public String task1(int startValue){
        if(startValue < 10 || startValue > 100){
            return "";
        }
        String result = startValue + ":" + convertTo16(startValue);
        for(int i = startValue + 20; i < 100; i+=20){
            result += " " + i + ":" + convertTo16(i);
        }
        return result;
    }
}