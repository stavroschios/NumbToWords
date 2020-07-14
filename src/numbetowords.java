public class numbetowords {
    public static void main(String[] args) {

        numberToWords(10109);  // one zero one zero nine

        }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        int count = getDigitCount(number);
        String finalNum= "";

        while (count > 0) {
            int lastDigit = reverseNumber % 10;
            reverseNumber /= 10;

            switch (lastDigit) {
                case 0:
                    //System.out.println("Zero");
                    finalNum +="Zero ";
                    break;
                case 1:
                   // System.out.println("One");
                    finalNum +="One ";
                    break;
                case 2:
                    //System.out.println("Two");
                    finalNum +="Two ";
                    break;
                case 3:
                   // System.out.println("Three");
                    finalNum +="Three ";
                    break;
                case 4:
                  //  System.out.println("Four");
                    finalNum +="Four ";
                    break;
                case 5:
                  //  System.out.println("Five");
                    finalNum +="Five ";
                    break;
                case 6:
                   // System.out.println("Six");
                    finalNum +="Six ";
                    break;
                case 7:
                //    System.out.println("Seven");
                    finalNum +="Seven ";
                    break;
                case 8:
                    //System.out.println("Eight");
                    finalNum +="Eight ";
                    break;
                case 9:
                   // System.out.println("Nine");
                    finalNum +="Nine ";
                    break;
                default:
                    System.out.println("Invalid value");

            }
            count--;
        }
        System.out.println(finalNum);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;
            number /= 10;
            if (number != 0) {
                reverse = reverse * 10;
            }
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        } else {
            int count = 0;
            while (number > 0) {
                count += 1;
                number /= 10;
            }
            return count;
        }
    }
}

//    public static void numberToWrds(int number) {
//        int number2 = reverse(number);
//        int count = getDigitCount(number);
//        int reverse =0 ;
//        String fullNum = " ";
//        if (number2 < 0)
//            System.out.println("Invalid Number");
//
//
//
//        while(number2 > 0 ){
//
//            int lastDigit = number2 % 10;
//            reverse *= 10;
//            reverse = lastDigit;
//            number2 /= 10;
//
//            if(reverse == 0) {
//                fullNum += "zero ";
//
//            }
//            if(reverse == 1) {
//             //   System.out.println("one ");
//                fullNum += "one ";
//
//            }
//
//            else if (reverse == 2) {
//            //    System.out.println("two ");
//                fullNum += "two ";
//
//            }
//            else  if(reverse == 3) {
//             //   System.out.println("three ");
//                fullNum += "three ";
//
//            }
//
//            else  if(reverse == 4) {
//           //     System.out.println("four ");
//                fullNum += "four ";
//            }
//
//            else  if(reverse == 5) {
//            //    System.out.println(" five ");
//                fullNum += "five ";
//
//            }
//            else
//                break;
//
//
//            count--;
//
//
//
//        }
//        System.out.println(fullNum);
//
//
//
//    }
//
//    public static int reverse(int number){
//
//            int reversed = 0;
//            while(number != 0){
//
//                int lastdigit = number % 10;
//                reversed *= 10;
//                reversed += lastdigit;
//                number /= 10;
//
//
//
//
//            }
//
//        return reversed;
//    }
//
//    public static int getDigitCount(int number) {
//        if(number <0){
//            return -1;
//        }
//
//        if(number == 1)
//            return 1;
//
//        int counter =0;
//
//        while(number > 0){
//            int reverse = number % 10;
//            counter++;
//            number /= 10;
//
//        }
//        return counter;
//    }


