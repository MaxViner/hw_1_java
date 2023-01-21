import java.util.Random;

public class Main {
    public static void main(String[] args) {
//________________генерация случайного числа__________
        int i;
        i =new Random().nextInt(2000);
        System.out.println("случайным образом получено число"+i);

        int n=0;
        int multipl=1;

//________________расчет старшего бита__________
        while (i-multipl>0) {
            n++;
            multipl*=2;
        }
        n--;
        System.out.println("старший бит числа "+i +"- "+ (n)+"("+multipl/2+")");

        int j = 0;
        int q = 0;
        int count=i;
        int under_zero_count=i;

//________________cчитаем, какой длинны нам нужны массивы__________

        while (count<Short.MAX_VALUE) {
            if (count%n==0){
                j++;
            }

            count++;
        }
        while (under_zero_count>Short.MIN_VALUE) {
            if (under_zero_count%n!=0){
                q++;
            }

            under_zero_count--;
        }


        System.out.println("на интервале от "+i+" до "+Short.MAX_VALUE+" расположено "
                +j+" чисел кратных "+n);

        System.out.println("на интервале от "+i+" до "+Short.MIN_VALUE+" расположено "
                +q+" чисел не кратных "+n);

        int[] m1;
        int[] m2;

        m1 = new int[j];
        m2 = new int[q];

        count=i;
        under_zero_count=i;

        while (count%n!=0){
            count++;
        }
        m1[0]=count;
//        System.out.print(m1[0]+", ");

        while (under_zero_count%n!=0){
            under_zero_count--;
        }
        m2[0]=under_zero_count;
//        System.out.print(m2[0]+", ");

//________________сохранения массива от i до Short.MAX_VALUE__________

        for (int k=1; k<j;k++) {

            count+=n;
            if (count%n==0){
                m1[k]=count;
//                if (k%20==0){
//                    System.out.println();
//                    System.out.print(m1[k]+", ");
//                }
//
//                System.out.print(m1[k]+", ");
            }

        }
        System.out.println();
        System.out.println("проверка__ в массиве__"+m1.length+" элементов");

//________________сохранения массива от i до Short.MIN_VALUE__________

        for (int k=1; k<q;k++) {

            under_zero_count-=n;
            if (under_zero_count%n!=0){
                m2[k]=under_zero_count;
//                if (k%20==0){
//                    System.out.println();
//                    System.out.print(m1[k]+", ");
//                }
//
//                System.out.print(m1[k]+", ");
            }

        }
        System.out.println();
        System.out.println("проверка__ в массиве__"+m2.length+" элементов");
    }

    }



