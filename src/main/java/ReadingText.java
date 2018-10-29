package main.java;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadingText {

    public static List<String> readFileInList(String fileName)
    {

        List<String> lines = Collections.emptyList();
        try
        {
            lines =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e)
        {

            // do something
            e.printStackTrace();
        }
        return lines;
    }

    public static List<String> bearersList(List<String> l){
        Iterator<String> itr = l.iterator();
        List<String> officeBearers = new ArrayList<String>();
        String str = "";
        while (itr.hasNext())
        {
            if("OFFICE BEARERS".equalsIgnoreCase(itr.next()))
            {
                itr.next();
                while (itr.hasNext())
                {
                    str = itr.next();
                    if (!str.contains("SHAREHOLDERS")) {
                        officeBearers.add(str);
                    }
                    else return officeBearers;
                }
            }
        }
        return officeBearers;
    }

    public static Map<String,String> directorsMap(List<String> l){
        Iterator<String> itr = l.iterator();
        List<String> directorsList = new ArrayList<String>();
        String str = "";
        Map<String,String> directorMap = new HashMap<>();
        while (itr.hasNext())
        {
            str = itr.next();
            String[] singleBearerData  = str.split("  +");
            System.out.println("info---->"+singleBearerData.length);
            if(singleBearerData.length>0) {
                if(singleBearerData.length==5)
                {
                    if (singleBearerData[1].trim().equals("DIRECTOR")) {
                        directorMap.put(singleBearerData[2], singleBearerData[4]);
                    }
                }
                else if (singleBearerData.length == 4) {
                    if (singleBearerData[1].trim().equals("DIRECTOR")) {
                        directorMap.put(singleBearerData[2], singleBearerData[3]);
                    }
                }
                else if (singleBearerData.length == 3) {
                    if (singleBearerData[1].trim().equals("DIRECTOR")) {
                        directorMap.put(singleBearerData[2], "");
                    }
                }
            }
        }
        return directorMap;
    }
    public static void main(String[] args)
    {
        List<String> l = readFileInList("output.txt");
        List<String> officeBearers = bearersList(l);
        Map<String,String> directorMap = directorsMap(officeBearers);
        Set<Map.Entry<String, String>> entry = directorMap.entrySet();
        for(Map.Entry e: entry)
        {
            System.out.println(e.getKey()+"-----"+e.getValue());
        }
        /*Iterator<String> it = bearersList(l).iterator();
        while (it.hasNext())
            System.out.println(it.next());*/
    }
}
