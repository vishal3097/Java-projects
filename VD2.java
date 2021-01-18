import java.util.*;
import java.util.Arrays; 
import java.util.Map; 
import java.util.List;
import java.util.TreeMap;
import java.util.HashMap; 
public class VD2 
{
 static List <String> Men = Arrays.asList(new String[]{"Victor","Wyatt","Xavier","Yancey","Zeus" });
 static List <String> Women = Arrays.asList( new String[]{ "Amy","Bertha","Clare","Diane","Erika" });
 static Map <String, List <String>> MenPreference = new HashMap <String, List<String>>()
{
private static final long s = 1L;
{
put("Victor",Arrays.asList("Bertha","Amy","Diane","Erika","Clare"));
put("Wyatt",Arrays.asList("Diane","Bertha","Amy","Clare","Erika"));
put("Xavier",Arrays.asList("Bertha","Erika","Clare","Diane","Amy"));
put("Yancey",Arrays.asList("Amy","Diane","Clare","Bertha","Erika"));
put("Zeus",Arrays.asList("Bertha","Diane","Amy","Erika","Clare"));
}
};
static Map<String, List <String>> WomenPreference = new HashMap <String, List<String>>() 
{ 
private static final long s = 1L;
{ 
put("Amy",Arrays.asList("Zeus","Victor","Wyatt","Yancey","Xavier"));
put("Bertha",Arrays.asList("Xavier","Wyatt","Yancey","Victor","Zeus"));
put("Clare",Arrays.asList("Wyatt","Xavier","Yancey","Zeus","Victor"));
put("Diane",Arrays.asList("Victor","Zeus","Yancey","Xavier","Wyatt"));
put("Erika",Arrays.asList("Yancey","Wyatt","Zeus","Xavier","Victor"));
}
};
public static void main(String[] args)
{
System.out.println("Proposal & Reject Algorithm:\n");
System.out.println("\nThe matched pairs from V to Z");
Map <String, String> pairs = match(Men, MenPreference, WomenPreference); 
for(Map.Entry <String, String> pair:pairs.entrySet())
{
System.out.println(pair.getValue() + " - "+ " "+ pair.getKey());
}
if(MPair(Women, Men, pairs, MenPreference, WomenPreference))
{
System.out.println("\n Pairs not match");
}
else
{
System.out.println("\n Pairs match");
}
}
public static Map<String, String> match(List<String> Men, Map <String, List<String>> 
MenPreference,Map <String, List<String>> WomenPreference)
{
Map <String, String> wedding = new TreeMap <String, String>(); 
List <String> freeM = new LinkedList<String>(); 
freeM.addAll(Men);
while(!freeM.isEmpty())
{
String thisM = freeM.remove(0);
List <String> thisMenPreference = MenPreference.get(thisM); 
for(String Women:thisMenPreference)
{
if(wedding.get(Women) == null)
{
wedding.put(Women, thisM); 
break;
}
else
{
String otherMen = wedding.get(Women);
List <String> thisWomenPreference = WomenPreference.get(Women); 
if(thisWomenPreference.indexOf(thisM) < thisWomenPreference.indexOf(otherMen))
{
wedding.put(Women, thisM);
freeM.add(otherMen); break;
}
}
}
}
return wedding;
}
private static boolean MPair(List<String> Men, List<String> 
Women,Map <String, String> pairs, Map <String, List <String>> MenPreference, 
Map <String, List <String>> WomenPreference) 
{
if(!pairs.keySet().containsAll(Women))
{
return false;
}
if(!pairs.values().containsAll(Men))
{
return false;
}
Map <String, String> revmatch = new TreeMap <String, String>(); 
for(Map.Entry <String, String> pair:pairs.entrySet())
{
revmatch.put(pair.getValue(), pair.getKey());
}
return true;
}
}