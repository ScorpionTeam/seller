package com.scopion.seller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ycj
 * @version V1.0 <>
 * @date 2017-12-07 14:46
 */
public class Test {

    public static void main(String[] args) {
        /**
         "params": {
         "modules": ["NORM"], // 数组，枚举[PhrMyUsersAuthority.Module],模块
         "memberId": 966 // 用户id,phr_member
         }
         */
        List<String> arr = new ArrayList<>();
        arr.add("NORM");
        arr.add("NORM2222");
        ParamsBean t = new ParamsBean(arr, 76890776);
        String res = JSON.toJSONString(t);
//        {"memberId":76890776,"modules":["NORM","NORM2222"]}
        System.out.println(res);

    }

    static class ParamsBean {
        List<String> modules;
        int memberId;

        public ParamsBean() {
        }

        public ParamsBean(List<String> modules, int memberId) {
            this.modules = modules;
            this.memberId = memberId;
        }

        public List<String> getModules() {
            return modules;
        }

        public void setModules(List<String> modules) {
            this.modules = modules;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        @Override
        public String toString() {
            return "TestBean{" +
                    "modules=" + modules +
                    ", memberId=" + memberId +
                    '}';
        }
    }
}
