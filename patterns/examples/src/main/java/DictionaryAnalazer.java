import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by root1 on 09.08.17.
 */
public class DictionaryAnalazer {
    public static void main(String[] args) throws IOException {
        Arrays.asList("5000","10000","20000","30000","40000","50000","100000");
        Stream<String> unit = Files.lines(Paths.get("unit"));
        List<String> unitList = unit.collect(Collectors.toList());
        Stream<String> dictionary = Files.lines(Paths.get("wiki-100k.txt"));
        List<String> collect = dictionary.filter(it -> unitList.contains(it) || (it.startsWith("#!comment:") && (it.endsWith("4901 - 5000") || it.endsWith("9901 - 10000") || it.endsWith("14001 - 15000") || it.endsWith("19901 - 20000") || it.endsWith("29901 - 30000") || it.endsWith("39901 - 40000") || it.endsWith("49901 - 50000") || it.endsWith("100000"))))
                .distinct().map(DictionaryAnalazer::change).collect(Collectors.toList());
    Map<Integer,String> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String s : collect) {
            Integer integer = null;
            try {
                 integer = Integer.valueOf(s);
            }catch (NumberFormatException e){

            }
            if(integer == null){
                sb.append(s);
                sb.append(",");
            }else {
                sb.deleteCharAt(sb.toString().length()-1);
                map.put(integer,sb.toString());
                sb = new StringBuilder();
            }
        }

        map.forEach((integer, s) -> System.out.println("Top: "+getValueTT(integer) + " Count: " + s.split(",").length + " Words: " + s));
    }

    private static String getValueTT(Integer integer) {
        switch (integer){
            case 5000: return "0-5k";
            case 10000: return "5k-10k";
            case 15000: return "10k-15k";
            case 20000: return "15k-20k";
            case 30000: return "20k-30k";
            case 40000: return "30k-40k";
            case 50000: return "40k-50k";
            case 100000: return "50k-100k";
            default:
            return "";
        }
    }


    public static String change(String s){
        if(s.startsWith("#!comment:")){
          s =  s.replace("#!comment: ","").split(" - ")[1];
        }
        return s;
    }
}
