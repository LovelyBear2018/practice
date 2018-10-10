package com.lzx.java.jvm.reflection;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;

/**
 * Created by liuzhixiong on 2018/9/12.
 */
public class TestReflect {

    public static void test(TestReflect p0,
                            List<TestReflect> p1,
                            Map<String, TestReflect> p2,
                            List<String>[] p3,
                            Map<String, TestReflect>[] p4,
                            List<? extends TestReflect> p5,
                            Map<? extends TestReflect, ? super TestReflect> p6
                            //T p7
    ) {

    }

    public static void main(String[] args) {

        Method[] methods = TestReflect.class.getMethods();

        for (int i = 0; i < methods.length; i++) {
            Method oneMethod = methods[i];

            if (oneMethod.getName().equals("test")) {
                Type[] types = oneMethod.getGenericParameterTypes();

                //第一个参数，TestReflect p0
                Class type0 = (Class) types[0];
                System.out.println("type0:" + type0.getName());

                //第二个参数，List<TestReflect> p1
                Type type1 = types[1];
                Type[] parameterizedType1 = ((ParameterizedType) type1).getActualTypeArguments();
                Class parameterizedType1_0 = (Class) parameterizedType1[0];
                System.out.println("parameterizedType1_0:" + parameterizedType1_0.getName());

                //第三个参数，Map<String,TestReflect> p2
                Type type2 = types[2];
                Type[] parameterizedType2 = ((ParameterizedType) type2).getActualTypeArguments();
                Class parameterizedType2_0 = (Class) parameterizedType2[0];
                System.out.println("parameterizedType2_0:" + parameterizedType2_0.getName());
                Class parameterizedType2_1 = (Class) parameterizedType2[1];
                System.out.println("parameterizedType2_1:" + parameterizedType2_1.getName());


                //第四个参数，List<String>[] p3
                Type type3 = types[3];
                Type genericArrayType3 = ((GenericArrayType) type3).getGenericComponentType();
                ParameterizedType parameterizedType3 = (ParameterizedType) genericArrayType3;
                Type[] parameterizedType3Arr = parameterizedType3.getActualTypeArguments();
                Class class3 = (Class) parameterizedType3Arr[0];
                System.out.println("class3:" + class3.getName());

                //第五个参数，Map<String,TestReflect>[] p4
                Type type4 = types[4];
                Type genericArrayType4 = ((GenericArrayType) type4).getGenericComponentType();
                ParameterizedType parameterizedType4 = (ParameterizedType) genericArrayType4;
                Type[] parameterizedType4Arr = parameterizedType4.getActualTypeArguments();
                Class class4_0 = (Class) parameterizedType4Arr[0];
                System.out.println("class4_0:" + class4_0.getName());
                Class class4_1 = (Class) parameterizedType4Arr[1];
                System.out.println("class4_1:" + class4_1.getName());


                //第六个参数，List<? extends TestReflect> p5
                Type type5 = types[5];
                Type[] parameterizedType5 = ((ParameterizedType) type5).getActualTypeArguments();
                Type[] parameterizedType5_0_upper = ((WildcardType) parameterizedType5[0]).getUpperBounds();
                Type[] parameterizedType5_0_lower = ((WildcardType) parameterizedType5[0]).getLowerBounds();

                //第七个参数，Map<? extends TestReflect,? super TestReflect> p6
                Type type6 = types[6];
                Type[] parameterizedType6 = ((ParameterizedType) type6).getActualTypeArguments();
                Type[] parameterizedType6_0_upper = ((WildcardType) parameterizedType6[0]).getUpperBounds();
                Type[] parameterizedType6_0_lower = ((WildcardType) parameterizedType6[0]).getLowerBounds();
                Type[] parameterizedType6_1_upper = ((WildcardType) parameterizedType6[1]).getUpperBounds();
                Type[] parameterizedType6_1_lower = ((WildcardType) parameterizedType6[1]).getLowerBounds();

            }


        }

    }
}
