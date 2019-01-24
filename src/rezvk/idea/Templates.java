package rezvk.idea;

import java.util.ArrayList;

/**
 * @author REVK
 * @create 2019-01-23 21:25
 * @info 这个是..模板学习
 */
public class Templates {
    //模板六prsf
    private static final String NAME = "REZVK";
    //变形psf psfi psfs
    public static final int i = 1;
    public static final int j = 2;
    public static final String str = "啊哈哈";

    //模板一 psvm
    public static void main(String[] args) {
        //模板二 sout
        System.out.println("hello");
        //变形 soutp  soutm soutv  xx.sout
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("Templates.main");
        //soutv
        int num = 20;
        System.out.println("num = " + num);
        //xx.sout
        System.out.println(num);

        String[] arr = {"wk","re","hc"};
        //模板三 fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四 list.fot
        ArrayList<String> list = new ArrayList<String>();
        list.add("wk");
        list.add("vk");
        list.add("re");
        //list.for
        for (String s : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五 ifn inn xx.null xx.nn
        if (list == null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }



    }

}
