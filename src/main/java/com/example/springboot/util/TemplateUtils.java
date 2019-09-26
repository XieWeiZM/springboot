package com.example.springboot.util;

import com.alibaba.fastjson.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Archer
 * @date 2019-09-03
 */
public class TemplateUtils {
    /**
     * 变量匹配
     */
    private static Pattern PARAM_PATTERN = Pattern.compile("\\$\\{(.*?)\\}");


    /**
     * @param params   是个 json 字符串  可以有多余的 数据 没关系 只要和模板中的 占位符 匹配上就可以 替换
     * @param template
     * @return
     */
    public static String convert(String params, String template) {
        JSONObject jsonObject = JSONObject.parseObject(params);
        while (template.contains("${")) {
            Matcher matcher = PARAM_PATTERN.matcher(template);
            if (matcher.find()) {
                String ele = matcher.group(1);
                if (jsonObject.containsKey(ele)) {
                    template = template.replaceFirst("\\$\\{" + ele + "\\}", jsonObject.getString(ele));
                } else {
                    throw new RuntimeException("template can not be converted");
                }
            }
        }
        return template;
    }

    /**
     * 调接口 拿到当前场景的 模板 内容  一个场景 尽可能 多种语言 的模板  前端 自己 判断下选哪个    最终 得到自己想要的那个精确的模板
     *
     * @return
     */
    public static String getTemplate() {
        //掉接口 获得到 对应的模板
        return "[أسبق] سوف يأتي مندوبنا ${mobile} لإستلام شحنة  ${waybillNo} ، يرجى طباعة و لصق بوليصة الشحن و تجهيز الشحنة لإستلامها. خدمة العملاء: 920033115";
    }


    public static void main(String[] args) {
        //参数  模板  转成的  替换后 的数据
        String convert = convert("{\"waybillNo\":\"500000\",\"mobile\":\"1836808030\"}", getTemplate());
        System.out.println(convert);

    }
}
