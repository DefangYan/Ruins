package ruins.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author defang.yan
 * @date 19-4-23 下午2:21
 */
public class Shuzushiyong {

    public static void main(String[] args) {
        String s[] = {"aa","bb","cc"};
        List<String> stringList = Arrays.asList(s);
        for (String aaa: stringList
             ) {
            System.out.println(aaa);
        }
//        stringList.add(3,"dd");//这里直接用数组aslist转换的list进行增加删除操作会报错
//        System.out.println(stringList);

        ArrayList<String> copyArrays=new ArrayList<String>(Arrays.asList(s));//这样用ArrayList构造器可以转变成有用的增删list
        copyArrays.add(3,"dd");
        for (String bbbb: copyArrays
             ) {
            System.out.println(bbbb);
        }

    }

}
