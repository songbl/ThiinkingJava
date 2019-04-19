package test;

import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("name","xiaolong");
        hashMap.put("name","hahha");
        System.out.println("测试"+hashMap.get("name"));
    }
}
