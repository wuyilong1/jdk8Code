package test;

import java.util.HashMap;

/**
 * @Description
 * @Author WuYiLong
 * @Date 2022/1/5 9:11
 */
public class THashMap {

    public static void main(String[] args) {
        // 构造函数
        HashMap<String, Object> map = new HashMap(7);
        map.put("张三","张三");
        map.put("李四","李四");
        map.put("张三1","张三1");
        map.put("张三2","张三2");
        map.put("张三3","张三3");
        map.put("张三4","张三4");
        map.put("张三5","张三5");
        map.put("张三6","张三6");
        map.put("张三7","张三4");
        map.put("张三8","张三5");
        map.put("张三10","张三6");
        HashMap hashMap = new HashMap();
        HashMap<String, Object> map1 = new HashMap<>(14);

        HashMap<String, Object> map2 = new HashMap<>(map);


        // 常用方法
        System.out.println("*********计算hash值："+hash("测试"));

    }

    // 计算hash值
    private static int hash(Object key) {
        int h;
        h = key.hashCode();
        return (key == null) ? 0 : (h) ^ (h >>> 16);
    }

}
