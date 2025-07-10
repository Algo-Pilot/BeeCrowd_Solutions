import java.util.Scanner;
public class Main {
    public static void main(String[] srgs) {
        Scanner x = new Scanner(System.in);
        double A = x.nextDouble();
        double B = x.nextDouble();
        double C = x.nextDouble();
        if (A == B && B == C) {
            double a = A;
            double b = B;
            double c = C;
            double sqra = Math.pow(a, 2.0);
            double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
            if (a >= (b + c)) {
                System.out.println("NAO FORMA TRIANGULO");
            }
            else {
                if (sqra == sqrbc) {
                    System.out.println("TRIANGULO RETANGULO");
                }
                if (sqra > sqrbc) {
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
                if (sqra < sqrbc) {
                    System.out.println("TRIANGULO ACUTANGULO");
                }
                System.out.println("TRIANGULO EQUILATERO");
            }
        }
        else if ((A == B || B == C) || A == C) {
            if (A == B && A > C) {
                double a = A;
                double b = B;
                double c = C;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            else if (A == B && A < C) {
                double a = C;
                double b = A;
                double c = B;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            else if (B == C && B > A) {
                double a = B;
                double b = C;
                double c = A;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            else if (B == C && B < A) {
                double a = A;
                double b = B;
                double c = C;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            else if (A == C && A > B) {
                double a = A;
                double b = C;
                double c = B;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            else if (A == C && A < B) {
                double a = B;
                double b = A;
                double c = C;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
        else if (A > B && A > C) {
            double a = A;
            if (B > C) {
                double b = B;
                double c = C;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }
            else if (C > B) {
                double b = C;
                double c = B;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }

        }
        else if (B > A && B > C) {
            double a = B;
            if (A > C) {
                double b = A;
                double c = C;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }
            else if (C > A) {
                double b = C;
                double c = A;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }
        }
        else if (C > B && C > A) {
            double a = C;
            if (A > B) {
                double b = A;
                double c = B;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }
            else if (B > A) {
                double b = B;
                double c = A;
                double sqra = Math.pow(a, 2.0);
                double sqrbc = Math.pow(b, 2.0) + Math.pow(c, 2.0);
                if (a >= (b + c)) {
                    System.out.println("NAO FORMA TRIANGULO");
                }
                else {
                    if (sqra == sqrbc) {
                        System.out.println("TRIANGULO RETANGULO");
                    }
                    if (sqra > sqrbc) {
                        System.out.println("TRIANGULO OBTUSANGULO");
                    }
                    if (sqra < sqrbc) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }
        }
    }
}
