/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laclassecongruenzadiamodulon;

/**
 *
 * @author Administrator
 */
public class LaClasseCongruenzaDiAModuloN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * 模算数（modular arithmetic）是一个整数的算术系统
         * 模算数常见的应用是在十二小时制
         * 模算数在数论、群论、环论、纽结理论、抽象代数、电脑代数、密码学、计算机科学及化学中都有使用
         * 模算数也常作为识别码的校验码。例如国际银行账户号码（IBAN）就用模97的余数来避免输入编号时的错误
         */
        System.out.println("LA CLASSE CONGRUENZA DI a MODULO n");
        GestioneIO io = new GestioneIO();
        int inputOP;
        final int numberOfCase = 4;
        do {
            inputOP = io.inputOpzinoe();
            if (inputOP < 0 || inputOP > numberOfCase) {
                System.out.println("Non esiste opzione [" + inputOP + "]...riprova");
            } else {
                int a, b, n, risultato;
                switch (inputOP) {
                    case 1://calc
                        a = io.inputValore("A");
                        b = io.inputValore("B");
                        n = io.inputValore("MODULO");
                        System.out.println("[" + a + "]=[" + b + "]\t(MODULO " + n + ")");
                        risultato = a - b;
                        System.out.println("[" + risultato + "]\t(MODULO " + n + ")");
                        System.out.println("[" + risultato % n + "]\t(MODULO " + n + ")");
                        break;
                    case 2://addizione
                        a = io.inputValore("A");
                        b = io.inputValore("B");
                        n = io.inputValore("MODULO");
                        System.out.println("[" + a + "]+[" + b + "]\t(MODULO " + n + ")");
                        risultato = a + b;
                        System.out.println("[" + risultato + "]\t(MODULO " + n + ")");
                        System.out.println("[" + risultato % n + "]\t(MODULO " + n + ")");
                        break;
                    case 3://moltiplicazione
                        a = io.inputValore("A");
                        b = io.inputValore("B");
                        n = io.inputValore("MODULO");
                        System.out.println("[" + a + "]*[" + b + "]\t(MODULO " + n + ")");
                        risultato = a * b;
                        System.out.println("[" + risultato + "]\t(MODULO " + n + ")");
                        System.out.println("[" + risultato % n + "]\t(MODULO " + n + ")");
                        break;
                    case 4://stampa la tavola
                        n = io.inputValore("MODULO");
                        for (int i = -1; i <= n; i++) {
                            if (i == -1) {
                                System.out.print("\u001B[34m" + "+\t" + "\u001B[34m");
                            } else {
                                System.out.print("\u001B[31m" + "[" + i + "]" + n + "\t" + "\u001B[31m");
                            }
                            for (int j = -1; j < n; j++) {
                                if (i == -1) {
                                    System.out.print("\u001B[31m" + "[" + (j + 1) + "]" + n + "\t" + "\u001B[31m");
                                } else {
                                    int calc = (j + 1) + (i);
                                    System.out.print("\u001B[32m" + "[" + calc % n + "]" + n + "\t" + "\u001B[32m");
                                }
                            }
                            System.out.println("");
                        }
                        System.out.println("---------------------------");
                        for (int i = -1; i <= n; i++) {
                            if (i == -1) {
                                System.out.print("\u001B[34m" + "*\t" + "\u001B[34m");
                            } else {
                                System.out.print("\u001B[31m" + "[" + i + "]" + n + "\t" + "\u001B[31m");
                            }
                            for (int j = -1; j < n; j++) {
                                if (i == -1) {
                                    System.out.print("\u001B[31m" + "[" + (j + 1) + "]" + n + "\t" + "\u001B[31m");
                                } else {
                                    int calc = (j + 1) * (i);
                                    System.out.print("\u001B[32m" + "[" + calc % n + "]" + n + "\t" + "\u001B[32m");
                                }
                            }
                            System.out.println("");
                        }
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            }
            if (inputOP == 0) {
                break;
            }
        } while (inputOP > 0 || inputOP < numberOfCase);
    }
}
