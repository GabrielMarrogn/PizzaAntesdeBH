import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String[] arr = new String[b];
            boolean errado = false;

            for (int i = 0; i < b; i++) {
                String c = sc.nextLine();
                arr[i] = c;
            }

            for (int i = 0; i < b; i++) {
                String[] temp = arr[i].split(" ");
                String data = temp[0];
                boolean test = true;

                for (int k = 1; k <= a; k++) {
                    int convert = Integer.parseInt(temp[k]);

                    if (convert == 0) {
                        test = false;
                    }
                }

                if (test == true) {
                    System.out.println(data);
                    errado = true;
                    break;
                }

                if(errado == true){
                    break;
                }
            }

            if (errado == false) {
                System.out.println("Pizza antes de FdI");
            }

        }
        sc.close();
    }
}
