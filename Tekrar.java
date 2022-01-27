import java.util.Arrays;

/**
 * @author fatih-git
 * */

public class Tekrar {

    public static void main(String[] args) {

        int[] list={10,3,7,3,3,2,9,10,21,1,33,9,1,31,31,7,41,55,10,11};
        int[] kontrol=new int[list.length];
        int temp;
        boolean check=false;

        for (int i=0; i<list.length-1; i++){

            temp=list[i];

            for (int j=i+1; j< list.length; j++){

                if (check){
                    break;
                }else if (temp==list[j]){

                    kontrol[i]=temp;
                    System.out.println(temp+" sayısı tekrar etmektedir.");
                    break;

                }

            }

            check=false;

            for (int k=0; k< list.length; k++){

                if (kontrol[k]== list[i+1]){
                    check=true;
                    break;
                }

            }

        }

    }

}
