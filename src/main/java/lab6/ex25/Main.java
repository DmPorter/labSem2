package lab6.ex25;

import lab6.ex1.Stack;

import java.io.Closeable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            Method method1 = Tests.class.getMethod("close", Closeable.class, Closeable.class);
            System.out.println(genericDeclaration(method1));

            Method method2 = Tests.class.getMethod("returnValue", Object.class);
            System.out.println(genericDeclaration(method2));

            Method method3 = Tests.class.getMethod("close", Closeable.class, Closeable.class, Integer.class);
            System.out.println(genericDeclaration(method3));

            Method method4 = Tests.class.getMethod("returnValue", List.class);
            System.out.println(genericDeclaration(method4));

            Method method5 = Tests.class.getMethod("test", Stack.class);
            System.out.println(genericDeclaration(method5));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static String genericDeclaration(Method m){
        StringBuilder stringBuilder = new StringBuilder();
        Type[] typesGenericParam = m.getGenericParameterTypes();
        Type[] typesParam = m.getParameterTypes();


        Map<Type, Type> typesGenericMap = new HashMap<>();
        Map<Type, Type> typesMap = new HashMap<>();

        for(int i = 0; i < typesGenericParam.length; i++){
            if(typesGenericParam[i] != typesParam[i]){
                typesGenericMap.put(typesGenericParam[i], typesParam[i]);
            }else{
                typesMap.put(typesGenericParam[i], typesParam[i]);
            }
        }
        if(typesGenericParam.length != 0) {
            stringBuilder.append("<");
            int curr = 0;
            for(var val: typesGenericMap.keySet()){
                stringBuilder.append(val);
                if (typesGenericMap.get(val) != Object.class) {
                    stringBuilder.append(" extend ").append(typesGenericMap.get(val).getTypeName());
                }
                if (curr == typesGenericMap.keySet().size() - 1) {
                    stringBuilder.append(">");
                } else {
                    stringBuilder.append(", ");
                }
                curr++;
            }
        }

        stringBuilder.append(" ").append(m.getGenericReturnType()).append(" ")
                .append(m.getName()).append("(");

        if(typesGenericMap.size() != 0){
            int curr = 0;
            for(var val: typesGenericMap.keySet()){
                stringBuilder.append(val);
                if(curr != typesGenericMap.size() - 1){
                    stringBuilder.append(", ");
                }else if(curr == typesGenericMap.size() - 1 && typesMap.size() != 0){
                    stringBuilder.append(", ");
                }else{
                    stringBuilder.append(")");
                }
                curr++;
            }
        }
        if(typesMap.size() != 0) {
            int curr = 0;
            for (var val : typesMap.values()) {
                stringBuilder.append(val.getTypeName());
                if(curr == typesMap.values().size() - 1){
                    stringBuilder.append(")");
                }else{
                    stringBuilder.append(", ");
                }
                curr++;
            }

        }
        return stringBuilder.toString();
    }

}
