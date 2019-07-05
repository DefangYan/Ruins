package ruins.demo;

import java.util.*;

/**
 * @author defang.yan
 * @date 19-4-23 下午2:12
 */
public class HelloWorld {

    static int data[] = {9,6,1,2};
    public static int[] insertionSort ( int[] data){
        //插入排序
        if (data.length == 0)
            return data;
        int current;
        for (int i = 0; i < data.length - 1; i++) {
            current = data[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < data[preIndex]) {
                data[preIndex + 1] = data[preIndex];
                preIndex--;
            }
            data[preIndex + 1] = current;
        }
        return data;

    }
    //冒泡排序
    public static int[] bubble(int[] data){
        if(data.length == 0){
            return data;
        }
        int z = data.length;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z-1-i; j++) {
                if (data[j]>data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }


            }
        }
        return data;
    }

    //选择排序
    public static int[] select(int[] data){
        if(data.length == 0){
            return data;
        }
        int z = data.length;
        for (int i = 0; i < z-1; i++) {
            int minIndex = i;
            int temp;
            for (int j = i+1; j < z; j++) {
                if(data[minIndex] > data[j]){  //查找最小的数
                    minIndex = j;
                }
            }
            temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
        return data;
    }
    //归并排序
    public static int[] mergeSort(int[] data){

        return data;
    }
    public static void main(String[] args) {
//        int i = 40;
//        int i0 = 40;
//
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = "Hel" + "lo";
//        String s4 = "Hel" + new String("lo");
//        String s5 = new String("Hello");
//        String s7 = "H";
//        String s8 = "ello";
//        String s9 = s7 + s8;
//        String s10 = s7 + "ello";
//
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s9);
//        System.out.println(s1 == s10);
 //       System.out.println(Arrays.toString(HelloWorld.insertionSort(data)));
   //     System.out.println(Arrays.toString(HelloWorld.bubble(data)));
        System.out.println(Arrays.toString(HelloWorld.select(data)));
        //   项目总结：此次项目涉及到的了很多的业务，很多隐含的业务都需要在别的服务一点点挖掘。只有把业务弄得透彻，上手写代码才能够流畅。 在编写接口的时候返回数据包装成前端需要的json格式。
        //
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        HashSet<Object> objects = new HashSet<>();
        objects.add(null);

        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
        objectObjectHashMap.put(null,"w");
        objectObjectHashMap.put("",21);
//        objectObjectHashtable.put(null,"q");
        objectObjectHashtable.put("","we");
        ArrayList<Object> objects1 = new ArrayList<>();
        objects1.add(0,90);

    }
}
