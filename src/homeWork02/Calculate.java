package homeWork02;


public class Calculate {

    private int sum(int[] array) {
        int sum = 0;
        for (int Array : array) {
            sum += Array;
        }
        return sum;
    }

    private double sum(double[] array) {
        double sum = 0;
        for (double Array : array) {
            sum += Array;
        }
        return sum;
    }

    private int min(int[] array) {
        int min = 0;
        for (int Array : array) {
            if (Array < min)
                min = Array;
        }
        return min;
    }

    private double min(double[] array) {
        double min = 0;
        for (double Array : array) {
            if (Array < min)
                min = Array;
        }
        return min;
    }

    private int max(int[] array) {
        int max = 0;
        for (int Array : array) {
            if (Array > max)
                max = Array;
        }
        return max;
    }

    private double max(double[] array) {
        double max = 0;
        for (double Array : array) {
            if (Array > max)
                max = Array;
        }
        return max;
    }

    private int maxPositive(int[] array) {
        int maxP = 0;
        for (int Array : array) {
            if (Array >= 0) {
                if (maxP < Array) {
                    maxP = Array;
                }
            }
        }
        return maxP;
    }

    private double maxPositive(double[] array) {
        double maxP = 0;
        for (double Array : array) {
            if (Array >= 0) {
                if (maxP < Array) {
                    maxP = Array;
                }
            }
        }
        return maxP;
    }

    private int multiplication(int[] array) {
        int mlt = 0;
        for (int i = 1; i < array.length; i++) {
            mlt *= array[i];
        }
        return mlt;
    }

    private double multiplication(double[] array) {
        double mlt = 0;
        for (int i = 1; i < array.length; i++) {
            mlt *= array[i];
        }
        return mlt;
    }

    private int modulus(int[] array) {
        int lastElement = array[0], firstElement = array[array.length - 1];
        return lastElement % firstElement;
    }

    private double modulus(double[] array) {
        double lastElament = array[0], firstElement = array[array.length - 1];
        return lastElament % firstElement;
    }

    private int secondLargest(int[] array) {
        int Max = array[0];
        int smax = array[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > Max) {
                smax = Max;
                Max = array[i];
            } else if (array[i] > smax) {
                smax = array[i];
            }
        }
        return smax;
    }

    private double secondLargest(double[] array) {
        double Max = array[0];
        double smax = array[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > Max) {
                smax = Max;
                Max = array[i];
            } else if (array[i] > smax) {
                smax = array[i];
            }
        }
        return smax;
    }


    public static void main(String[] args) {
        int[] iArray = {11, 7, 55, 8, -5, 24, -38, 19, 43, -1};
        double[] dArray = {58.1, -35.53, 43.7, -2.5, 7.9, -26.7, 11.1, -77.78, 3.5, 17.2};
        Calculate arr = new Calculate();
        System.out.println("Sum int: " + arr.sum(iArray));
        System.out.println("Sum double: " + arr.sum(dArray));
        System.out.println("Min int: " + arr.min(iArray));
        System.out.println("Min double: " + arr.min(dArray));
        System.out.println("Max int: " + arr.max(iArray));
        System.out.println("Max double: " + arr.max(dArray));
        System.out.println("MaxPositive int: " + arr.maxPositive(iArray));
        System.out.println("MaxPositive double: " + arr.maxPositive(dArray));
        System.out.println("Multiplication int: " + arr.multiplication(iArray));
        System.out.println("Multiplication double: " + arr.multiplication(dArray));
        System.out.println("Modulus int: " + arr.modulus(iArray));
        System.out.println("Modulus double: " + arr.modulus(dArray));
        System.out.println("SecondLargest int: " + arr.secondLargest(iArray));
        System.out.println("SecondLargest double: " + arr.secondLargest(dArray));


    }
}
